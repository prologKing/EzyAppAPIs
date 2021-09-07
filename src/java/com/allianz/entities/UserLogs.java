/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.UserLogsDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "user_logs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserLogs.findAll", query = "SELECT u FROM UserLogs u"),
    @NamedQuery(name = "UserLogs.findByUlSysid", query = "SELECT u FROM UserLogs u WHERE u.ulSysid = :ulSysid"),
    @NamedQuery(name = "UserLogs.findByUlDesc", query = "SELECT u FROM UserLogs u WHERE u.ulDesc = :ulDesc"),
    @NamedQuery(name = "UserLogs.findByUlCode", query = "SELECT u FROM UserLogs u WHERE u.ulCode = :ulCode"),
    @NamedQuery(name = "UserLogs.findByUlType", query = "SELECT u FROM UserLogs u WHERE u.ulType = :ulType"),
    @NamedQuery(name = "UserLogs.findByUlDt", query = "SELECT u FROM UserLogs u WHERE u.ulDt = :ulDt"),
    @NamedQuery(name = "UserLogs.findByUlUser", query = "SELECT u FROM UserLogs u WHERE u.ulUser = :ulUser")})
public class UserLogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UL_SYSID")
    private Integer ulSysid;
    @Size(max = 150)
    @Column(name = "UL_DESC")
    private String ulDesc;
    @Size(max = 150)
    @Column(name = "UL_CODE")
    private String ulCode;
    @Size(max = 150)
    @Column(name = "UL_TYPE")
    private String ulType;
    @Column(name = "UL_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ulDt;
    @Size(max = 150)
    @Column(name = "UL_USER")
    private String ulUser;

    public UserLogs() {
    }
    
    public UserLogs(UserLogsDTO ulogs) {
        this.ulSysid = ulogs.getUlSysid();
        this.ulDesc = ulogs.getUlDesc();
        this.ulCode = ulogs.getUlCode();
        this.ulType = ulogs.getUlType();
        this.ulDt = ulogs.getUlDt();
        this.ulUser = ulogs.getUlUser();
    }

    public UserLogs(Integer ulSysid) {
        this.ulSysid = ulSysid;
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
    public int hashCode() {
        int hash = 0;
        hash += (ulSysid != null ? ulSysid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLogs)) {
            return false;
        }
        UserLogs other = (UserLogs) object;
        if ((this.ulSysid == null && other.ulSysid != null) || (this.ulSysid != null && !this.ulSysid.equals(other.ulSysid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.UserLogs[ ulSysid=" + ulSysid + " ]";
    }
    
}
