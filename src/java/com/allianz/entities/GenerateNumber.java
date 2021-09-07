/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.GenerateNumberDTO;
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
@Table(name = "generate_number")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GenerateNumber.findAll", query = "SELECT g FROM GenerateNumber g"),
    @NamedQuery(name = "GenerateNumber.findByGenerateindex", query = "SELECT g FROM GenerateNumber g WHERE g.generateindex = :generateindex"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonth", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonth = :generateMonth"),
    @NamedQuery(name = "GenerateNumber.findByGenerateClientNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateClientNo = :generateClientNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthPassword", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthPassword = :generateMonthPassword"),
    @NamedQuery(name = "GenerateNumber.findByGeneratePasswordNo", query = "SELECT g FROM GenerateNumber g WHERE g.generatePasswordNo = :generatePasswordNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthChat", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthChat = :generateMonthChat"),
    @NamedQuery(name = "GenerateNumber.findByGenerateChatNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateChatNo = :generateChatNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateAgentsId", query = "SELECT g FROM GenerateNumber g WHERE g.generateAgentsId = :generateAgentsId"),
    @NamedQuery(name = "GenerateNumber.findByGenerateAgentsMonth", query = "SELECT g FROM GenerateNumber g WHERE g.generateAgentsMonth = :generateAgentsMonth"),
    @NamedQuery(name = "GenerateNumber.findByGenerateCustomerId", query = "SELECT g FROM GenerateNumber g WHERE g.generateCustomerId = :generateCustomerId"),
    @NamedQuery(name = "GenerateNumber.findByGenerateCustomerMonth", query = "SELECT g FROM GenerateNumber g WHERE g.generateCustomerMonth = :generateCustomerMonth"),
    @NamedQuery(name = "GenerateNumber.findByGenerateRefNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateRefNo = :generateRefNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateRefMonth", query = "SELECT g FROM GenerateNumber g WHERE g.generateRefMonth = :generateRefMonth"),
    @NamedQuery(name = "GenerateNumber.findByGeneratePolicyNo", query = "SELECT g FROM GenerateNumber g WHERE g.generatePolicyNo = :generatePolicyNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthNo = :generateMonthNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateApi", query = "SELECT g FROM GenerateNumber g WHERE g.generateApi = :generateApi"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthNoApi", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthNoApi = :generateMonthNoApi"),
    @NamedQuery(name = "GenerateNumber.findByGenerateClaimsNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateClaimsNo = :generateClaimsNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthClaims", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthClaims = :generateMonthClaims"),
    @NamedQuery(name = "GenerateNumber.findByGenerateSurrenderNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateSurrenderNo = :generateSurrenderNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthSurrender", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthSurrender = :generateMonthSurrender"),
    @NamedQuery(name = "GenerateNumber.findByGenerateDeathNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateDeathNo = :generateDeathNo"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthDeath", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthDeath = :generateMonthDeath"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthNoTrdId", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthNoTrdId = :generateMonthNoTrdId"),
    @NamedQuery(name = "GenerateNumber.findByGenerateTrdId", query = "SELECT g FROM GenerateNumber g WHERE g.generateTrdId = :generateTrdId"),
    @NamedQuery(name = "GenerateNumber.findByGenerateMonthUssdPin", query = "SELECT g FROM GenerateNumber g WHERE g.generateMonthUssdPin = :generateMonthUssdPin"),
    @NamedQuery(name = "GenerateNumber.findByGenerateUssdPin", query = "SELECT g FROM GenerateNumber g WHERE g.generateUssdPin = :generateUssdPin"),
    @NamedQuery(name = "GenerateNumber.findByGenerateInterpayNo", query = "SELECT g FROM GenerateNumber g WHERE g.generateInterpayNo = :generateInterpayNo")})
public class GenerateNumber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "generateindex")
    private Integer generateindex;
    @Size(max = 3)
    @Column(name = "generate_month")
    private String generateMonth;
    @Size(max = 45)
    @Column(name = "generate_client_no")
    private String generateClientNo;
    @Size(max = 3)
    @Column(name = "generate_month_password")
    private String generateMonthPassword;
    @Size(max = 45)
    @Column(name = "generate_password_no")
    private String generatePasswordNo;
    @Size(max = 15)
    @Column(name = "generate_month_chat")
    private String generateMonthChat;
    @Size(max = 15)
    @Column(name = "generate_chat_no")
    private String generateChatNo;
    @Size(max = 15)
    @Column(name = "generate_agents_id")
    private String generateAgentsId;
    @Size(max = 15)
    @Column(name = "generate_agents_month")
    private String generateAgentsMonth;
    @Size(max = 15)
    @Column(name = "generate_customer_id")
    private String generateCustomerId;
    @Size(max = 15)
    @Column(name = "generate_customer_month")
    private String generateCustomerMonth;
    @Size(max = 15)
    @Column(name = "generate_ref_no")
    private String generateRefNo;
    @Size(max = 15)
    @Column(name = "generate_ref_month")
    private String generateRefMonth;
    @Size(max = 15)
    @Column(name = "generate_policy_no")
    private String generatePolicyNo;
    @Size(max = 15)
    @Column(name = "generate_month_no")
    private String generateMonthNo;
    @Size(max = 15)
    @Column(name = "generate_api")
    private String generateApi;
    @Size(max = 15)
    @Column(name = "generate_month_no_api")
    private String generateMonthNoApi;
    @Size(max = 15)
    @Column(name = "generate_claims_no")
    private String generateClaimsNo;
    @Size(max = 15)
    @Column(name = "generate_month_claims")
    private String generateMonthClaims;
    @Size(max = 15)
    @Column(name = "generate_surrender_no")
    private String generateSurrenderNo;
    @Size(max = 15)
    @Column(name = "generate_month_surrender")
    private String generateMonthSurrender;
    @Size(max = 15)
    @Column(name = "generate_death_no")
    private String generateDeathNo;
    @Size(max = 15)
    @Column(name = "generate_month_death")
    private String generateMonthDeath;
    @Size(max = 15)
    @Column(name = "generate_month_no_trd_id")
    private String generateMonthNoTrdId;
    @Size(max = 15)
    @Column(name = "generate_trd_id")
    private String generateTrdId;
    @Size(max = 15)
    @Column(name = "generate_month_ussd_pin")
    private String generateMonthUssdPin;
    @Size(max = 15)
    @Column(name = "generate_ussd_pin")
    private String generateUssdPin;
    @Size(max = 15)
    @Column(name = "generate_interpay_no")
    private String generateInterpayNo;

    public GenerateNumber() {
    }

    public GenerateNumber(GenerateNumberDTO genNum) {
        this.generateindex = genNum.getGenerateindex();
        this.generateMonth = genNum.getGenerateMonth();
        this.generateClientNo = genNum.getGenerateClientNo();
        this.generateMonthPassword = genNum.getGenerateMonthPassword();
        this.generatePasswordNo = genNum.getGeneratePasswordNo();
        this.generateMonthChat = genNum.getGenerateMonthChat();
        this.generateChatNo = genNum.getGenerateChatNo();
        this.generateAgentsId = genNum.getGenerateAgentsId();
        this.generateAgentsMonth = genNum.getGenerateAgentsMonth();
        this.generateCustomerId = genNum.getGenerateCustomerId();
        this.generateCustomerMonth = genNum.getGenerateCustomerMonth();
        this.generateRefNo = genNum.getGenerateRefNo();
        this.generateRefMonth = genNum.getGenerateRefMonth();
        this.generatePolicyNo = genNum.getGeneratePolicyNo();
        this.generateMonthNo = genNum.getGenerateMonthNo();
        this.generateApi = genNum.getGenerateApi();
        this.generateMonthNoApi = genNum.getGenerateMonthNoApi();
        this.generateClaimsNo = genNum.getGenerateClaimsNo();
        this.generateMonthClaims = genNum.getGenerateMonthClaims();
        this.generateSurrenderNo = genNum.getGenerateSurrenderNo();
        this.generateMonthSurrender = genNum.getGenerateMonthSurrender();
        this.generateDeathNo = genNum.getGenerateDeathNo();
        this.generateMonthDeath = genNum.getGenerateMonthDeath();
        this.generateMonthNoTrdId = genNum.getGenerateMonthNoTrdId();
        this.generateTrdId = genNum.getGenerateTrdId();
        this.generateMonthUssdPin = genNum.getGenerateMonthUssdPin();
        this.generateUssdPin = genNum.getGenerateUssdPin();
        this.generateInterpayNo = genNum.getGenerateInterpayNo();
    }
    
    

    public GenerateNumber(Integer generateindex) {
        this.generateindex = generateindex;
    }

    public Integer getGenerateindex() {
        return generateindex;
    }

    public void setGenerateindex(Integer generateindex) {
        this.generateindex = generateindex;
    }

    public String getGenerateMonth() {
        return generateMonth;
    }

    public void setGenerateMonth(String generateMonth) {
        this.generateMonth = generateMonth;
    }

    public String getGenerateClientNo() {
        return generateClientNo;
    }

    public void setGenerateClientNo(String generateClientNo) {
        this.generateClientNo = generateClientNo;
    }

    public String getGenerateMonthPassword() {
        return generateMonthPassword;
    }

    public void setGenerateMonthPassword(String generateMonthPassword) {
        this.generateMonthPassword = generateMonthPassword;
    }

    public String getGeneratePasswordNo() {
        return generatePasswordNo;
    }

    public void setGeneratePasswordNo(String generatePasswordNo) {
        this.generatePasswordNo = generatePasswordNo;
    }

    public String getGenerateMonthChat() {
        return generateMonthChat;
    }

    public void setGenerateMonthChat(String generateMonthChat) {
        this.generateMonthChat = generateMonthChat;
    }

    public String getGenerateChatNo() {
        return generateChatNo;
    }

    public void setGenerateChatNo(String generateChatNo) {
        this.generateChatNo = generateChatNo;
    }

    public String getGenerateAgentsId() {
        return generateAgentsId;
    }

    public void setGenerateAgentsId(String generateAgentsId) {
        this.generateAgentsId = generateAgentsId;
    }

    public String getGenerateAgentsMonth() {
        return generateAgentsMonth;
    }

    public void setGenerateAgentsMonth(String generateAgentsMonth) {
        this.generateAgentsMonth = generateAgentsMonth;
    }

    public String getGenerateCustomerId() {
        return generateCustomerId;
    }

    public void setGenerateCustomerId(String generateCustomerId) {
        this.generateCustomerId = generateCustomerId;
    }

    public String getGenerateCustomerMonth() {
        return generateCustomerMonth;
    }

    public void setGenerateCustomerMonth(String generateCustomerMonth) {
        this.generateCustomerMonth = generateCustomerMonth;
    }

    public String getGenerateRefNo() {
        return generateRefNo;
    }

    public void setGenerateRefNo(String generateRefNo) {
        this.generateRefNo = generateRefNo;
    }

    public String getGenerateRefMonth() {
        return generateRefMonth;
    }

    public void setGenerateRefMonth(String generateRefMonth) {
        this.generateRefMonth = generateRefMonth;
    }

    public String getGeneratePolicyNo() {
        return generatePolicyNo;
    }

    public void setGeneratePolicyNo(String generatePolicyNo) {
        this.generatePolicyNo = generatePolicyNo;
    }

    public String getGenerateMonthNo() {
        return generateMonthNo;
    }

    public void setGenerateMonthNo(String generateMonthNo) {
        this.generateMonthNo = generateMonthNo;
    }

    public String getGenerateApi() {
        return generateApi;
    }

    public void setGenerateApi(String generateApi) {
        this.generateApi = generateApi;
    }

    public String getGenerateMonthNoApi() {
        return generateMonthNoApi;
    }

    public void setGenerateMonthNoApi(String generateMonthNoApi) {
        this.generateMonthNoApi = generateMonthNoApi;
    }

    public String getGenerateClaimsNo() {
        return generateClaimsNo;
    }

    public void setGenerateClaimsNo(String generateClaimsNo) {
        this.generateClaimsNo = generateClaimsNo;
    }

    public String getGenerateMonthClaims() {
        return generateMonthClaims;
    }

    public void setGenerateMonthClaims(String generateMonthClaims) {
        this.generateMonthClaims = generateMonthClaims;
    }

    public String getGenerateSurrenderNo() {
        return generateSurrenderNo;
    }

    public void setGenerateSurrenderNo(String generateSurrenderNo) {
        this.generateSurrenderNo = generateSurrenderNo;
    }

    public String getGenerateMonthSurrender() {
        return generateMonthSurrender;
    }

    public void setGenerateMonthSurrender(String generateMonthSurrender) {
        this.generateMonthSurrender = generateMonthSurrender;
    }

    public String getGenerateDeathNo() {
        return generateDeathNo;
    }

    public void setGenerateDeathNo(String generateDeathNo) {
        this.generateDeathNo = generateDeathNo;
    }

    public String getGenerateMonthDeath() {
        return generateMonthDeath;
    }

    public void setGenerateMonthDeath(String generateMonthDeath) {
        this.generateMonthDeath = generateMonthDeath;
    }

    public String getGenerateMonthNoTrdId() {
        return generateMonthNoTrdId;
    }

    public void setGenerateMonthNoTrdId(String generateMonthNoTrdId) {
        this.generateMonthNoTrdId = generateMonthNoTrdId;
    }

    public String getGenerateTrdId() {
        return generateTrdId;
    }

    public void setGenerateTrdId(String generateTrdId) {
        this.generateTrdId = generateTrdId;
    }

    public String getGenerateMonthUssdPin() {
        return generateMonthUssdPin;
    }

    public void setGenerateMonthUssdPin(String generateMonthUssdPin) {
        this.generateMonthUssdPin = generateMonthUssdPin;
    }

    public String getGenerateUssdPin() {
        return generateUssdPin;
    }

    public void setGenerateUssdPin(String generateUssdPin) {
        this.generateUssdPin = generateUssdPin;
    }

    public String getGenerateInterpayNo() {
        return generateInterpayNo;
    }

    public void setGenerateInterpayNo(String generateInterpayNo) {
        this.generateInterpayNo = generateInterpayNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (generateindex != null ? generateindex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GenerateNumber)) {
            return false;
        }
        GenerateNumber other = (GenerateNumber) object;
        if ((this.generateindex == null && other.generateindex != null) || (this.generateindex != null && !this.generateindex.equals(other.generateindex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.GenerateNumber[ generateindex=" + generateindex + " ]";
    }
    
}
