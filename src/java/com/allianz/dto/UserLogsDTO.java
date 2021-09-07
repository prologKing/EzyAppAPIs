/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.UserLogs;
import java.util.Date;

/**
 *
 * @author Bolaji
 */
public class UserLogsDTO {
    private Integer ulSysid;
    private String ulDesc;
    private String ulCode;
    private String ulType;
    private Date ulDt;
    private String ulUser;

    public UserLogsDTO() {
    }

    public UserLogsDTO(UserLogs ulogs) {
        this.ulSysid = ulogs.getUlSysid();
        this.ulDesc = ulogs.getUlDesc();
        this.ulCode = ulogs.getUlCode();
        this.ulType = ulogs.getUlType();
        this.ulDt = ulogs.getUlDt();
        this.ulUser = ulogs.getUlUser();
    }

    public Integer getUlSysid() {
        return ulSysid;
    }

    public void setUlSysid(Integer ulSysid) {
        this.ulSysid = ulSysid;
    }

    public String getUlDesc() {
        return ulDesc;
    }

    public void setUlDesc(String ulDesc) {
        this.ulDesc = ulDesc;
    }

    public String getUlCode() {
        return ulCode;
    }

    public void setUlCode(String ulCode) {
        this.ulCode = ulCode;
    }

    public String getUlType() {
        return ulType;
    }

    public void setUlType(String ulType) {
        this.ulType = ulType;
    }

    public Date getUlDt() {
        return ulDt;
    }

    public void setUlDt(Date ulDt) {
        this.ulDt = ulDt;
    }

    public String getUlUser() {
        return ulUser;
    }

    public void setUlUser(String ulUser) {
        this.ulUser = ulUser;
    }

    @Override
    public String toString() {
        return "UserLogsDTO{" + "ulSysid=" + ulSysid + ", ulDesc=" + ulDesc + ", ulCode=" + ulCode + ", ulType=" + ulType + ", ulDt=" + ulDt + ", ulUser=" + ulUser + '}';
    }
    
}
