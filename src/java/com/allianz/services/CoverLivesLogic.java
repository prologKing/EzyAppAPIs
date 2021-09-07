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
import com.allianz.entities.CoverLives;
import com.allianz.dto.CoverLivesDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class CoverLivesLogic extends AbstractFacade<CoverLives> {
    EntityManager em;
    private Query query;

    public CoverLivesLogic() {
        super(CoverLives.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<CoverLivesDTO> getCoverLives() {
        List<CoverLivesDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("CoverLives.findAll");
            //query.setParameter("fieldname", fieldname);

            List<CoverLives> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                CoverLivesDTO dmodel = new CoverLivesDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
   

    public CoverLivesDTO getCoverLivesByRelationship(String covername) {
        CoverLivesDTO dmodel = new CoverLivesDTO();

        try {
            query = getEM().createNamedQuery("CoverLives.findByCoverlives");
            query.setParameter("coverlives", covername);

            CoverLives data = (CoverLives) query.setMaxResults(1).getSingleResult();
            dmodel = new CoverLivesDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    
    
  

    public String saveCoverLives(CoverLivesDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            CoverLives polh = new CoverLives(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getCoverLivesIndex() == 0) {
               create(polh);
                result = "CoverLives created successfully...";
            } else {
                edit(polh);
                result = "CoverLives updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
