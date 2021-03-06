/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ProductTb;
import com.allianz.entities.ProductTbPK;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class ProductTbDTO {
  private ProductTbPKDTO productTbPK;
  private String pdtPlnDepent;
  private String pdtCode;
  private String pdtName;
  private Date pdtCrtDt;
  private Date pdtStDt;
  private Date pdtEndDt;
  private Date pdtSysDt;
  private String pdtAppr;
  private Date pdtApprDt;
  private Integer pdtMageFrm;
  private Integer pdtMageTo;
  private String pdtType;
  private Integer pdtMainlifeWaitDays;
  private Integer pdtOthlifeWaitDays;
  private Integer pdtMinTerm;
  private Integer pdtMaxTerm;
  private Integer pdtGraceDays;
  private Integer pdtReinstateDays;
  private String pdtSts;
  private String pdtTcDoc;

    public ProductTbDTO() {
    }

    public ProductTbDTO(ProductTb protb) {
        this.productTbPK = new ProductTbPKDTO(protb.getProductTbPK());
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
    
    

    public ProductTbPKDTO getProductTbPK() {
        return productTbPK;
    }

    public void setProductTbPK(ProductTbPKDTO productTbPK) {
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
    public String toString() {
        return "ProductTbDTO{" + "productTbPK=" + productTbPK + ", pdtPlnDepent=" + pdtPlnDepent + ", pdtCode=" + pdtCode + ", pdtName=" + pdtName + ", pdtCrtDt=" + pdtCrtDt + ", pdtStDt=" + pdtStDt + ", pdtEndDt=" + pdtEndDt + ", pdtSysDt=" + pdtSysDt + ", pdtAppr=" + pdtAppr + ", pdtApprDt=" + pdtApprDt + ", pdtMageFrm=" + pdtMageFrm + ", pdtMageTo=" + pdtMageTo + ", pdtType=" + pdtType + ", pdtMainlifeWaitDays=" + pdtMainlifeWaitDays + ", pdtOthlifeWaitDays=" + pdtOthlifeWaitDays + ", pdtMinTerm=" + pdtMinTerm + ", pdtMaxTerm=" + pdtMaxTerm + ", pdtGraceDays=" + pdtGraceDays + ", pdtReinstateDays=" + pdtReinstateDays + ", pdtSts=" + pdtSts + ", pdtTcDoc=" + pdtTcDoc + '}';
    }

  
}
