/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.CoverLivesDTO;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "cover_lives")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoverLives.findAll", query = "SELECT c FROM CoverLives c"),
    @NamedQuery(name = "CoverLives.findByCoverLivesIndex", query = "SELECT c FROM CoverLives c WHERE c.coverLivesIndex = :coverLivesIndex"),
    @NamedQuery(name = "CoverLives.findByCoverlives", query = "SELECT c FROM CoverLives c WHERE c.coverlives = :coverlives"),
    @NamedQuery(name = "CoverLives.findByCategory", query = "SELECT c FROM CoverLives c WHERE c.category = :category")})
public class CoverLives implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cover_lives_index")
    private Integer coverLivesIndex;
    @Size(max = 45)
    @Column(name = "coverlives")
    private String coverlives;
    @Size(max = 45)
    @Column(name = "category")
    private String category;

    public CoverLives() {
    }

    public CoverLives(CoverLivesDTO cl) {
        this.coverLivesIndex = cl.getCoverLivesIndex();
        this.coverlives = cl.getCoverlives();
        this.category = cl.getCategory();
    }

    public CoverLives(Integer coverLivesIndex) {
        this.coverLivesIndex = coverLivesIndex;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coverLivesIndex != null ? coverLivesIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoverLives)) {
            return false;
        }
        CoverLives other = (CoverLives) object;
        if ((this.coverLivesIndex == null && other.coverLivesIndex != null) || (this.coverLivesIndex != null && !this.coverLivesIndex.equals(other.coverLivesIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.CoverLives[ coverLivesIndex=" + coverLivesIndex + " ]";
    }
    
}
