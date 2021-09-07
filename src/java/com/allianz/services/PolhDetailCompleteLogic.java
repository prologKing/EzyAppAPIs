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
import com.allianz.entities.PolhDetailComplete;
import com.allianz.dto.PolhDetailCompleteDTO;
import com.allianz.dto.PolhDetlDTO;
import com.allianz.entities.PolhDetl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PolhDetailCompleteLogic extends AbstractFacade<PolhDetailComplete> {
    EntityManager em;
    private Query query;

    public PolhDetailCompleteLogic() {
        super(PolhDetailComplete.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PolhDetailCompleteDTO> getPolhDetailComplete() {
        List<PolhDetailCompleteDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PolhDetailComplete.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhDetailComplete> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                PolhDetailCompleteDTO dmodel = new PolhDetailCompleteDTO(dd);
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


    public PolhDetailCompleteDTO getPolhDetailCompleteByPolhNum(String polhNum) {
        PolhDetailCompleteDTO dmodel = new PolhDetailCompleteDTO();

        try {
            query = getEM().createNamedQuery("PolhDetailComplete.findByPolicyNo");
            query.setParameter("policyNo", polhNum);

            PolhDetailComplete data = (PolhDetailComplete) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhDetailCompleteDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String savePolhDetailComplete(PolhDetailCompleteDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            PolhDetailComplete polh = new PolhDetailComplete(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getPolhCompleteIndex() == 0) {
               create(polh);
                result = "PolhDetailComplete created successfully...";
            } else {
                edit(polh);
                result = "PolhDetailComplete updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
