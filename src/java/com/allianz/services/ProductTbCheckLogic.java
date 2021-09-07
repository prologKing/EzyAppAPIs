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
import com.allianz.entities.ProductTbCheck;
import com.allianz.dto.ProductTbCheckDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductTbCheckLogic extends AbstractFacade<ProductTbCheck> {
    EntityManager em;
    private Query query;

    public ProductTbCheckLogic() {
        super(ProductTbCheck.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductTbCheckDTO> getProductTbCheck() {
        List<ProductTbCheckDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductTbCheck.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductTbCheck> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ProductTbCheckDTO dmodel = new ProductTbCheckDTO(dd);
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


    public ProductTbCheckDTO getProductTbCheckByMobile(String mobile) {
        ProductTbCheckDTO dmodel = new ProductTbCheckDTO();

        try {
            query = getEM().createNamedQuery("ProductTbCheck.findByMobileNo");
            query.setParameter("mobileNo", mobile);

            ProductTbCheck data = (ProductTbCheck) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductTbCheckDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveProductTbCheck(ProductTbCheckDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            ProductTbCheck pay = new ProductTbCheck(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getProductIndex() == 0) {
               create(pay);
                result = "ProductTBCheck created successfully...";
            } else {
                edit(pay);
                result = "ProductTBCheck updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
