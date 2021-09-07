/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.PolhDetailComplete;

/**
 *
 * @author Developer
 */
public class PolhDetailCompleteDTO {
    private Integer polhCompleteIndex;
    private String policyNo;
    private String completeStatus;
    private String itcPolSent;
    private String itcPolAmount;
    private String itcPolFreq;
    private String itcDeductionType;
    private String itcUSSDstatus;

    public PolhDetailCompleteDTO() {
    }

    public PolhDetailCompleteDTO(Integer polhCompleteIndex, String policyNo, String completeStatus) {
        this.polhCompleteIndex = polhCompleteIndex;
        this.policyNo = policyNo;
        this.completeStatus = completeStatus;
    }

    public PolhDetailCompleteDTO(PolhDetailComplete pdc) {
        this.polhCompleteIndex = pdc.getPolhCompleteIndex();
        this.policyNo = pdc.getPolicyNo();
        this.completeStatus = pdc.getCompleteStatus();
        this.itcPolSent = pdc.getItcPolSent();
        this.itcPolAmount = pdc.getItcPolAmount();
        this.itcPolFreq = pdc.getItcPolFreq();
        this.itcDeductionType = pdc.getItcDeductionType();
        this.itcUSSDstatus = pdc.getItcUSSDstatus();
    }

    public Integer getPolhCompleteIndex() {
        return polhCompleteIndex;
    }

    public void setPolhCompleteIndex(Integer polhCompleteIndex) {
        this.polhCompleteIndex = polhCompleteIndex;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getCompleteStatus() {
        return completeStatus;
    }

    public void setCompleteStatus(String completeStatus) {
        this.completeStatus = completeStatus;
    }

    public String getItcPolSent() {
        return itcPolSent;
    }

    public void setItcPolSent(String itcPolSent) {
        this.itcPolSent = itcPolSent;
    }

    public String getItcPolAmount() {
        return itcPolAmount;
    }

    public void setItcPolAmount(String itcPolAmount) {
        this.itcPolAmount = itcPolAmount;
    }

    public String getItcPolFreq() {
        return itcPolFreq;
    }

    public void setItcPolFreq(String itcPolFreq) {
        this.itcPolFreq = itcPolFreq;
    }

    public String getItcDeductionType() {
        return itcDeductionType;
    }

    public void setItcDeductionType(String itcDeductionType) {
        this.itcDeductionType = itcDeductionType;
    }

    public String getItcUSSDstatus() {
        return itcUSSDstatus;
    }

    public void setItcUSSDstatus(String itcUSSDstatus) {
        this.itcUSSDstatus = itcUSSDstatus;
    }
    
    
}
