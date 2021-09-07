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
import com.allianz.dto.AccessTypeDTO;
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.allianz.entities.ClientUsersAccessTb;
import com.allianz.dto.ClientUsersAccessTbDTO;
import com.allianz.dto.PolicyInfoDTO;
import com.allianz.dto.ProductAgentsTbDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ClientUsersAccessTbLogic extends AbstractFacade<ClientUsersAccessTb> {

    EntityManager em;
    private Query query;

    public ClientUsersAccessTbLogic() {
        super(ClientUsersAccessTb.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ClientUsersAccessTbDTO> getClientUsersAccessTb() {
        List<ClientUsersAccessTbDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ClientUsersAccessTb.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ClientUsersAccessTb> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                ClientUsersAccessTbDTO dmodel = new ClientUsersAccessTbDTO(dd);
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
    public ClientUsersAccessTbDTO getClientUserAcccessByMobile(String mobile) {
        ClientUsersAccessTbDTO dmodel = new ClientUsersAccessTbDTO();

        try {
            query = getEM().createNamedQuery("ClientUsersAccessTb.findByClientUserName");
            query.setParameter("clientUserName", mobile);

            ClientUsersAccessTb dropdown = (ClientUsersAccessTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ClientUsersAccessTbDTO(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public AccessTypeDTO getAccessType(String mobile) {
        AccessTypeDTO dmodel = new AccessTypeDTO();

        try {
            ClientUsersAccessTbDTO accessDTO = this.getClientUserAcccessByMobile(mobile);
            ProductAgentsTbDTO pagentDTO = new ProductAgentsTbLogic().getProductAgentsTbByMobile("0" + mobile.substring(3));
            List<PolicyInfoDTO> plist = new PolhDetlLogic().getProductByCustMobile("0" + mobile.substring(3));
            String accesstype = "";

            if (plist.isEmpty() && accessDTO.getClientUserName() == null) {
                accesstype = "NON";
            }
            if (pagentDTO.getProductAgentsTbPK().getPagtSysid() != 0) {
                accesstype = "AGT";
            }
            if (!plist.isEmpty()) {
                accesstype = "CUS";
            }
            if (!plist.isEmpty() && pagentDTO.getProductAgentsTbPK().getPagtSysid() != 0) {
                accesstype = "CAG";
            }
            dmodel = new AccessTypeDTO(mobile, accesstype);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveClientUsersAccess(ClientUsersAccessTbDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            ClientUsersAccessTb caccess = new ClientUsersAccessTb(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getClientUserindex() == 0) {
                create(caccess);
                result = "Client Users Access created successfully...";
            } else {
                edit(caccess);
                result = "Client Users Access updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
