/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ProductFreqMinAmtDTO;
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
@Table(name = "product_freq_min_amt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductFreqMinAmt.findAll", query = "SELECT p FROM ProductFreqMinAmt p"),
    @NamedQuery(name = "ProductFreqMinAmt.findByProductMinAmt", query = "SELECT p FROM ProductFreqMinAmt p WHERE p.productMinAmt = :productMinAmt"),
    @NamedQuery(name = "ProductFreqMinAmt.findByProductId", query = "SELECT p FROM ProductFreqMinAmt p WHERE p.productId = :productId"),
    @NamedQuery(name = "ProductFreqMinAmt.findByProductFrequency", query = "SELECT p FROM ProductFreqMinAmt p WHERE p.productFrequency = :productFrequency"),
    @NamedQuery(name = "ProductFreqMinAmt.findByProductAmount", query = "SELECT p FROM ProductFreqMinAmt p WHERE p.productAmount = :productAmount")})
public class ProductFreqMinAmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_min_amt")
    private Integer productMinAmt;
    @Size(max = 15)
    @Column(name = "product_id")
    private String productId;
    @Size(max = 50)
    @Column(name = "product_frequency")
    private String productFrequency;
    @Size(max = 50)
    @Column(name = "product_amount")
    private String productAmount;

    public ProductFreqMinAmt() {
    }
    
    public ProductFreqMinAmt(ProductFreqMinAmtDTO pfma) {
        this.productMinAmt = pfma.getProductMinAmt();
        this.productId = pfma.getProductId();
        this.productFrequency = pfma.getProductFrequency();
        this.productAmount = pfma.getProductAmount();
    }

    public ProductFreqMinAmt(Integer productMinAmt) {
        this.productMinAmt = productMinAmt;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMinAmt != null ? productMinAmt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFreqMinAmt)) {
            return false;
        }
        ProductFreqMinAmt other = (ProductFreqMinAmt) object;
        if ((this.productMinAmt == null && other.productMinAmt != null) || (this.productMinAmt != null && !this.productMinAmt.equals(other.productMinAmt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ProductFreqMinAmt[ productMinAmt=" + productMinAmt + " ]";
    }
    
}
