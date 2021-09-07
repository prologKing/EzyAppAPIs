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
import com.allianz.entities.ProductFreqMinAmt;
import com.allianz.dto.ProductFreqMinAmtDTO;
import com.allianz.dto.ProductPlanDTO;
import com.allianz.dto.ProductRidersDTO;
import com.allianz.dto.ProductTermDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductFreqMinAmtLogic extends AbstractFacade<ProductFreqMinAmt> {
    EntityManager em;
    private Query query;

    public ProductFreqMinAmtLogic() {
        super(ProductFreqMinAmt.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductFreqMinAmtDTO> getProductFreqMinAmt() {
        List<ProductFreqMinAmtDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductFreqMinAmt.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductFreqMinAmt> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ProductFreqMinAmtDTO dmodel = new ProductFreqMinAmtDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<ProductPlanDTO> getProductPlans(int productid) {
        List<ProductPlanDTO> dlist = new ArrayList<>();
        try {
            query = this.em.createNativeQuery("SELECT a.PPT_SYSID, a.PPT_NAME, b.PRTL_FCTR3_FRM " +
                    "FROM ALLZMENU.PRODUCT_PLAN_TB a, ALLZMENU.PRODUCT_RATE_DL b " +
                    "WHERE a.PPT_PDT_SYSID = b.PRTL_PDT_SYSID AND a.PPT_PDT_SYSID = ? " +
                    "AND b.PRTL_PPT_SYSID = a.PPT_SYSID AND b.PRTL_ASSURED_ID = 1 " +
                    "GROUP BY PRTL_FCTR3_FRM ORDER BY PPT_CODE ASC LIMIT 5");
            query.setParameter(1, productid);
           List<Object[]> prods = query.getResultList();
             for (Object[] obj : prods) {
                dlist.add(new ProductPlanDTO(obj));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public int getProductPlanID(String productid, String sumAssured) {
        ProductPlanDTO pdtDTO = new ProductPlanDTO();
         try {
            query = this.em.createNativeQuery("SELECT DISTINCT(PRTL_FCTR3_FRM) PRTL_FCTR3_FRM,PRTL_PPT_SYSID FROM ALLZMENU.PRODUCT_RATE_DL " +
            "WHERE PRTL_PDT_SYSID IN (?) AND PRTL_FCTR3_FRM = ? AND PRTL_ASSURED_ID = 1");
            query.setParameter(1, productid);
            query.setParameter(2, sumAssured);
           Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
          
           pdtDTO = new ProductPlanDTO((Integer)obj[0]);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return pdtDTO.getPlanid();
    }
    
    public List<ProductTermDTO> getProductTerms(int productid) {
        List<ProductTermDTO> dlist = new ArrayList<>();
        try {
            query = this.em.createNativeQuery("SELECT DISTINCT(PRTL_FCTR1_FRM) AS PRTL_FCTR1_FRM, PRTL_PROD " +
                    "FROM ALLZMENU.PRODUCT_RATE_DL WHERE PRTL_PDT_SYSID " +
                    "IN (SELECT PRTH_PDT_SYSID FROM ALLZMENU.PRODUCT_RATE_HD " +
                    "WHERE PRTH_TAB_NAME = 'PREM' AND PRTH_TERM_DEPT = 'Y' " +
                    "AND PRTH_PDT_SYSID NOT IN (81,82)) AND PRTL_ASSURED_ID = 1 " +
                    "AND PRTL_TYPE = 'P' AND PRTL_PDT_SYSID = (?)");
            query.setParameter(1, productid);
           List<Object[]> prods = query.getResultList();
             for (Object[] obj : prods) {
                dlist.add(new ProductTermDTO(productid, obj));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public List<ProductRidersDTO> getProductRiders(int productid) {
        List<ProductRidersDTO> dlist = new ArrayList<>();
        try {
            query = this.em.createNativeQuery("SELECT PRT_PDT_SYSID_RIDER, " +
            "(SELECT PDT_NAME FROM ALLZMENU.PRODUCT_TB " +
            "WHERE PDT_SYSID = PRT_PDT_SYSID_RIDER) PDT_NAME " +
            "FROM ALLZMENU.PRODUCT_RIDER_TB WHERE PRT_PDT_SYSID_BASE = ? " +
            "AND PRT_PDT_SYSID_RIDER NOT IN (SELECT PRD_PDT_SYSID " +
            "FROM ALLZTRNX.POLH_RIDERS_DTL WHERE PRD_POLH_SYSID = (''))");
            query.setParameter(1, productid);
           List<Object[]> prods = query.getResultList();
             for (Object[] obj : prods) {
                dlist.add(new ProductRidersDTO(obj));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public List<ProductFreqMinAmtDTO> getProductFreqMinAmtById(String id) {
        List<ProductFreqMinAmtDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductFreqMinAmt.findByProductId");
            query.setParameter("productId", id);

            List<ProductFreqMinAmt> pfma = query.getResultList();
           pfma.forEach((dd) -> {
                ProductFreqMinAmtDTO dmodel = new ProductFreqMinAmtDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
  

}
