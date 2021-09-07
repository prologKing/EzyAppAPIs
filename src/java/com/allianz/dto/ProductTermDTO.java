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
public class ProductTermDTO {

    private int productid;
    private String term;
    
    public ProductTermDTO(int prd, Object[] obj) {
        this.productid = prd;
        this.term = (String)obj[0];
    } 

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "ProductTermDTO{" + "productid=" + productid + ", term=" + term + '}';
    }

}
