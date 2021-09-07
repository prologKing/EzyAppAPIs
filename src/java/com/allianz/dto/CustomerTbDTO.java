/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;
import com.allianz.entities.CustomerTb;
import com.allianz.entities.CustomerTbPK;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class CustomerTbDTO {
    CustomerTbPKDTO customerTbPK;
    private String cusCode;
    private Date cusRegDt; 
    private String cusCrtUser;
    private Date cusSysDt;
    private String cusTitle;
    private String cusSurname;
    private String cusMidname;
    private String cusFirstname;
    private String cusGender;
    private Date cusDob;
    private String cusMaritalSts;
    private String cusAddrs;
    private String cusMobile;
    private String cusMomoNo;
    private String cusOccupation;
    private String cusBranchCode;
    private String cusIdTyp;
    private String cusIdNo;
    private String cusPhoto;
    private String cusHometown;
    private String cusBirhtPlc;
    private String cusNationality;
    private String cusResAddrs;
    private String cusTin;
    private String cusLoc;
    private String cusSts;
    private String cusType;
    private String cusEmail;

    public CustomerTbDTO() {
        this.customerTbPK = new CustomerTbPKDTO();
    }
    
    public CustomerTbDTO(Object[] obj) {
        this.customerTbPK = new CustomerTbPKDTO((Integer)obj[0], 0, 0);
        this.cusCode = (String)obj[3];
    }
    
  public CustomerTbDTO(CustomerTb ctb) {
        this.customerTbPK = new CustomerTbPKDTO(ctb.getCustomerTbPK());
        this.cusCode = ctb.getCusCode();
        this.cusRegDt = ctb.getCusRegDt();
        this.cusCrtUser = ctb.getCusCrtUser();
        this.cusSysDt = ctb.getCusSysDt();
        this.cusTitle = ctb.getCusTitle();
        this.cusSurname = ctb.getCusSurname();
        this.cusMidname = ctb.getCusMidname();
        this.cusFirstname = ctb.getCusFirstname();
        this.cusGender = ctb.getCusGender();
        this.cusDob = ctb.getCusDob();
        this.cusMaritalSts = ctb.getCusMaritalSts();
        this.cusAddrs = ctb.getCusAddrs();
        this.cusMobile = ctb.getCusMobile();
        this.cusMomoNo = ctb.getCusMomoNo();
        this.cusOccupation = ctb.getCusOccupation();
        this.cusBranchCode = ctb.getCusBranchCode();
        this.cusIdTyp = ctb.getCusIdTyp();
        this.cusIdNo = ctb.getCusIdNo();
        this.cusPhoto = ctb.getCusPhoto();
        this.cusHometown = ctb.getCusHometown();
        this.cusBirhtPlc = ctb.getCusBirhtPlc();
        this.cusNationality = ctb.getCusNationality();
        this.cusResAddrs = ctb.getCusResAddrs();
        this.cusTin = ctb.getCusTin();
        this.cusLoc = ctb.getCusLoc();
        this.cusSts = ctb.getCusSts();
        this.cusType = ctb.getCusType();
        this.cusEmail = ctb.getCusEmail();
    }

    public CustomerTbPKDTO getCustomerTbPK() {
        return customerTbPK;
    }

    public void setCustomerTbPK(CustomerTbPKDTO customerTbPK) {
        this.customerTbPK = customerTbPK;
    }
    
    

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public Date getCusRegDt() {
        return cusRegDt;
    }

    public void setCusRegDt(Date cusRegDt) {
        this.cusRegDt = cusRegDt;
    }

    public String getCusCrtUser() {
        return cusCrtUser;
    }

    public void setCusCrtUser(String cusCrtUser) {
        this.cusCrtUser = cusCrtUser;
    }

    public Date getCusSysDt() {
        return cusSysDt;
    }

    public void setCusSysDt(Date cusSysDt) {
        this.cusSysDt = cusSysDt;
    }

    public String getCusTitle() {
        return cusTitle;
    }

    public void setCusTitle(String cusTitle) {
        this.cusTitle = cusTitle;
    }

    public String getCusSurname() {
        return cusSurname;
    }

    public void setCusSurname(String cusSurname) {
        this.cusSurname = cusSurname;
    }

    public String getCusMidname() {
        return cusMidname;
    }

    public void setCusMidname(String cusMidname) {
        this.cusMidname = cusMidname;
    }

    public String getCusFirstname() {
        return cusFirstname;
    }

    public void setCusFirstname(String cusFirstname) {
        this.cusFirstname = cusFirstname;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public Date getCusDob() {
        return cusDob;
    }

    public void setCusDob(Date cusDob) {
        this.cusDob = cusDob;
    }

    public String getCusMaritalSts() {
        return cusMaritalSts;
    }

    public void setCusMaritalSts(String cusMaritalSts) {
        this.cusMaritalSts = cusMaritalSts;
    }

    public String getCusAddrs() {
        return cusAddrs;
    }

    public void setCusAddrs(String cusAddrs) {
        this.cusAddrs = cusAddrs;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }

    public String getCusMomoNo() {
        return cusMomoNo;
    }

    public void setCusMomoNo(String cusMomoNo) {
        this.cusMomoNo = cusMomoNo;
    }

    public String getCusOccupation() {
        return cusOccupation;
    }

    public void setCusOccupation(String cusOccupation) {
        this.cusOccupation = cusOccupation;
    }

    public String getCusBranchCode() {
        return cusBranchCode;
    }

    public void setCusBranchCode(String cusBranchCode) {
        this.cusBranchCode = cusBranchCode;
    }

    public String getCusIdTyp() {
        return cusIdTyp;
    }

    public void setCusIdTyp(String cusIdTyp) {
        this.cusIdTyp = cusIdTyp;
    }

    public String getCusIdNo() {
        return cusIdNo;
    }

    public void setCusIdNo(String cusIdNo) {
        this.cusIdNo = cusIdNo;
    }

    public String getCusPhoto() {
        return cusPhoto;
    }

    public void setCusPhoto(String cusPhoto) {
        this.cusPhoto = cusPhoto;
    }

    public String getCusHometown() {
        return cusHometown;
    }

    public void setCusHometown(String cusHometown) {
        this.cusHometown = cusHometown;
    }

    public String getCusBirhtPlc() {
        return cusBirhtPlc;
    }

    public void setCusBirhtPlc(String cusBirhtPlc) {
        this.cusBirhtPlc = cusBirhtPlc;
    }

    public String getCusNationality() {
        return cusNationality;
    }

    public void setCusNationality(String cusNationality) {
        this.cusNationality = cusNationality;
    }

    public String getCusResAddrs() {
        return cusResAddrs;
    }

    public void setCusResAddrs(String cusResAddrs) {
        this.cusResAddrs = cusResAddrs;
    }

    public String getCusTin() {
        return cusTin;
    }

    public void setCusTin(String cusTin) {
        this.cusTin = cusTin;
    }

    public String getCusLoc() {
        return cusLoc;
    }

    public void setCusLoc(String cusLoc) {
        this.cusLoc = cusLoc;
    }

    public String getCusSts() {
        return cusSts;
    }

    public void setCusSts(String cusSts) {
        this.cusSts = cusSts;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    @Override
    public String toString() {
        return "CustomerTbModel{" + "customerTbPK=" + customerTbPK + ", cusCode=" + cusCode + ", cusRegDt=" + cusRegDt + ", cusCrtUser=" + cusCrtUser + ", cusSysDt=" + cusSysDt + ", cusTitle=" + cusTitle + ", cusSurname=" + cusSurname + ", cusMidname=" + cusMidname + ", cusFirstname=" + cusFirstname + ", cusGender=" + cusGender + ", cusDob=" + cusDob + ", cusMaritalSts=" + cusMaritalSts + ", cusAddrs=" + cusAddrs + ", cusMobile=" + cusMobile + ", cusMomoNo=" + cusMomoNo + ", cusOccupation=" + cusOccupation + ", cusBranchCode=" + cusBranchCode + ", cusIdTyp=" + cusIdTyp + ", cusIdNo=" + cusIdNo + ", cusPhoto=" + cusPhoto + ", cusHometown=" + cusHometown + ", cusBirhtPlc=" + cusBirhtPlc + ", cusNationality=" + cusNationality + ", cusResAddrs=" + cusResAddrs + ", cusTin=" + cusTin + ", cusLoc=" + cusLoc + ", cusSts=" + cusSts + ", cusType=" + cusType + ", cusEmail=" + cusEmail + '}';
    }
  
  
      
}
