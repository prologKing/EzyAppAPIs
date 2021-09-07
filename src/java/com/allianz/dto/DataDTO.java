/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author Developer
 */
public class DataDTO {
private final String merchantId = "1664";
private String productId;
private String clientPhone;
private String amountToDebit;
private String network;
private String frequencyType;
private String frequency;
private String startDate;
private String endDate;
private String debitDay;
private String apiKey;
private String thirdPartyReferenceNo;
private String refNo;
private String msisdn;
private String amount;
private String narration;

    public DataDTO() {
    }

    public DataDTO(String productId, String clientPhone, String amountToDebit, String network, String frequencyType, String frequency, String startDate, String endDate, String debitDay, String thirdPartyReferenceNo, String apiKey) {
        this.productId = productId;
        this.clientPhone = clientPhone;
        this.amountToDebit = amountToDebit;
        this.network = network;
        this.frequencyType = frequencyType;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.debitDay = debitDay;
        this.thirdPartyReferenceNo = thirdPartyReferenceNo;
        this.apiKey = apiKey;
    }

    public DataDTO(String productId, String network, String apiKey, String refNo, String msisdn, String amount, String narration) {
        this.productId = productId;
        this.network = network;
        this.apiKey = apiKey;
        this.refNo = refNo;
        this.msisdn = msisdn;
        this.amount = amount;
        this.narration = narration;
    }
    
    

    public String getMerchantId() {
        return merchantId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getAmountToDebit() {
        return amountToDebit;
    }

    public void setAmountToDebit(String amountToDebit) {
        this.amountToDebit = amountToDebit;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDebitDay() {
        return debitDay;
    }

    public void setDebitDay(String debitDay) {
        this.debitDay = debitDay;
    }

    public String getApiKiey() {
        return apiKey;
    }

    public String getThirdPartyReferenceNo() {
        return thirdPartyReferenceNo;
    }

    public void setThirdPartyReferenceNo(String thirdPartyReferenceNo) {
        this.thirdPartyReferenceNo = thirdPartyReferenceNo;
    }

@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
