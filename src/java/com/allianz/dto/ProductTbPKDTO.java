/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ProductTbPK;

/**
 *
 * @author Developer
 */
public class ProductTbPKDTO {
    private int pdtSysid;
    private int pdtIttSysid;
    private int pdtUserSysid;

    public ProductTbPKDTO() {
    }

    public ProductTbPKDTO(ProductTbPK ptb) {
        this.pdtSysid = ptb.getPdtSysid();
        this.pdtIttSysid = ptb.getPdtIttSysid();
        this.pdtUserSysid = ptb.getPdtUserSysid();
    }
    
    

    public int getPdtSysid() {
        return pdtSysid;
    }

    public void setPdtSysid(int pdtSysid) {
        this.pdtSysid = pdtSysid;
    }

    public int getPdtIttSysid() {
        return pdtIttSysid;
    }

    public void setPdtIttSysid(int pdtIttSysid) {
        this.pdtIttSysid = pdtIttSysid;
    }

    public int getPdtUserSysid() {
        return pdtUserSysid;
    }

    public void setPdtUserSysid(int pdtUserSysid) {
        this.pdtUserSysid = pdtUserSysid;
    }

    @Override
    public String toString() {
        return "ProductTbPKDTO{" + "pdtSysid=" + pdtSysid + ", pdtIttSysid=" + pdtIttSysid + ", pdtUserSysid=" + pdtUserSysid + '}';
    }
    
    
}
