/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.services;

/**
 *
 * @author Bolaji
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.allianz.dto.CoverLivesDTO;
import com.allianz.dto.CustomerTbDTO;
import com.allianz.dto.DataDTO;
import com.allianz.dto.GenerateNumberDTO;
import com.allianz.dto.PolhDetailCompleteDTO;
import com.allianz.dto.PolhDetlDTO;
import com.allianz.dto.ProductTbDTO;
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.allianz.entities.TmpUssdData;
import com.allianz.dto.TmpUssdDataDTO;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class TmpUssdDataLogic extends AbstractFacade<TmpUssdData> {

    EntityManager em;
    private Query query;

    public TmpUssdDataLogic() {
        super(TmpUssdData.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<TmpUssdDataDTO> getTmpUssdData() {
        List<TmpUssdDataDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("TmpUssdData.findAll");
            //query.setParameter("fieldname", fieldname);

            List<TmpUssdData> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                TmpUssdDataDTO dmodel = new TmpUssdDataDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public Long getLastCustomerId() {
        Long custSysId = 0L;
        try {
            query = this.em.createNativeQuery("SELECT @seq_id SEQ");
            custSysId = (Long) query.setMaxResults(1).getSingleResult();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return custSysId;
    }

    public Long getLastPolicyId() {
        Long polhSysId = 0L;
        try {
            query = this.em.createNativeQuery("SELECT @pol_seq SEQ");
            polhSysId = (Long) query.setMaxResults(1).getSingleResult();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return polhSysId;
    }

    public TmpUssdDataDTO getTmpUssdDataByMobile(String mobile) {
        TmpUssdDataDTO dmodel = new TmpUssdDataDTO();

        try {
            query = getEM().createNamedQuery("TmpUssdData.findByMobile");
            query.setParameter("mobile", mobile);

            TmpUssdData dropdown = (TmpUssdData) query.setMaxResults(1).getSingleResult();
            dmodel = new TmpUssdDataDTO(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveTmpUssdData(TmpUssdDataDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            TmpUssdData caccess = new TmpUssdData(dmodel);
            if (dmodel.getScreenNo() == 1) {
                this.deleteTmpUssdData(dmodel);
            }
            getEM().getTransaction().begin();

            if (dmodel.getId() == 0) {
                create(caccess);
                result = "TmpUssdData created successfully...";
            } else {
                edit(caccess);
                result = "TmpUssdData updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String getRelCategory(int polhSysid, String category) {
        String assuredId = null;

        try {
            query = this.em.createNativeQuery("SELECT  DISTINCT(PRTL_ASSURED_ID) FROM allzmenu.PRODUCT_RATE_DL "
                    + "WHERE PRTL_PPT_SYSID = (SELECT POLH_PLN_SYSID FROM ALLZTRNX.POLH_DETL WHERE POLH_SYSID IN (?)) "
                    + "AND PRTL_ASSURED_ID <> 1 and PRTL_ASSURED_DESC = ? ORDER BY PRTL_ASSURED_ID");
            query.setParameter(1, polhSysid);
            query.setParameter(2, category);
            assuredId = (String) query.setMaxResults(1).getSingleResult();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return assuredId;
    }

    public String getCalType(String productId) {
        String calType = null;

        try {
            query = this.em.createNativeQuery("SELECT cal_type FROM allzitc.cal_type_setup where product_id = ?");
            query.setParameter(1, productId);
            calType = (String) query.setMaxResults(1).getSingleResult();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return calType;
    }

    public String saveRegistrationData(TmpUssdDataDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            CustomerTbDTO cusDTO = new CustomerTbLogic().getCustomerByIdNo(dmodel.getValue5());
            String[] idType = {"Voters ID", "Passport", "Drivers License", "SSNIT"};
            String[] pdtFrequency = {"MONTHLY", "QUARTERLY", "HALF-YEARLY", "YEARLY", "DAILY", "WEEKLY"};
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MMMyy");
            String calType = this.getCalType(dmodel.getValue7());
            int freq = Arrays.asList(pdtFrequency).indexOf(dmodel.getValue11()) + 1;
            String planid = dmodel.getValue12();
            String[] trusteeName = dmodel.getValue8().split(" ");
            String agentId = dmodel.getValue21() == null ? "2":dmodel.getValue21();
            if (cusDTO.getCustomerTbPK().getCusSysid() == 0) {
                getEM().getTransaction().begin();
                query = this.em.createNativeQuery("{CALL allzmenu.CLIENT_INFO_PROC(@seq_id,null,?,null,?,null,?,?,?,null,null,null,?,?,null,?,?,null,null,null,null,null,null,null,null,null,null,null,NULL,NULL,'I')}");
                query.setParameter(1, Integer.parseInt(agentId));
                query.setParameter(2, dmodel.getValue3());
                query.setParameter(3, dmodel.getValue2());
                query.setParameter(4, dmodel.getValue4());
                query.setParameter(5, new SimpleDateFormat("dd-mm-yyyy").format(new SimpleDateFormat("yyyy-mm-dd").parse(dmodel.getValue6())));
                query.setParameter(6, "0" + dmodel.getMobile().substring(3));
                query.setParameter(7, "0" + dmodel.getMobile().substring(3));
                query.setParameter(8, idType[Integer.parseInt(dmodel.getValue1() == null ? "1":dmodel.getValue1()) - 1]);
                query.setParameter(9, dmodel.getValue5());
                query.executeUpdate();
                getEM().getTransaction().commit();
                cusDTO.getCustomerTbPK().setCusSysid(Integer.parseInt(String.valueOf(this.getLastCustomerId())));
            }
            getEM().getTransaction().begin();
            query = this.em.createNativeQuery("{CALL allzmenu.POLICY_INFO_PROC(@pol_seq,null,?,?,?,NULL,?,?,?,?,NULL,NULL,NULL,NULL,?,?,?,'1',NULL,'1','1',?,'1',null,null,null,null,null,null,?,NULL,'I')}");
            query.setParameter(1, cusDTO.getCustomerTbPK().getCusSysid()); //cusid
            query.setParameter(2, dmodel.getValue7()); //productid
            query.setParameter(3, agentId); //agentuserid
            query.setParameter(4, LocalDate.now().format(outputFormat).toUpperCase()); //deductiondate
            query.setParameter(5, dmodel.getValue13()); //term
            query.setParameter(6, dmodel.getValue14()); //sumassured
            query.setParameter(7, ("42".equals(dmodel.getValue7()) || "43".equals(dmodel.getValue7())) ? Double.parseDouble(dmodel.getValue15()) : 0);
            query.setParameter(8, ("81".equals(dmodel.getValue7()) || "82".equals(dmodel.getValue7()) || "83".equals(dmodel.getValue7())) ? Double.parseDouble(dmodel.getValue15()) : 0);
            query.setParameter(9, calType);
            query.setParameter(10, planid);
            query.setParameter(11, freq);
            query.setParameter(12, "0" + dmodel.getMobile().substring(3));
            query.executeUpdate();
            getEM().getTransaction().commit();
            int polhSysid = Integer.parseInt(String.valueOf(this.getLastPolicyId()));
            PolhDetlDTO polhDTO = new PolhDetlLogic().getPolhDetlByPolhSysID(polhSysid);
            new PolhDetailCompleteLogic().savePolhDetailComplete(new PolhDetailCompleteDTO(0, polhDTO.getPolhNum(), "1"));
            ProductTbDTO pdtDTO = new ProductTbLogic().getProductTbByProdSysId(Integer.parseInt(dmodel.getValue7()));
            if ("Y".equals(pdtDTO.getPdtPlnDepent()) && dmodel.getValue22() != null) {
                CoverLivesDTO clDTO = new CoverLivesLogic().getCoverLivesByRelationship(dmodel.getValue22());
                String coverId = this.getRelCategory(polhSysid, clDTO.getCategory());
                String[] dependantName = dmodel.getValue23().split(" ");
                getEM().getTransaction().begin();
                query = this.em.createNativeQuery("{CALL allzmenu.DEPENDANT_INFO_PROC(null,?,?,?,NULL,?,'2',?,?,?,?,?,null,NULL,'2',NULL,'I')}");
                query.setParameter(1, polhSysid);
                query.setParameter(2, dmodel.getValue7());
                query.setParameter(3, planid);
                query.setParameter(4, ("81".equals(dmodel.getValue7()) || "82".equals(dmodel.getValue7())) ? "7" : coverId);
                query.setParameter(5, freq);
                query.setParameter(6, (dependantName.length > 1 ? dependantName[1] : null));
                query.setParameter(7, (dependantName.length >= 1 ? dependantName[0] : null));
                query.setParameter(8, dmodel.getValue24());
                query.setParameter(9, dmodel.getValue25());
                query.executeUpdate();
                getEM().getTransaction().commit();

            }
            getEM().getTransaction().begin();
            query = this.em.createNativeQuery("{CALL allzmenu.BENEFICIARY_INFO_PROC(null,?,'2',?,?,?,?,null,null,?,NULL,'2',NULL,'I')}");
            query.setParameter(1, polhSysid);
            query.setParameter(2, (trusteeName.length >= 1 ? trusteeName[0] : null));
            query.setParameter(3, (trusteeName.length > 1 ? trusteeName[1] : null));
            query.setParameter(4, dmodel.getValue9());
            query.setParameter(5, dmodel.getValue10());
            query.setParameter(6, dmodel.getValue18());
            query.executeUpdate();
            getEM().getTransaction().commit();

            GenerateNumberLogic gnLogic = new GenerateNumberLogic();
            GenerateNumberDTO gnDTO = gnLogic.getGenerateNumberByIndex(1);
            gnDTO.setGenerateApi(String.valueOf(Integer.parseInt(gnDTO.getGenerateApi()) + 1));
            gnLogic.saveGenerateNumber(gnDTO);
            if ("MTN".equals(dmodel.getValue19()) && "1".equals(dmodel.getValue16())) {
                DataDTO dDTO = new DataDTO("3", dmodel.getMobile(), dmodel.getValue15(), dmodel.getValue19(), dmodel.getValue11(), "1", LocalDate.now().toString(),
                        LocalDate.now().withMonth(LocalDate.now().getMonthValue() + 1).withDayOfMonth(1).toString(), "30", gnDTO.getGenerateApi() + "-" + polhDTO.getPolhNum(),
                        "c1SpFDs1ONN0SjawWMkYawwOAWAAu2Lb");
                this.postITCData("http://68.169.63.40:6969/mobiledebit/create/mandate", dDTO);
            } else {
                DataDTO dDTO = new DataDTO("1", dmodel.getValue19(), "R09u4zJkYuNcZHGs6s3I7Dv5repVIf9x", gnDTO.getGenerateApi() + "-" + polhDTO.getPolhNum(), dmodel.getMobile(),
                        dmodel.getValue15(), "Debit " + dmodel.getValue19() + " Customer");
                this.postITCDataWithSSL("https://uniwallet.transflowitc.com/uniwallet/debit/customer", dDTO);
            }
            PolhDetailCompleteDTO pcomDTO = new PolhDetailCompleteLogic().getPolhDetailCompleteByPolhNum(polhDTO.getPolhNum());
            pcomDTO.setItcPolSent(gnDTO.getGenerateApi() + "-" + polhDTO.getPolhNum());
            pcomDTO.setItcPolAmount(dmodel.getValue15());
            pcomDTO.setItcPolFreq(dmodel.getValue11());
            pcomDTO.setItcDeductionType("1".equals(dmodel.getValue16()) ? "Auto deduction" : "One time deduction");
            new PolhDetailCompleteLogic().savePolhDetailComplete(pcomDTO);
            new PolhDetlLogic().updatePolhDetails(dmodel.getValue19(), polhDTO.getPolhNum());
            result = "registration completed successfully...";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public void postITCData(String ur, DataDTO itcData) throws IOException {
        try {
            URL url = new URL(ur);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            String postJsonData = itcData.toString();

            // Send post request
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postJsonData);
            wr.flush();
            wr.close();
            System.out.println(con);
            int responseCode = con.getResponseCode();
            System.out.println("nSending 'POST' request to URL : " + url);
            System.out.println("Post Data : " + postJsonData);
            System.out.println("Response Code : " + responseCode);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(con.getInputStream()));
//        String output;
//        StringBuffer response = new StringBuffer();
//
//        while ((output = in.readLine()) != null) {
//            response.append(output);
//        }
//        in.close();
//
//        String res = String.valueOf(response);
//        return res;
    }

    public void postITCDataWithSSL(String ur, DataDTO itcData) throws IOException {
        try {
            URL url = new URL(ur);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            String postJsonData = itcData.toString();

            // Send post request
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postJsonData);
            wr.flush();
            wr.close();
            System.out.println(con);
            int responseCode = con.getResponseCode();
            System.out.println("nSending 'POST' request to URL : " + url);
            System.out.println("Post Data : " + postJsonData);
            System.out.println("Response Code : " + responseCode);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//        System.out.println(con);
//        int responseCode = con.getResponseCode();
//        System.out.println("nSending 'POST' request to URL : " + url);
//        System.out.println("Post Data : " + postJsonData);
//        System.out.println("Response Code : " + responseCode);
//
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(con.getInputStream()));
//        String output;
//        StringBuffer response = new StringBuffer();
//
//        while ((output = in.readLine()) != null) {
//            response.append(output);
//        }
//        in.close();
//
//        String res = String.valueOf(response);
//        return res;
    }

    public String deleteTmpUssdData(TmpUssdDataDTO csamodel) {
        String result = "There was a problem...";
        try {
            getEM().getTransaction().begin();
            query = getEM().createNamedQuery("TmpUssdData.deleteByMobile");
            query.setParameter("mobile", csamodel.getMobile());
            query.executeUpdate();
            getEM().getTransaction().commit();
            result = "TmpUssdDataDTO deleted successfully...";

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        return result;
    }

}
