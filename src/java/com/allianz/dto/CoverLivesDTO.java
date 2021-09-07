/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.CoverLives;

/**
 *
 * @author Developer
 */
public class CoverLivesDTO {

    private Integer coverLivesIndex;
    private String coverlives;
    private String category;

    public CoverLivesDTO() {
    }

    public CoverLivesDTO(CoverLives cl) {
        this.coverLivesIndex = cl.getCoverLivesIndex();
        this.coverlives = cl.getCoverlives();
        this.category = cl.getCategory();
    }

    public Integer getCoverLivesIndex() {
        return coverLivesIndex;
    }

    public void setCoverLivesIndex(Integer coverLivesIndex) {
        this.coverLivesIndex = coverLivesIndex;
    }

    public String getCoverlives() {
        return coverlives;
    }

    public void setCoverlives(String coverlives) {
        this.coverlives = coverlives;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
