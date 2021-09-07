/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ProductTbPKDTO;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Developer
 */
@Embeddable
public class ProductTbPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PDT_SYSID")
    private int pdtSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDT_ITT_SYSID")
    private int pdtIttSysid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PDT_USER_SYSID")
    private int pdtUserSysid;

    public ProductTbPK() {
    }
    
    public ProductTbPK(ProductTbPKDTO ptb) {
        this.pdtSysid = ptb.getPdtSysid();
        this.pdtIttSysid = ptb.getPdtIttSysid();
        this.pdtUserSysid = ptb.getPdtUserSysid();
    }

    public ProductTbPK(int pdtSysid, int pdtIttSysid, int pdtUserSysid) {
        this.pdtSysid = pdtSysid;
        this.pdtIttSysid = pdtIttSysid;
        this.pdtUserSysid = pdtUserSysid;
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
    public int hashCode() {
        int hash = 0;
        hash += (int) pdtSysid;
        hash += (int) pdtIttSysid;
        hash += (int) pdtUserSysid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTbPK)) {
            return false;
        }
        ProductTbPK other = (ProductTbPK) object;
        if (this.pdtSysid != other.pdtSysid) {
            return false;
        }
        if (this.pdtIttSysid != other.pdtIttSysid) {
            return false;
        }
        if (this.pdtUserSysid != other.pdtUserSysid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ProductTbPK[ pdtSysid=" + pdtSysid + ", pdtIttSysid=" + pdtIttSysid + ", pdtUserSysid=" + pdtUserSysid + " ]";
    }
    
}
