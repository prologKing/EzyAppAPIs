/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.GenerateNumber;

/**
 *
 * @author Developer
 */
public class GenerateNumberDTO {
    private Integer generateindex; 
    private String generateMonth; 
    private String generateClientNo; 
    private String generateMonthPassword; 
    private String generatePasswordNo; 
    private String generateMonthChat; 
    private String generateChatNo; 
    private String generateAgentsId; 
    private String generateAgentsMonth; 
    private String generateCustomerId; 
    private String generateCustomerMonth; 
    private String generateRefNo; 
    private String generateRefMonth; 
    private String generatePolicyNo; 
    private String generateMonthNo; 
    private String generateApi; 
    private String generateMonthNoApi; 
    private String generateClaimsNo; 
    private String generateMonthClaims; 
    private String generateSurrenderNo; 
    private String generateMonthSurrender; 
    private String generateDeathNo; 
    private String generateMonthDeath; 
    private String generateMonthNoTrdId; 
    private String generateTrdId; 
    private String generateMonthUssdPin; 
    private String generateUssdPin; 
    private String generateInterpayNo;

    public GenerateNumberDTO() {
    }

    public GenerateNumberDTO(GenerateNumber genNum) {
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
    
    
    
}
