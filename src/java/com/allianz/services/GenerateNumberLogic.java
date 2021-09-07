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
import com.allianz.entities.GenerateNumber;
import com.allianz.dto.GenerateNumberDTO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class GenerateNumberLogic extends AbstractFacade<GenerateNumber> {
    EntityManager em;
    private Query query;

    public GenerateNumberLogic() {
        super(GenerateNumber.class);
        em = new GenericLibrary().getEM("allzitc").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<GenerateNumberDTO> getGenerateNumber() {
        List<GenerateNumberDTO> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("GenerateNumber.findAll");
            //query.setParameter("fieldname", fieldname);

            List<GenerateNumber> cuaccess = query.getResultList();

            cuaccess.forEach((dd) -> {
                GenerateNumberDTO dmodel = new GenerateNumberDTO(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
   

    public GenerateNumberDTO getGenerateNumberByIndex(int index) {
        GenerateNumberDTO dmodel = new GenerateNumberDTO();

        try {
            query = getEM().createNamedQuery("GenerateNumber.findByGenerateindex");
            query.setParameter("generateindex", index);

            GenerateNumber data = (GenerateNumber) query.setMaxResults(1).getSingleResult();
            dmodel = new GenerateNumberDTO(data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }
    
    
    
  

    public String saveGenerateNumber(GenerateNumberDTO dmodel) {
        String result = "There was a problem saving...";

        try {
            GenerateNumber polh = new GenerateNumber(dmodel);

            getEM().getTransaction().begin();

            if (dmodel.getGenerateindex() == 0) {
               create(polh);
                result = "GenerateNumber created successfully...";
            } else {
                edit(polh);
                result = "GenerateNumber updated successfully...";
            }

            getEM().getTransaction().commit();
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
