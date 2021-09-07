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
import com.allianz.entities.ProductAgentsTb;
import com.allianz.dto.ProductAgentsTbDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductAgentsTbLogic extends AbstractFacade<ProductAgentsTb> {
    EntityManager em;
    private Query query;

    public ProductAgentsTbLogic() {
        super(ProductAgentsTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductAgentsTbDTO> getProductAgentsTb() {
        List<ProductAgentsTbDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductAgentsTb> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ProductAgentsTbDTO dmodel = new ProductAgentsTbDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
    public Integer getAgentUserID(String agentCode) {
       Integer userId = 0;
        try {
            query = this.em.createNativeQuery("SELECT USER_SYSID FROM ALLZMENU.PRODUCT_AGENTS_TB a "
                    + "join ALLZMENU.users_tb b on a.PAGT_CODE = USER_NAME where a.PAGT_CODE = ? ");
            query.setParameter(1, agentCode);
            userId = (Integer) query.setMaxResults(1).getSingleResult();
         
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return userId;
    }


    public ProductAgentsTbDTO getProductAgentsTbByMobile(String mobile) {
        ProductAgentsTbDTO dmodel = new ProductAgentsTbDTO();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findByPagtMobileOrMomo");
            query.setParameter("pagtMobile", mobile);
            query.setParameter("pagtMomoNo", mobile);
            query.setParameter("pagtStatus", "ACTIVE");

            ProductAgentsTb data = (ProductAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsTbDTO(data);
            dmodel.getProductAgentsTbPK().setPagtUserSysid(this.getAgentUserID(dmodel.getPagtCode()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveProductAgentsTb(ProductAgentsTbDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            ProductAgentsTb polh = new ProductAgentsTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getProductAgentsTbPK().getPagtSysid() == 0) {
               create(polh);
                result = "Agent created successfully...";
            } else {
                edit(polh);
                result = "Agent updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
