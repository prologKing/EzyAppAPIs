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
import com.allianz.dto.PolicyInfoDTO;
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.allianz.entities.ProductConstantSetup;
import com.allianz.dto.ProductConstantSetupDTO;
import com.allianz.dto.ProductTbCheckDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductConstantSetupLogic extends AbstractFacade<ProductConstantSetup> {
    EntityManager em;
    private Query query;

    public ProductConstantSetupLogic() {
        super(ProductConstantSetup.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductConstantSetupDTO> getProductConstantSetup() {
        List<ProductConstantSetupDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductConstantSetup.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductConstantSetup> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ProductConstantSetupDTO dmodel = new ProductConstantSetupDTO(dd);
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
    
    public List<ProductConstantSetupDTO> getUnSubscribedProductsByMobile(String mobile) {
         List<ProductConstantSetupDTO> dlist = new ArrayList<>();

        try {
            dlist = this.getProductConstantSetup();
            List<PolicyInfoDTO> plist = new PolhDetlLogic().getProductByCustMobile("0" + mobile.substring(3));
            if(!plist.isEmpty()){
                for(PolicyInfoDTO ptbdto : plist){
                   dlist.remove(new ProductConstantSetupDTO(0, ptbdto.getPdtSysId(), ptbdto.getProductName()));
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public ProductConstantSetupDTO getProductConstantSetupById(int id) {
        ProductConstantSetupDTO dmodel = new ProductConstantSetupDTO();

        try {
            query = getEM().createNamedQuery("ProductConstantSetup.findByPcsPdtSysid");
            query.setParameter("pcsPdtSysid", id);

            ProductConstantSetup data = (ProductConstantSetup) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductConstantSetupDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveProductConstantSetup(ProductConstantSetupDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            ProductConstantSetup pay = new ProductConstantSetup(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getPcsSysid() == 0) {
               create(pay);
                result = "Product Constant Setup created successfully...";
            } else {
                edit(pay);
                result = "Product Constant Setup updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
