/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ProductTbCheck;

/**
 *
 * @author Bolaji
 */
public class ProductTbCheckDTO {
    private int productIndex;
    private String productStatus;
    private String productPolicyNumber;
    private String chk;
    private String mobileNo;

    public ProductTbCheckDTO() {
    }

    public ProductTbCheckDTO(ProductTbCheck protb) {
        this.productIndex = protb.getProductIndex();
        this.productStatus = protb.getProductStatus();
        this.productPolicyNumber = protb.getProductPolicyNumber();
        this.chk = protb.getChk();
        this.mobileNo = protb.getMobileNo();
    }
    
    public int getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(int productIndex) {
        this.productIndex = productIndex;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductPolicyNumber() {
        return productPolicyNumber;
    }

    public void setProductPolicyNumber(String productPolicyNumber) {
        this.productPolicyNumber = productPolicyNumber;
    }

    public String getChk() {
        return chk;
    }

    public void setChk(String chk) {
        this.chk = chk;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "ProductTbCheckDTO{" + "productIndex=" + productIndex + ", productStatus=" + productStatus + ", productPolicyNumber=" + productPolicyNumber + ", chk=" + chk + ", mobileNo=" + mobileNo + '}';
    }
    
    
}
