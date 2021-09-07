/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.PolhDetl;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class PolhDetlDTO {
private PolhDetlPKDTO polhDetlPK;
    private int polhPlnSysid;
    private String  polhPrtCode;
    private String  polhPlnCode;
    private String  polhBussSrc;
    private String  polhOff;
    private String  polhNum;
    private String  polhRef;
    private String  polhOldNum1;
    private String  polhOldNum2;
    private String  polhOldNum3;
    private Date  polhIssuDt;
    private Date  polhEntryDt;
    private Date  polhAcceptDt;
    private Date  polhStDt;
    private Date  polhEndDt;
    private Date  polhSysDt;
    private String  polhDudtDt;
    private String  polhTxnSts;
    private String  polhCurr;
    private String  polhUw;
    private String  polhCusCode;
    private Integer polhTnr;
    private Integer polhUwyr;
    private BigDecimal polhSiBc;
    private BigDecimal polhDiscBc;
    private BigDecimal polhLoadBc;
    private BigDecimal polhFeesBc;
    private BigDecimal polhAddPremBc;
    private BigDecimal polhInvestPremBc;
    private BigDecimal adder;
    private String  polhAprvYn;
    private Date  polhAprvDt;
    private String  polhAprvBy;
    private String  polhCreUserBy;
    private Date  polhCreDt;
    private String  polhUpdUserBy;
    private Date  polhUpdDt;
    private BigDecimal polhGrossModPremBc;
    private BigDecimal polhNetModPremBc;
    private String  polhAgnt1;
    private String  polhOvriAgnt2;
    private String  polhOvriAgnt3;
    private String  polhOvriAgnt4;
    private String  polhOvriAgnt5;
    private String  polhEscPlan;
    private BigDecimal polhEscSa;
    private BigDecimal polhEscPrem;
    private BigDecimal polhSuspAmt;
    private BigDecimal polhTotalPrem;
    private Date  polhLpsDt;
    private Date  polhAnnvDt;
    private String  polhSignature;
    private String  polhSts;
    private String  polhAlisNo;
    private String  polhPerferedMode;
    private String  polhNarration;
    private String  polhCaption;
    private String  polhResponse;
    private Date  polhNextDue; 
    private Date  polhLastPaydt;
    private String  polhLastRecno;
    

    public PolhDetlDTO() {
        this.polhDetlPK = new PolhDetlPKDTO();
    }
    
    public PolhDetlDTO(Object[] obj) {
        this.polhNum = (String)obj[0];
        this.polhDetlPK = new PolhDetlPKDTO((Integer)obj[1]);
        this.polhGrossModPremBc = (BigDecimal)obj[2];
    } 
    
    public PolhDetlDTO(PolhDetl pdetail) {
        this.polhDetlPK = new PolhDetlPKDTO(pdetail.getPolhDetlPK());
        this.polhPlnSysid = pdetail.getPolhPlnSysid();
        this.polhPrtCode = pdetail.getPolhPrtCode();
        this.polhPlnCode = pdetail.getPolhPlnCode();
        this.polhBussSrc = pdetail.getPolhBussSrc();
        this.polhOff = pdetail.getPolhOff();
        this.polhNum = pdetail.getPolhNum();
        this.polhRef = pdetail.getPolhRef();
        this.polhOldNum1 = pdetail.getPolhOldNum1();
        this.polhOldNum2 = pdetail.getPolhOldNum2();
        this.polhOldNum3 = pdetail.getPolhOldNum3();
        this.polhIssuDt = pdetail.getPolhIssuDt();
        this.polhEntryDt = pdetail.getPolhEntryDt();
        this.polhAcceptDt = pdetail.getPolhAcceptDt();
        this.polhStDt = pdetail.getPolhStDt();
        this.polhEndDt = pdetail.getPolhEndDt();
        this.polhSysDt = pdetail.getPolhSysDt();
        this.polhDudtDt = pdetail.getPolhDudtDt();
        this.polhTxnSts = pdetail.getPolhTxnSts();
        this.polhCurr = pdetail.getPolhCurr();
        this.polhUw = pdetail.getPolhUw();
        this.polhCusCode = pdetail.getPolhCusCode();
        this.polhTnr = pdetail.getPolhTnr();
        this.polhUwyr = pdetail.getPolhUwyr();
        this.polhSiBc = pdetail.getPolhSiBc();
        this.polhDiscBc = pdetail.getPolhDiscBc();
        this.polhLoadBc = pdetail.getPolhLoadBc();
        this.polhFeesBc = pdetail.getPolhFeesBc();
        this.polhAddPremBc = pdetail.getPolhAddPremBc();
        this.polhInvestPremBc = pdetail.getPolhInvestPremBc();
        this.polhAprvYn = pdetail.getPolhAprvYn();
        this.polhAprvDt = pdetail.getPolhAprvDt();
        this.polhAprvBy = pdetail.getPolhAprvBy();
        this.polhCreUserBy = pdetail.getPolhCreUserBy();
        this.polhCreDt = pdetail.getPolhCreDt();
        this.polhUpdUserBy = pdetail.getPolhUpdUserBy();
        this.polhUpdDt = pdetail.getPolhUpdDt();
        this.polhGrossModPremBc = pdetail.getPolhGrossModPremBc();
        this.polhNetModPremBc = pdetail.getPolhNetModPremBc();
        this.polhAgnt1 = pdetail.getPolhAgnt1();
        this.polhOvriAgnt2 = pdetail.getPolhOvriAgnt2();
        this.polhOvriAgnt3 = pdetail.getPolhOvriAgnt3();
        this.polhOvriAgnt4 = pdetail.getPolhOvriAgnt4();
        this.polhOvriAgnt5 = pdetail.getPolhOvriAgnt5();
        this.polhEscPlan = pdetail.getPolhEscPlan();
        this.polhEscSa = pdetail.getPolhEscSa();
        this.polhEscPrem = pdetail.getPolhEscPrem();
        this.polhSuspAmt = pdetail.getPolhSuspAmt();
        this.polhTotalPrem = pdetail.getPolhTotalPrem();
        this.polhLpsDt = pdetail.getPolhLpsDt();
        this.polhAnnvDt = pdetail.getPolhAnnvDt();
        this.polhSignature = pdetail.getPolhSignature();
        this.polhSts = pdetail.getPolhSts();
        this.polhAlisNo = pdetail.getPolhAlisNo();
        this.polhPerferedMode = pdetail.getPolhPerferedMode();
        this.polhNarration = pdetail.getPolhNarration();
        this.polhCaption = pdetail.getPolhCaption();
        this.polhResponse = pdetail.getPolhResponse();
        this.polhNextDue = pdetail.getPolhNextDue();
        this.polhLastPaydt = pdetail.getPolhLastPaydt();
        this.polhLastRecno = pdetail.getPolhLastRecno();
    }

    public PolhDetlPKDTO getPolhDetlPK() {
        return polhDetlPK;
    }

    public void setPolhDetlPK(PolhDetlPKDTO polhDetlPK) {
        this.polhDetlPK = polhDetlPK;
    }

    public int getPolhPlnSysid() {
        return polhPlnSysid;
    }

    public void setPolhPlnSysid(int polhPlnSysid) {
        this.polhPlnSysid = polhPlnSysid;
    }

    public String getPolhPrtCode() {
        return polhPrtCode;
    }

    public void setPolhPrtCode(String polhPrtCode) {
        this.polhPrtCode = polhPrtCode;
    }

    public String getPolhPlnCode() {
        return polhPlnCode;
    }

    public void setPolhPlnCode(String polhPlnCode) {
        this.polhPlnCode = polhPlnCode;
    }

    public String getPolhBussSrc() {
        return polhBussSrc;
    }

    public void setPolhBussSrc(String polhBussSrc) {
        this.polhBussSrc = polhBussSrc;
    }

    public String getPolhOff() {
        return polhOff;
    }

    public void setPolhOff(String polhOff) {
        this.polhOff = polhOff;
    }

    public String getPolhNum() {
        return polhNum;
    }

    public void setPolhNum(String polhNum) {
        this.polhNum = polhNum;
    }

    public String getPolhRef() {
        return polhRef;
    }

    public void setPolhRef(String polhRef) {
        this.polhRef = polhRef;
    }

    public String getPolhOldNum1() {
        return polhOldNum1;
    }

    public void setPolhOldNum1(String polhOldNum1) {
        this.polhOldNum1 = polhOldNum1;
    }

    public String getPolhOldNum2() {
        return polhOldNum2;
    }

    public void setPolhOldNum2(String polhOldNum2) {
        this.polhOldNum2 = polhOldNum2;
    }

    public String getPolhOldNum3() {
        return polhOldNum3;
    }

    public void setPolhOldNum3(String polhOldNum3) {
        this.polhOldNum3 = polhOldNum3;
    }

    public Date getPolhIssuDt() {
        return polhIssuDt;
    }

    public void setPolhIssuDt(Date polhIssuDt) {
        this.polhIssuDt = polhIssuDt;
    }

    public Date getPolhEntryDt() {
        return polhEntryDt;
    }

    public void setPolhEntryDt(Date polhEntryDt) {
        this.polhEntryDt = polhEntryDt;
    }

    public Date getPolhAcceptDt() {
        return polhAcceptDt;
    }

    public void setPolhAcceptDt(Date polhAcceptDt) {
        this.polhAcceptDt = polhAcceptDt;
    }

    public Date getPolhStDt() {
        return polhStDt;
    }

    public void setPolhStDt(Date polhStDt) {
        this.polhStDt = polhStDt;
    }

    public Date getPolhEndDt() {
        return polhEndDt;
    }

    public void setPolhEndDt(Date polhEndDt) {
        this.polhEndDt = polhEndDt;
    }

    public Date getPolhSysDt() {
        return polhSysDt;
    }

    public void setPolhSysDt(Date polhSysDt) {
        this.polhSysDt = polhSysDt;
    }

    public String getPolhDudtDt() {
        return polhDudtDt;
    }

    public void setPolhDudtDt(String polhDudtDt) {
        this.polhDudtDt = polhDudtDt;
    }

    public String getPolhTxnSts() {
        return polhTxnSts;
    }

    public void setPolhTxnSts(String polhTxnSts) {
        this.polhTxnSts = polhTxnSts;
    }

    public String getPolhCurr() {
        return polhCurr;
    }

    public void setPolhCurr(String polhCurr) {
        this.polhCurr = polhCurr;
    }

    public String getPolhUw() {
        return polhUw;
    }

    public void setPolhUw(String polhUw) {
        this.polhUw = polhUw;
    }

    public String getPolhCusCode() {
        return polhCusCode;
    }

    public void setPolhCusCode(String polhCusCode) {
        this.polhCusCode = polhCusCode;
    }

    public Integer getPolhTnr() {
        return polhTnr;
    }

    public void setPolhTnr(Integer polhTnr) {
        this.polhTnr = polhTnr;
    }

    public Integer getPolhUwyr() {
        return polhUwyr;
    }

    public void setPolhUwyr(Integer polhUwyr) {
        this.polhUwyr = polhUwyr;
    }

    public BigDecimal getPolhSiBc() {
        return polhSiBc;
    }

    public void setPolhSiBc(BigDecimal polhSiBc) {
        this.polhSiBc = polhSiBc;
    }

    public BigDecimal getPolhDiscBc() {
        return polhDiscBc;
    }

    public void setPolhDiscBc(BigDecimal polhDiscBc) {
        this.polhDiscBc = polhDiscBc;
    }

    public BigDecimal getPolhLoadBc() {
        return polhLoadBc;
    }

    public void setPolhLoadBc(BigDecimal polhLoadBc) {
        this.polhLoadBc = polhLoadBc;
    }

    public BigDecimal getPolhFeesBc() {
        return polhFeesBc;
    }

    public void setPolhFeesBc(BigDecimal polhFeesBc) {
        this.polhFeesBc = polhFeesBc;
    }

    public BigDecimal getPolhAddPremBc() {
        return polhAddPremBc;
    }

    public void setPolhAddPremBc(BigDecimal polhAddPremBc) {
        this.polhAddPremBc = polhAddPremBc;
    }

    public BigDecimal getPolhInvestPremBc() {
        return polhInvestPremBc;
    }

    public void setPolhInvestPremBc(BigDecimal polhInvestPremBc) {
        this.polhInvestPremBc = polhInvestPremBc;
    }

    public String getPolhAprvYn() {
        return polhAprvYn;
    }

    public void setPolhAprvYn(String polhAprvYn) {
        this.polhAprvYn = polhAprvYn;
    }

    public Date getPolhAprvDt() {
        return polhAprvDt;
    }

    public void setPolhAprvDt(Date polhAprvDt) {
        this.polhAprvDt = polhAprvDt;
    }

    public String getPolhAprvBy() {
        return polhAprvBy;
    }

    public void setPolhAprvBy(String polhAprvBy) {
        this.polhAprvBy = polhAprvBy;
    }

    public String getPolhCreUserBy() {
        return polhCreUserBy;
    }

    public void setPolhCreUserBy(String polhCreUserBy) {
        this.polhCreUserBy = polhCreUserBy;
    }

    public Date getPolhCreDt() {
        return polhCreDt;
    }

    public void setPolhCreDt(Date polhCreDt) {
        this.polhCreDt = polhCreDt;
    }

    public String getPolhUpdUserBy() {
        return polhUpdUserBy;
    }

    public void setPolhUpdUserBy(String polhUpdUserBy) {
        this.polhUpdUserBy = polhUpdUserBy;
    }

    public Date getPolhUpdDt() {
        return polhUpdDt;
    }

    public void setPolhUpdDt(Date polhUpdDt) {
        this.polhUpdDt = polhUpdDt;
    }

    public BigDecimal getPolhGrossModPremBc() {
        return polhGrossModPremBc;
    }

    public void setPolhGrossModPremBc(BigDecimal polhGrossModPremBc) {
        this.polhGrossModPremBc = polhGrossModPremBc;
    }

    public BigDecimal getPolhNetModPremBc() {
        return polhNetModPremBc;
    }

    public void setPolhNetModPremBc(BigDecimal polhNetModPremBc) {
        this.polhNetModPremBc = polhNetModPremBc;
    }

    public String getPolhAgnt1() {
        return polhAgnt1;
    }

    public void setPolhAgnt1(String polhAgnt1) {
        this.polhAgnt1 = polhAgnt1;
    }

    public String getPolhOvriAgnt2() {
        return polhOvriAgnt2;
    }

    public void setPolhOvriAgnt2(String polhOvriAgnt2) {
        this.polhOvriAgnt2 = polhOvriAgnt2;
    }

    public String getPolhOvriAgnt3() {
        return polhOvriAgnt3;
    }

    public void setPolhOvriAgnt3(String polhOvriAgnt3) {
        this.polhOvriAgnt3 = polhOvriAgnt3;
    }

    public String getPolhOvriAgnt4() {
        return polhOvriAgnt4;
    }

    public void setPolhOvriAgnt4(String polhOvriAgnt4) {
        this.polhOvriAgnt4 = polhOvriAgnt4;
    }

    public String getPolhOvriAgnt5() {
        return polhOvriAgnt5;
    }

    public void setPolhOvriAgnt5(String polhOvriAgnt5) {
        this.polhOvriAgnt5 = polhOvriAgnt5;
    }

    public String getPolhEscPlan() {
        return polhEscPlan;
    }

    public void setPolhEscPlan(String polhEscPlan) {
        this.polhEscPlan = polhEscPlan;
    }

    public BigDecimal getPolhEscSa() {
        return polhEscSa;
    }

    public void setPolhEscSa(BigDecimal polhEscSa) {
        this.polhEscSa = polhEscSa;
    }

    public BigDecimal getPolhEscPrem() {
        return polhEscPrem;
    }

    public void setPolhEscPrem(BigDecimal polhEscPrem) {
        this.polhEscPrem = polhEscPrem;
    }

    public BigDecimal getPolhSuspAmt() {
        return polhSuspAmt;
    }

    public void setPolhSuspAmt(BigDecimal polhSuspAmt) {
        this.polhSuspAmt = polhSuspAmt;
    }

    public BigDecimal getPolhTotalPrem() {
        return polhTotalPrem;
    }

    public void setPolhTotalPrem(BigDecimal polhTotalPrem) {
        this.polhTotalPrem = polhTotalPrem;
    }

    public Date getPolhLpsDt() {
        return polhLpsDt;
    }

    public void setPolhLpsDt(Date polhLpsDt) {
        this.polhLpsDt = polhLpsDt;
    }

    public Date getPolhAnnvDt() {
        return polhAnnvDt;
    }

    public void setPolhAnnvDt(Date polhAnnvDt) {
        this.polhAnnvDt = polhAnnvDt;
    }

    public String getPolhSignature() {
        return polhSignature;
    }

    public void setPolhSignature(String polhSignature) {
        this.polhSignature = polhSignature;
    }

    public String getPolhSts() {
        return polhSts;
    }

    public void setPolhSts(String polhSts) {
        this.polhSts = polhSts;
    }

    public String getPolhAlisNo() {
        return polhAlisNo;
    }

    public void setPolhAlisNo(String polhAlisNo) {
        this.polhAlisNo = polhAlisNo;
    }

    public String getPolhPerferedMode() {
        return polhPerferedMode;
    }

    public void setPolhPerferedMode(String polhPerferedMode) {
        this.polhPerferedMode = polhPerferedMode;
    }

    public String getPolhNarration() {
        return polhNarration;
    }

    public void setPolhNarration(String polhNarration) {
        this.polhNarration = polhNarration;
    }

    public String getPolhCaption() {
        return polhCaption;
    }

    public void setPolhCaption(String polhCaption) {
        this.polhCaption = polhCaption;
    }

    public String getPolhResponse() {
        return polhResponse;
    }

    public void setPolhResponse(String polhResponse) {
        this.polhResponse = polhResponse;
    }

    public Date getPolhNextDue() {
        return polhNextDue;
    }

    public void setPolhNextDue(Date polhNextDue) {
        this.polhNextDue = polhNextDue;
    }

    public Date getPolhLastPaydt() {
        return polhLastPaydt;
    }

    public void setPolhLastPaydt(Date polhLastPaydt) {
        this.polhLastPaydt = polhLastPaydt;
    }

    public String getPolhLastRecno() {
        return polhLastRecno;
    }

    public void setPolhLastRecno(String polhLastRecno) {
        this.polhLastRecno = polhLastRecno;
    }

    @Override
    public String toString() {
        return "PolhDetlModel{" + "polhDetlPK=" + polhDetlPK + ", polhPlnSysid=" + polhPlnSysid + ", polhPrtCode=" + polhPrtCode + ", polhPlnCode=" + polhPlnCode + ", polhBussSrc=" + polhBussSrc + ", polhOff=" + polhOff + ", polhNum=" + polhNum + ", polhRef=" + polhRef + ", polhOldNum1=" + polhOldNum1 + ", polhOldNum2=" + polhOldNum2 + ", polhOldNum3=" + polhOldNum3 + ", polhIssuDt=" + polhIssuDt + ", polhEntryDt=" + polhEntryDt + ", polhAcceptDt=" + polhAcceptDt + ", polhStDt=" + polhStDt + ", polhEndDt=" + polhEndDt + ", polhSysDt=" + polhSysDt + ", polhDudtDt=" + polhDudtDt + ", polhTxnSts=" + polhTxnSts + ", polhCurr=" + polhCurr + ", polhUw=" + polhUw + ", polhCusCode=" + polhCusCode + ", polhTnr=" + polhTnr + ", polhUwyr=" + polhUwyr + ", polhSiBc=" + polhSiBc + ", polhDiscBc=" + polhDiscBc + ", polhLoadBc=" + polhLoadBc + ", polhFeesBc=" + polhFeesBc + ", polhAddPremBc=" + polhAddPremBc + ", polhInvestPremBc=" + polhInvestPremBc + ", polhAprvYn=" + polhAprvYn + ", polhAprvDt=" + polhAprvDt + ", polhAprvBy=" + polhAprvBy + ", polhCreUserBy=" + polhCreUserBy + ", polhCreDt=" + polhCreDt + ", polhUpdUserBy=" + polhUpdUserBy + ", polhUpdDt=" + polhUpdDt + ", polhGrossModPremBc=" + polhGrossModPremBc + ", polhNetModPremBc=" + polhNetModPremBc + ", polhAgnt1=" + polhAgnt1 + ", polhOvriAgnt2=" + polhOvriAgnt2 + ", polhOvriAgnt3=" + polhOvriAgnt3 + ", polhOvriAgnt4=" + polhOvriAgnt4 + ", polhOvriAgnt5=" + polhOvriAgnt5 + ", polhEscPlan=" + polhEscPlan + ", polhEscSa=" + polhEscSa + ", polhEscPrem=" + polhEscPrem + ", polhSuspAmt=" + polhSuspAmt + ", polhTotalPrem=" + polhTotalPrem + ", polhLpsDt=" + polhLpsDt + ", polhAnnvDt=" + polhAnnvDt + ", polhSignature=" + polhSignature + ", polhSts=" + polhSts + ", polhAlisNo=" + polhAlisNo + ", polhPerferedMode=" + polhPerferedMode + ", polhNarration=" + polhNarration + ", polhCaption=" + polhCaption + ", polhResponse=" + polhResponse + ", polhNextDue=" + polhNextDue + ", polhLastPaydt=" + polhLastPaydt + ", polhLastRecno=" + polhLastRecno + '}';
    }
    
    
    
}
