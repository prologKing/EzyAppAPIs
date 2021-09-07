/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ProductFreqMinAmt;

/**
 *
 * @author Developer
 */
public class ProductFreqMinAmtDTO {
    private Integer productMinAmt;
    private String productId;
    private String productFrequency;
    private String productAmount;

    public ProductFreqMinAmtDTO() {
    }

    public ProductFreqMinAmtDTO(ProductFreqMinAmt pfma) {
        this.productMinAmt = pfma.getProductMinAmt();
        this.productId = pfma.getProductId();
        this.productFrequency = pfma.getProductFrequency();
        this.productAmount = pfma.getProductAmount();
    }

    public Integer getProductMinAmt() {
        return productMinAmt;
    }

    public void setProductMinAmt(Integer productMinAmt) {
        this.productMinAmt = productMinAmt;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductFrequency() {
        return productFrequency;
    }

    public void setProductFrequency(String productFrequency) {
        this.productFrequency = productFrequency;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }
    
    
}
