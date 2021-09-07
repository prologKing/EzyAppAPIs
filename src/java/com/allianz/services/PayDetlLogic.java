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
import com.allianz.entities.PayDetl;
import com.allianz.dto.PayDetlDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PayDetlLogic extends AbstractFacade<PayDetl> {
    EntityManager em;
    private Query query;

    public PayDetlLogic() {
        super(PayDetl.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PayDetlDTO> getPayDetl() {
        List<PayDetlDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PayDetl.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PayDetl> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                PayDetlDTO dmodel = new PayDetlDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
//    public V2ProductModel getV2ProductByCode(String id) {
//        if(id == null){
//        id = "";
//        }
//        V2ProductModel dmodel = new V2ProductModel();
//        try {
//            query = this.em.createNativeQuery("select PDT_SYSID, PDT_CODE, PDT_NAME  FROM product_tb WHERE PDT_CODE = '"+id+"'");
//            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
//            dmodel = new V2ProductModel(obj);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return dmodel;
//    }


    public PayDetlDTO getPayDetlById(int id) {
        PayDetlDTO dmodel = new PayDetlDTO();

        try {
            query = getEM().createNamedQuery("PayDetl.findByPymtSysId");
            query.setParameter("pymtSysId", id);

            PayDetl data = (PayDetl) query.setMaxResults(1).getSingleResult();
            dmodel = new PayDetlDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String savePayDetl(PayDetlDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            PayDetl pay = new PayDetl(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getPymtSysId() == 0) {
               create(pay);
                result = "Pay Detl created successfully...";
            } else {
                edit(pay);
                result = "Pay Detl updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
