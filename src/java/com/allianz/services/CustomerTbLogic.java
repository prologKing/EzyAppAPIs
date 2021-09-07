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
import com.allianz.entities.CustomerTb;
import com.allianz.dto.CustomerTbDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class CustomerTbLogic extends AbstractFacade<CustomerTb> {
    EntityManager em;
    private Query query;

    public CustomerTbLogic() {
        super(CustomerTb.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<CustomerTbDTO> getCustomerTb() {
        List<CustomerTbDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("CustomerTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<CustomerTb> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                CustomerTbDTO dmodel = new CustomerTbDTO(dd);
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


    public CustomerTbDTO getCustomerByMobile(String mobile) {
        CustomerTbDTO dmodel = new CustomerTbDTO();

        try {
            query = getEM().createNamedQuery("CustomerTb.findByCusMobile");
            query.setParameter("cusMobile", mobile);
            query.setParameter("cusMomoNo", mobile);

            CustomerTb dropdown = (CustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerTbDTO(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    public CustomerTbDTO getCustomerByIdNo(String id) {
        CustomerTbDTO dmodel = new CustomerTbDTO();

        try {
            query = getEM().createNamedQuery("CustomerTb.findByCusIdNo");
            query.setParameter("cusIdNo", id);

            CustomerTb dropdown = (CustomerTb) query.setMaxResults(1).getSingleResult();
            dmodel = new CustomerTbDTO(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveClientUsersAccess(CustomerTbDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            CustomerTb caccess = new CustomerTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getCustomerTbPK().getCusSysid() == 0) {
               create(caccess);
                result = "Customer created successfully...";
            } else {
                edit(caccess);
                result = "Customer updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
