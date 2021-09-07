/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.ClientUsersAccessTb;
import java.util.Date;

/**
 *
 * @author Developer
 */
public class ClientUsersAccessTbDTO {
    private Integer clientUserindex;
    private String clientUserName;
    private String clientUserPassword;
    private Date clientPasswordDate;
    private String clientUserStatus;
    private Date clientUserInputdate;
    private String pn;
    private String clientChangepassword;

    public ClientUsersAccessTbDTO() {
    }

    public ClientUsersAccessTbDTO(ClientUsersAccessTb cutb) {
        this.clientUserindex = cutb.getClientUserindex();
        this.clientUserName = cutb.getClientUserName();
        this.clientUserPassword = cutb.getClientUserPassword();
        this.clientPasswordDate = cutb.getClientPasswordDate();
        this.clientUserStatus = cutb.getClientUserStatus();
        this.clientUserInputdate = cutb.getClientUserInputdate();
        this.pn = cutb.getPn();
        this.clientChangepassword = cutb.getClientChangepassword();
    }

    public Integer getClientUserindex() {
        return clientUserindex;
    }

    public void setClientUserindex(Integer clientUserindex) {
        this.clientUserindex = clientUserindex;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getClientUserPassword() {
        return clientUserPassword;
    }

    public void setClientUserPassword(String clientUserPassword) {
        this.clientUserPassword = clientUserPassword;
    }

    public Date getClientPasswordDate() {
        return clientPasswordDate;
    }

    public void setClientPasswordDate(Date clientPasswordDate) {
        this.clientPasswordDate = clientPasswordDate;
    }

    public String getClientUserStatus() {
        return clientUserStatus;
    }

    public void setClientUserStatus(String clientUserStatus) {
        this.clientUserStatus = clientUserStatus;
    }

    public Date getClientUserInputdate() {
        return clientUserInputdate;
    }

    public void setClientUserInputdate(Date clientUserInputdate) {
        this.clientUserInputdate = clientUserInputdate;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getClientChangepassword() {
        return clientChangepassword;
    }

    public void setClientChangepassword(String clientChangepassword) {
        this.clientChangepassword = clientChangepassword;
    }

    @Override
    public String toString() {
        return "ClientUsersAccessTbDTO{" + "clientUserindex=" + clientUserindex + ", clientUserName=" + clientUserName + ", clientUserPassword=" + clientUserPassword + ", clientPasswordDate=" + clientPasswordDate + ", clientUserStatus=" + clientUserStatus + ", clientUserInputdate=" + clientUserInputdate + ", pn=" + pn + ", clientChangepassword=" + clientChangepassword + '}';
    }
    
    
}
