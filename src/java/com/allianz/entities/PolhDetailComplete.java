/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.PolhDetailCompleteDTO;
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
@Table(name = "polh_detail_complete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PolhDetailComplete.findAll", query = "SELECT p FROM PolhDetailComplete p"),
    @NamedQuery(name = "PolhDetailComplete.findByPolhCompleteIndex", query = "SELECT p FROM PolhDetailComplete p WHERE p.polhCompleteIndex = :polhCompleteIndex"),
    @NamedQuery(name = "PolhDetailComplete.findByPolicyNo", query = "SELECT p FROM PolhDetailComplete p WHERE p.policyNo = :policyNo"),
    @NamedQuery(name = "PolhDetailComplete.findByCompleteStatus", query = "SELECT p FROM PolhDetailComplete p WHERE p.completeStatus = :completeStatus"),
    @NamedQuery(name = "PolhDetailComplete.findByItcPolSent", query = "SELECT p FROM PolhDetailComplete p WHERE p.itcPolSent = :itcPolSent"),
    @NamedQuery(name = "PolhDetailComplete.findByItcPolAmount", query = "SELECT p FROM PolhDetailComplete p WHERE p.itcPolAmount = :itcPolAmount"),
    @NamedQuery(name = "PolhDetailComplete.findByItcPolFreq", query = "SELECT p FROM PolhDetailComplete p WHERE p.itcPolFreq = :itcPolFreq"),
    @NamedQuery(name = "PolhDetailComplete.findByItcDeductionType", query = "SELECT p FROM PolhDetailComplete p WHERE p.itcDeductionType = :itcDeductionType"),
    @NamedQuery(name = "PolhDetailComplete.findByItcUSSDstatus", query = "SELECT p FROM PolhDetailComplete p WHERE p.itcUSSDstatus = :itcUSSDstatus")})
public class PolhDetailComplete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "polh_complete_index")
    private Integer polhCompleteIndex;
    @Size(max = 50)
    @Column(name = "policy_no")
    private String policyNo;
    @Size(max = 1)
    @Column(name = "complete_status")
    private String completeStatus;
    @Size(max = 50)
    @Column(name = "itc_pol_sent")
    private String itcPolSent;
    @Size(max = 50)
    @Column(name = "itc_pol_amount")
    private String itcPolAmount;
    @Size(max = 50)
    @Column(name = "itc_pol_freq")
    private String itcPolFreq;
    @Size(max = 50)
    @Column(name = "itc_deduction_type")
    private String itcDeductionType;
    @Size(max = 1)
    @Column(name = "itc_USSD_status")
    private String itcUSSDstatus;

    public PolhDetailComplete() {
    }

    public PolhDetailComplete(PolhDetailCompleteDTO pdc) {
        this.polhCompleteIndex = pdc.getPolhCompleteIndex();
        this.policyNo = pdc.getPolicyNo();
        this.completeStatus = pdc.getCompleteStatus();
        this.itcPolSent = pdc.getItcPolSent();
        this.itcPolAmount = pdc.getItcPolAmount();
        this.itcPolFreq = pdc.getItcPolFreq();
        this.itcDeductionType = pdc.getItcDeductionType();
        this.itcUSSDstatus = pdc.getItcUSSDstatus();
    }
    
    

    public PolhDetailComplete(Integer polhCompleteIndex) {
        this.polhCompleteIndex = polhCompleteIndex;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (polhCompleteIndex != null ? polhCompleteIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolhDetailComplete)) {
            return false;
        }
        PolhDetailComplete other = (PolhDetailComplete) object;
        if ((this.polhCompleteIndex == null && other.polhCompleteIndex != null) || (this.polhCompleteIndex != null && !this.polhCompleteIndex.equals(other.polhCompleteIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.PolhDetailComplete[ polhCompleteIndex=" + polhCompleteIndex + " ]";
    }
    
}
