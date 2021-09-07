/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ProductConstantSetup;

/**
 *
 * @author Bolaji
 */
public class ProductConstantSetupDTO {
    private int pcsSysid;
    private int pcsPdtSysid;
    private String productName;
    private String productSumassured;
    private String productTeam;
    private String productPremiumStatus;
    private String productCoverLives;
    private String assuredStatus;

    public ProductConstantSetupDTO() {
    }

    public ProductConstantSetupDTO(int pcsSysid, int pcsPdtSysid, String productName) {
        this.pcsSysid = pcsSysid;
        this.pcsPdtSysid = pcsPdtSysid;
        this.productName = productName;
    }
    
    

    public ProductConstantSetupDTO(ProductConstantSetup procon) {
        this.pcsSysid = procon.getPcsSysid();
        this.pcsPdtSysid = procon.getPcsPdtSysid();
        this.productName = procon.getProductName();
        this.productSumassured = procon.getProductSumassured();
        this.productTeam = procon.getProductTeam();
        this.productPremiumStatus = procon.getProductPremiumStatus();
        this.productCoverLives = procon.getProductCoverLives();
        this.assuredStatus = !"0".equals(procon.getProductSumassured()) ? "1": procon.getProductSumassured();
    }

    public int getPcsSysid() {
        return pcsSysid;
    }

    public void setPcsSysid(int pcsSysid) {
        this.pcsSysid = pcsSysid;
    }

    public int getPcsPdtSysid() {
        return pcsPdtSysid;
    }

    public void setPcsPdtSysid(int pcsPdtSysid) {
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

    public String getAssuredStatus() {
        return assuredStatus;
    }

    public void setAssuredStatus(String assuredStatus) {
        this.assuredStatus = assuredStatus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
         ProductConstantSetupDTO o = new ProductConstantSetupDTO();
        if (obj instanceof ProductConstantSetupDTO) {
            o = (ProductConstantSetupDTO) obj;
        }
        return o.getPcsPdtSysid() == this.getPcsPdtSysid();
    }
    
    

    @Override
    public String toString() {
        return "ProductConstantSetupDTO{" + "pcsSysid=" + pcsSysid + ", pcsPdtSysid=" + pcsPdtSysid + ", productName=" + productName + ", productSumassured=" + productSumassured + ", productTeam=" + productTeam + ", productPremiumStatus=" + productPremiumStatus + ", productCoverLives=" + productCoverLives + ", assuredStatus=" + assuredStatus + '}';
    } 
}
