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
import com.allianz.entities.ProductTb;
import com.allianz.dto.ProductTbDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductTbLogic extends AbstractFacade<ProductTb> {
    EntityManager em;
    private Query query;

    public ProductTbLogic() {
        super(ProductTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductTbDTO> getProductTb() {
        List<ProductTbDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ProductTb> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ProductTbDTO dmodel = new ProductTbDTO(dd);
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


    public ProductTbDTO getProductTbByProdSysId(int id) {
        ProductTbDTO dmodel = new ProductTbDTO();

        try {
            query = getEM().createNamedQuery("ProductTb.findByPdtSysid");
            query.setParameter("pdtSysid", id);

            ProductTb data = (ProductTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductTbDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
  

    public String saveProductTb(ProductTbDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            ProductTb polh = new ProductTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getProductTbPK().getPdtSysid() == 0) {
               create(polh);
                result = "Product created successfully...";
            } else {
                edit(polh);
                result = "Product updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
