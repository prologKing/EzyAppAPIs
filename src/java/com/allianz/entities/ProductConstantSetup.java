/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ProductConstantSetupDTO;
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
@Table(name = "product_constant_setup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductConstantSetup.findAll", query = "SELECT p FROM ProductConstantSetup p"),
    @NamedQuery(name = "ProductConstantSetup.findByPcsSysid", query = "SELECT p FROM ProductConstantSetup p WHERE p.pcsSysid = :pcsSysid"),
    @NamedQuery(name = "ProductConstantSetup.findByPcsPdtSysid", query = "SELECT p FROM ProductConstantSetup p WHERE p.pcsPdtSysid = :pcsPdtSysid"),
    @NamedQuery(name = "ProductConstantSetup.findByProductName", query = "SELECT p FROM ProductConstantSetup p WHERE p.productName = :productName"),
    @NamedQuery(name = "ProductConstantSetup.findByProductSumassured", query = "SELECT p FROM ProductConstantSetup p WHERE p.productSumassured = :productSumassured"),
    @NamedQuery(name = "ProductConstantSetup.findByProductTeam", query = "SELECT p FROM ProductConstantSetup p WHERE p.productTeam = :productTeam"),
    @NamedQuery(name = "ProductConstantSetup.findByProductPremiumStatus", query = "SELECT p FROM ProductConstantSetup p WHERE p.productPremiumStatus = :productPremiumStatus"),
    @NamedQuery(name = "ProductConstantSetup.findByProductCoverLives", query = "SELECT p FROM ProductConstantSetup p WHERE p.productCoverLives = :productCoverLives")})
public class ProductConstantSetup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PCS_SYSID")
    private Integer pcsSysid;
    @Column(name = "PCS_PDT_SYSID")
    private Integer pcsPdtSysid;
    @Size(max = 150)
    @Column(name = "product_name")
    private String productName;
    @Size(max = 5)
    @Column(name = "product_sumassured")
    private String productSumassured;
    @Size(max = 5)
    @Column(name = "product_team")
    private String productTeam;
    @Size(max = 5)
    @Column(name = "product_premium_status")
    private String productPremiumStatus;
    @Size(max = 5)
    @Column(name = "product_cover_lives")
    private String productCoverLives;

    public ProductConstantSetup() {
    }
    
    public ProductConstantSetup(ProductConstantSetupDTO procon) {
        this.pcsSysid = procon.getPcsSysid();
        this.pcsPdtSysid = procon.getPcsPdtSysid();
        this.productName = procon.getProductName();
        this.productSumassured = procon.getProductSumassured();
        this.productTeam = procon.getProductTeam();
        this.productPremiumStatus = procon.getProductPremiumStatus();
        this.productCoverLives = procon.getProductCoverLives();
    }

    public ProductConstantSetup(Integer pcsSysid) {
        this.pcsSysid = pcsSysid;
    }

    public Integer getPcsSysid() {
        return pcsSysid;
    }

    public void setPcsSysid(Integer pcsSysid) {
        this.pcsSysid = pcsSysid;
    }

    public Integer getPcsPdtSysid() {
        return pcsPdtSysid;
    }

    public void setPcsPdtSysid(Integer pcsPdtSysid) {
        this.pcsPdtSysid = pcsPdtSysid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSumassured() {
        return productSumassured;
    }

    public void setProductSumassured(String productSumassured) {
        this.productSumassured = productSumassured;
    }

    public String getProductTeam() {
        return productTeam;
    }

    public void setProductTeam(String productTeam) {
        this.productTeam = productTeam;
    }

    public String getProductPremiumStatus() {
        return productPremiumStatus;
    }

    public void setProductPremiumStatus(String productPremiumStatus) {
        this.productPremiumStatus = productPremiumStatus;
    }

    public String getProductCoverLives() {
        return productCoverLives;
    }

    public void setProductCoverLives(String productCoverLives) {
        this.productCoverLives = productCoverLives;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcsSysid != null ? pcsSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConstantSetup)) {
            return false;
        }
        ProductConstantSetup other = (ProductConstantSetup) object;
        if ((this.pcsSysid == null && other.pcsSysid != null) || (this.pcsSysid != null && !this.pcsSysid.equals(other.pcsSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ProductConstantSetup[ pcsSysid=" + pcsSysid + " ]";
    }
    
}
