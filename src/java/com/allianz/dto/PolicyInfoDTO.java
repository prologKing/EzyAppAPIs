/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

/**
 *
 * @author Developer
 */
public class PolicyInfoDTO {
    private String polhNum;
    private String productName;
    private int pdtSysId;

    public PolicyInfoDTO() {
    }
    
    public PolicyInfoDTO(Object[] obj) {
        this.polhNum = (String)obj[0];
        this.productName = (String)obj[1];
        this.pdtSysId = (Integer)obj[2];
    } 

    public String getPolhNum() {
        return polhNum;
    }

    public void setPolhNum(String polhNum) {
        this.polhNum = polhNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPdtSysId() {
        return pdtSysId;
    }

    public void setPdtSysId(int pdtSysId) {
        this.pdtSysId = pdtSysId;
    }

    @Override
    public String toString() {
        return "PolicyInfoDTO{" + "polhNum=" + polhNum + ", productName=" + productName + ", pdtSysId=" + pdtSysId + '}';
    }
    
}
