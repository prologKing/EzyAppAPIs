/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ProductTbCheckDTO;
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
 * @author Bolaji
 */
@Entity
@Table(name = "product_tb_check")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTbCheck.findAll", query = "SELECT p FROM ProductTbCheck p"),
    @NamedQuery(name = "ProductTbCheck.findByProductIndex", query = "SELECT p FROM ProductTbCheck p WHERE p.productIndex = :productIndex"),
    @NamedQuery(name = "ProductTbCheck.findByProductStatus", query = "SELECT p FROM ProductTbCheck p WHERE p.productStatus = :productStatus"),
    @NamedQuery(name = "ProductTbCheck.findByProductPolicyNumber", query = "SELECT p FROM ProductTbCheck p WHERE p.productPolicyNumber = :productPolicyNumber"),
    @NamedQuery(name = "ProductTbCheck.findByChk", query = "SELECT p FROM ProductTbCheck p WHERE p.chk = :chk"),
    @NamedQuery(name = "ProductTbCheck.findByMobileNo", query = "SELECT p FROM ProductTbCheck p WHERE p.mobileNo = :mobileNo")})
public class ProductTbCheck implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_index")
    private Integer productIndex;
    @Size(max = 50)
    @Column(name = "product_status")
    private String productStatus;
    @Size(max = 45)
    @Column(name = "product_policy_number")
    private String productPolicyNumber;
    @Size(max = 1)
    @Column(name = "chk")
    private String chk;
    @Size(max = 150)
    @Column(name = "mobile_no")
    private String mobileNo;

    public ProductTbCheck() {
    }
    
    public ProductTbCheck(ProductTbCheckDTO protb) {
        this.productIndex = protb.getProductIndex();
        this.productStatus = protb.getProductStatus();
        this.productPolicyNumber = protb.getProductPolicyNumber();
        this.chk = protb.getChk();
        this.mobileNo = protb.getMobileNo();
    }

    public ProductTbCheck(Integer productIndex) {
        this.productIndex = productIndex;
    }

    public Integer getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(Integer productIndex) {
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
    public int hashCode() {
        int hash = 0;
        hash += (productIndex != null ? productIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTbCheck)) {
            return false;
        }
        ProductTbCheck other = (ProductTbCheck) object;
        if ((this.productIndex == null && other.productIndex != null) || (this.productIndex != null && !this.productIndex.equals(other.productIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ProductTbCheck[ productIndex=" + productIndex + " ]";
    }
    
}
