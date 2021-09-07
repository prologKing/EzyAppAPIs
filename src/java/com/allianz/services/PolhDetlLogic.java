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
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.allianz.entities.PolhDetl;
import com.allianz.dto.PolhDetlDTO;
import com.allianz.dto.PolicyInfoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PolhDetlLogic extends AbstractFacade<PolhDetl> {
    EntityManager em;
    private Query query;

    public PolhDetlLogic() {
        super(PolhDetl.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolhDetlDTO> getPolhDetl() {
        List<PolhDetlDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhDetl.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhDetl> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                PolhDetlDTO dmodel = new PolhDetlDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<PolicyInfoDTO> getProductByCustMobile(String mobile) {
       List<PolicyInfoDTO> dlist = new ArrayList<>();
        try {
            query = this.em.createNativeQuery("SELECT a.POLH_NUM ,b.PDT_NAME, a.POLH_PDT_SYSID FROM ALLZTRNX.POLH_DETL a  join ALLZMENU.PRODUCT_TB b " +
             "on a.POLH_PDT_SYSID = b.PDT_SYSID join allztrnx.customer_tb c " +
             "on a.POLH_CUS_SYSID = c.CUS_SYSID join ALLZTRNX.pay_detl d on a.POLH_SYSID = d.PYMT_POLH_SYSID " +
             "WHERE a.POLH_STS <> 'C' and c.CUS_MOBILE = ? " +
             "or a.POLH_STS <> 'C' and c.CUS_MOMO_NO = ? " +
             "or a.POLH_STS <> 'C' and d.PYMT_MOMO_NO = ?");
            query.setParameter(1, mobile);
            query.setParameter(2, mobile);
            query.setParameter(3, mobile);
            List<Object[]> prods = query.getResultList();
             for (Object[] obj : prods) {
                dlist.add(new PolicyInfoDTO(obj));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public PolhDetlDTO getPolhDetlByPolhNum(String id) {
        PolhDetlDTO dmodel = new PolhDetlDTO();

        try {
            query = getEM().createNamedQuery("PolhDetl.findByPolhNum");
            query.setParameter("polhNum", id);

            PolhDetl data = (PolhDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDetlDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public PolhDetlDTO getPolhDetlByPolhSysID(int polhSysId) {
       PolhDetlDTO dmodel = new PolhDetlDTO();
        try {
            query = this.em.createNativeQuery("SELECT POLH_NUM,POLH_SYSID,POLH_GROSS_MOD_PREM_BC from allztrnx.polh_detl "
                    + "where POLH_SYSID =  ? ");
            query.setParameter(1, polhSysId);
            Object[] data = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDetlDTO(data);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public String updatePolhDetails(String caption, String pNum) {
        String result = "There was a problem updating, please contact support...";

        try {
            getEM().getTransaction().begin();
            query = getEM().createNativeQuery("update polh_detl set POLH_CAPTION =? WHERE POLH_NUM = ?");
            query.setParameter(1, caption);
            query.setParameter(2, pNum);
            query.executeUpdate();

            result = "PolhDetl updated successfully...";
            getEM().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
  

    public String savePolhDetl(PolhDetlDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            PolhDetl polh = new PolhDetl(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getPolhDetlPK().getPolhSysid() == 0) {
               create(polh);
                result = "Polh Detl created successfully...";
            } else {
                edit(polh);
                result = "Polh Detl updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
