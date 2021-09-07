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
public class ProductPlanDTO {
    private int planid;
    private String planName;
    private String palnAmount;

    public ProductPlanDTO() {
    }

    public ProductPlanDTO(int planid) {
        this.planid = planid;
    }

     public ProductPlanDTO(Object[] obj) {
        this.planid = (Integer)obj[0];
        this.planName = (String)obj[1];
        this.palnAmount = (String)obj[2];
    } 

    public int getPlanid() {
        return planid;
    }

    public void setPlanid(int planid) {
        this.planid = planid;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPalnAmount() {
        return palnAmount;
    }

    public void setPalnAmount(String palnAmount) {
        this.palnAmount = palnAmount;
    }
    
    
}
