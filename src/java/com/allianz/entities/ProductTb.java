/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ProductTbDTO;
import com.allianz.dto.ProductTbPKDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "product_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductTb.findAll", query = "SELECT p FROM ProductTb p"),
    @NamedQuery(name = "ProductTb.findByPdtSysid", query = "SELECT p FROM ProductTb p WHERE p.productTbPK.pdtSysid = :pdtSysid"),
    @NamedQuery(name = "ProductTb.findByPdtIttSysid", query = "SELECT p FROM ProductTb p WHERE p.productTbPK.pdtIttSysid = :pdtIttSysid"),
    @NamedQuery(name = "ProductTb.findByPdtUserSysid", query = "SELECT p FROM ProductTb p WHERE p.productTbPK.pdtUserSysid = :pdtUserSysid"),
    @NamedQuery(name = "ProductTb.findByPdtPlnDepent", query = "SELECT p FROM ProductTb p WHERE p.pdtPlnDepent = :pdtPlnDepent"),
    @NamedQuery(name = "ProductTb.findByPdtCode", query = "SELECT p FROM ProductTb p WHERE p.pdtCode = :pdtCode"),
    @NamedQuery(name = "ProductTb.findByPdtName", query = "SELECT p FROM ProductTb p WHERE p.pdtName = :pdtName"),
    @NamedQuery(name = "ProductTb.findByPdtCrtDt", query = "SELECT p FROM ProductTb p WHERE p.pdtCrtDt = :pdtCrtDt"),
    @NamedQuery(name = "ProductTb.findByPdtStDt", query = "SELECT p FROM ProductTb p WHERE p.pdtStDt = :pdtStDt"),
    @NamedQuery(name = "ProductTb.findByPdtEndDt", query = "SELECT p FROM ProductTb p WHERE p.pdtEndDt = :pdtEndDt"),
    @NamedQuery(name = "ProductTb.findByPdtSysDt", query = "SELECT p FROM ProductTb p WHERE p.pdtSysDt = :pdtSysDt"),
    @NamedQuery(name = "ProductTb.findByPdtAppr", query = "SELECT p FROM ProductTb p WHERE p.pdtAppr = :pdtAppr"),
    @NamedQuery(name = "ProductTb.findByPdtApprDt", query = "SELECT p FROM ProductTb p WHERE p.pdtApprDt = :pdtApprDt"),
    @NamedQuery(name = "ProductTb.findByPdtMageFrm", query = "SELECT p FROM ProductTb p WHERE p.pdtMageFrm = :pdtMageFrm"),
    @NamedQuery(name = "ProductTb.findByPdtMageTo", query = "SELECT p FROM ProductTb p WHERE p.pdtMageTo = :pdtMageTo"),
    @NamedQuery(name = "ProductTb.findByPdtType", query = "SELECT p FROM ProductTb p WHERE p.pdtType = :pdtType"),
    @NamedQuery(name = "ProductTb.findByPdtMainlifeWaitDays", query = "SELECT p FROM ProductTb p WHERE p.pdtMainlifeWaitDays = :pdtMainlifeWaitDays"),
    @NamedQuery(name = "ProductTb.findByPdtOthlifeWaitDays", query = "SELECT p FROM ProductTb p WHERE p.pdtOthlifeWaitDays = :pdtOthlifeWaitDays"),
    @NamedQuery(name = "ProductTb.findByPdtMinTerm", query = "SELECT p FROM ProductTb p WHERE p.pdtMinTerm = :pdtMinTerm"),
    @NamedQuery(name = "ProductTb.findByPdtMaxTerm", query = "SELECT p FROM ProductTb p WHERE p.pdtMaxTerm = :pdtMaxTerm"),
    @NamedQuery(name = "ProductTb.findByPdtGraceDays", query = "SELECT p FROM ProductTb p WHERE p.pdtGraceDays = :pdtGraceDays"),
    @NamedQuery(name = "ProductTb.findByPdtReinstateDays", query = "SELECT p FROM ProductTb p WHERE p.pdtReinstateDays = :pdtReinstateDays"),
    @NamedQuery(name = "ProductTb.findByPdtSts", query = "SELECT p FROM ProductTb p WHERE p.pdtSts = :pdtSts"),
    @NamedQuery(name = "ProductTb.findByPdtTcDoc", query = "SELECT p FROM ProductTb p WHERE p.pdtTcDoc = :pdtTcDoc")})
