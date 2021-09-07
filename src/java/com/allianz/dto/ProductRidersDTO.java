/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

/**
 *
 * @author Bolaji
 */
public class ProductRidersDTO {
   private int riderId;
   private String benefitDesc;

    public ProductRidersDTO() {
    }
   
    public ProductRidersDTO(Object[] obj) {
        this.riderId = (Integer)obj[0];
        this.benefitDesc = (String)obj[1];
    } 

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public String getBenefitDesc() {
        return benefitDesc;
    }

    public void setBenefitDesc(String benefitDesc) {
        this.benefitDesc = benefitDesc;
    }
   
   
    
}
