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
import com.allianz.entities.UserLogs;
import com.allianz.dto.UserLogsDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class UserLogsLogic extends AbstractFacade<UserLogs> {
    EntityManager em;
    private Query query;

    public UserLogsLogic() {
        super(UserLogs.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<UserLogsDTO> getUserLogs() {
        List<UserLogsDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("UserLogs.findAll");
            //query.setParameter("fieldname", fieldname);

            List<UserLogs> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                UserLogsDTO dmodel = new UserLogsDTO(dd);
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


    public UserLogsDTO getUserLogsByMobile(String mobile) {
        UserLogsDTO dmodel = new UserLogsDTO();

        try {
            query = getEM().createNamedQuery("UserLogs.findByUlSysid");
            query.setParameter("ulSysid", mobile);

            UserLogs data = (UserLogs) query.setMaxResults(1).getSingleResult();
            dmodel = new UserLogsDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveUserLogs(UserLogsDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            UserLogs pay = new UserLogs(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getUlSysid() == 0) {
               create(pay);
                result = "User Log created successfully...";
            } else {
                edit(pay);
                result = "User Log updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