public class ProductTb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductTbPK productTbPK;
    @Size(max = 5)
    @Column(name = "PDT_PLN_DEPENT")
    private String pdtPlnDepent;
    @Size(max = 15)
    @Column(name = "PDT_CODE")
    private String pdtCode;
    @Size(max = 150)
    @Column(name = "PDT_NAME")
    private String pdtName;
    @Column(name = "PDT_CRT_DT")
    @Temporal(TemporalType.DATE)
    private Date pdtCrtDt;
    @Column(name = "PDT_ST_DT")
    @Temporal(TemporalType.DATE)
    private Date pdtStDt;
    @Column(name = "PDT_END_DT")
    @Temporal(TemporalType.DATE)
    private Date pdtEndDt;
    @Column(name = "PDT_SYS_DT")
    @Temporal(TemporalType.DATE)
    private Date pdtSysDt;
    @Size(max = 5)
    @Column(name = "PDT_APPR")
    private String pdtAppr;
    @Column(name = "PDT_APPR_DT")
    @Temporal(TemporalType.DATE)
    private Date pdtApprDt;
    @Column(name = "PDT_MAGE_FRM")
    private Integer pdtMageFrm;
    @Column(name = "PDT_MAGE_TO")
    private Integer pdtMageTo;
    @Size(max = 5)
    @Column(name = "PDT_TYPE")
    private String pdtType;
    @Column(name = "PDT_MAINLIFE_WAIT_DAYS")
    private Integer pdtMainlifeWaitDays;
    @Column(name = "PDT_OTHLIFE_WAIT_DAYS")
    private Integer pdtOthlifeWaitDays;
    @Column(name = "PDT_MIN_TERM")
    private Integer pdtMinTerm;
    @Column(name = "PDT_MAX_TERM")
    private Integer pdtMaxTerm;
    @Column(name = "PDT_GRACE_DAYS")
    private Integer pdtGraceDays;
    @Column(name = "PDT_REINSTATE_DAYS")
    private Integer pdtReinstateDays;
    @Size(max = 5)
    @Column(name = "PDT_STS")
    private String pdtSts;
    @Size(max = 250)
    @Column(name = "PDT_TC_DOC")
    private String pdtTcDoc;

    public ProductTb() {
    }

    public ProductTb(ProductTbDTO protb) {
        this.productTbPK = new ProductTbPK(protb.getProductTbPK());
        this.pdtPlnDepent = protb.getPdtPlnDepent();
        this.pdtCode = protb.getPdtCode();
        this.pdtName = protb.getPdtName();
        this.pdtCrtDt = protb.getPdtCrtDt();
        this.pdtStDt = protb.getPdtStDt();
        this.pdtEndDt = protb.getPdtEndDt();
        this.pdtSysDt = protb.getPdtSysDt();
        this.pdtAppr = protb.getPdtAppr();
        this.pdtApprDt = protb.getPdtApprDt();
        this.pdtMageFrm = protb.getPdtMageFrm();
        this.pdtMageTo = protb.getPdtMageTo();
        this.pdtType = protb.getPdtType();
        this.pdtMainlifeWaitDays = protb.getPdtMainlifeWaitDays();
        this.pdtOthlifeWaitDays = protb.getPdtOthlifeWaitDays();
        this.pdtMinTerm = protb.getPdtMinTerm();
        this.pdtMaxTerm = protb.getPdtMaxTerm();
        this.pdtGraceDays = protb.getPdtGraceDays();
        this.pdtReinstateDays = protb.getPdtReinstateDays();
        this.pdtSts = protb.getPdtSts();
        this.pdtTcDoc = protb.getPdtTcDoc();
    }
    
    

    public ProductTb(ProductTbPK productTbPK) {
        this.productTbPK = productTbPK;
    }

    public ProductTb(int pdtSysid, int pdtIttSysid, int pdtUserSysid) {
        this.productTbPK = new ProductTbPK(pdtSysid, pdtIttSysid, pdtUserSysid);
    }

    public ProductTbPK getProductTbPK() {
        return productTbPK;
    }

    public void setProductTbPK(ProductTbPK productTbPK) {
        this.productTbPK = productTbPK;
    }

    public String getPdtPlnDepent() {
        return pdtPlnDepent;
    }

    public void setPdtPlnDepent(String pdtPlnDepent) {
        this.pdtPlnDepent = pdtPlnDepent;
    }

    public String getPdtCode() {
        return pdtCode;
    }

    public void setPdtCode(String pdtCode) {
        this.pdtCode = pdtCode;
    }

    public String getPdtName() {
        return pdtName;
    }

    public void setPdtName(String pdtName) {
        this.pdtName = pdtName;
    }

    public Date getPdtCrtDt() {
        return pdtCrtDt;
    }

    public void setPdtCrtDt(Date pdtCrtDt) {
        this.pdtCrtDt = pdtCrtDt;
    }

    public Date getPdtStDt() {
        return pdtStDt;
    }

    public void setPdtStDt(Date pdtStDt) {
        this.pdtStDt = pdtStDt;
    }

    public Date getPdtEndDt() {
        return pdtEndDt;
    }

    public void setPdtEndDt(Date pdtEndDt) {
        this.pdtEndDt = pdtEndDt;
    }

    public Date getPdtSysDt() {
        return pdtSysDt;
    }

    public void setPdtSysDt(Date pdtSysDt) {
        this.pdtSysDt = pdtSysDt;
    }

    public String getPdtAppr() {
        return pdtAppr;
    }

    public void setPdtAppr(String pdtAppr) {
        this.pdtAppr = pdtAppr;
    }

    public Date getPdtApprDt() {
        return pdtApprDt;
    }

    public void setPdtApprDt(Date pdtApprDt) {
        this.pdtApprDt = pdtApprDt;
    }

    public Integer getPdtMageFrm() {
        return pdtMageFrm;
    }

    public void setPdtMageFrm(Integer pdtMageFrm) {
        this.pdtMageFrm = pdtMageFrm;
    }

    public Integer getPdtMageTo() {
        return pdtMageTo;
    }

    public void setPdtMageTo(Integer pdtMageTo) {
        this.pdtMageTo = pdtMageTo;
    }

    public String getPdtType() {
        return pdtType;
    }

    public void setPdtType(String pdtType) {
        this.pdtType = pdtType;
    }

    public Integer getPdtMainlifeWaitDays() {
        return pdtMainlifeWaitDays;
    }

    public void setPdtMainlifeWaitDays(Integer pdtMainlifeWaitDays) {
        this.pdtMainlifeWaitDays = pdtMainlifeWaitDays;
    }

    public Integer getPdtOthlifeWaitDays() {
        return pdtOthlifeWaitDays;
    }

    public void setPdtOthlifeWaitDays(Integer pdtOthlifeWaitDays) {
        this.pdtOthlifeWaitDays = pdtOthlifeWaitDays;
    }

    public Integer getPdtMinTerm() {
        return pdtMinTerm;
    }

    public void setPdtMinTerm(Integer pdtMinTerm) {
        this.pdtMinTerm = pdtMinTerm;
    }

    public Integer getPdtMaxTerm() {
        return pdtMaxTerm;
    }

    public void setPdtMaxTerm(Integer pdtMaxTerm) {
        this.pdtMaxTerm = pdtMaxTerm;
    }

    public Integer getPdtGraceDays() {
        return pdtGraceDays;
    }

    public void setPdtGraceDays(Integer pdtGraceDays) {
        this.pdtGraceDays = pdtGraceDays;
    }

    public Integer getPdtReinstateDays() {
        return pdtReinstateDays;
    }

    public void setPdtReinstateDays(Integer pdtReinstateDays) {
        this.pdtReinstateDays = pdtReinstateDays;
    }

    public String getPdtSts() {
        return pdtSts;
    }

    public void setPdtSts(String pdtSts) {
        this.pdtSts = pdtSts;
    }

    public String getPdtTcDoc() {
        return pdtTcDoc;
    }

    public void setPdtTcDoc(String pdtTcDoc) {
        this.pdtTcDoc = pdtTcDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTbPK != null ? productTbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductTb)) {
            return false;
        }
        ProductTb other = (ProductTb) object;
        if ((this.productTbPK == null && other.productTbPK != null) || (this.productTbPK != null && !this.productTbPK.equals(other.productTbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ProductTb[ productTbPK=" + productTbPK + " ]";
    }
    
}
