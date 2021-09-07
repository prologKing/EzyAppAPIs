/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.ClientUsersAccessTbDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "client_users_access_tb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientUsersAccessTb.findAll", query = "SELECT c FROM ClientUsersAccessTb c"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientUserindex", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientUserindex = :clientUserindex"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientUserName", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientUserName = :clientUserName"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientUserPassword", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientUserPassword = :clientUserPassword"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientPasswordDate", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientPasswordDate = :clientPasswordDate"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientUserStatus", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientUserStatus = :clientUserStatus"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientUserInputdate", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientUserInputdate = :clientUserInputdate"),
    @NamedQuery(name = "ClientUsersAccessTb.findByClientChangepassword", query = "SELECT c FROM ClientUsersAccessTb c WHERE c.clientChangepassword = :clientChangepassword")})
public class ClientUsersAccessTb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_userindex")
    private Integer clientUserindex;
    @Size(max = 150)
    @Column(name = "client_user_name")
    private String clientUserName;
    @Size(max = 150)
    @Column(name = "client_user_password")
    private String clientUserPassword;
    @Column(name = "client_password_date")
    @Temporal(TemporalType.DATE)
    private Date clientPasswordDate;
    @Size(max = 150)
    @Column(name = "client_user_status")
    private String clientUserStatus;
    @Column(name = "client_user_inputdate")
    @Temporal(TemporalType.DATE)
    private Date clientUserInputdate;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "pn")
    private String pn;
    @Size(max = 1)
    @Column(name = "client_changepassword")
    private String clientChangepassword;

    public ClientUsersAccessTb() {
    }
    
    public ClientUsersAccessTb(ClientUsersAccessTbDTO cutb) {
        this.clientUserindex = cutb.getClientUserindex();
        this.clientUserName = cutb.getClientUserName();
        this.clientUserPassword = cutb.getClientUserPassword();
        this.clientPasswordDate = cutb.getClientPasswordDate();
        this.clientUserStatus = cutb.getClientUserStatus();
        this.clientUserInputdate = cutb.getClientUserInputdate();
        this.pn = cutb.getPn();
        this.clientChangepassword = cutb.getClientChangepassword();
    }

    public ClientUsersAccessTb(Integer clientUserindex) {
        this.clientUserindex = clientUserindex;
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
    public int hashCode() {
        int hash = 0;
        hash += (clientUserindex != null ? clientUserindex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientUsersAccessTb)) {
            return false;
        }
        ClientUsersAccessTb other = (ClientUsersAccessTb) object;
        if ((this.clientUserindex == null && other.clientUserindex != null) || (this.clientUserindex != null && !this.clientUserindex.equals(other.clientUserindex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.ClientUsersAccessTb[ clientUserindex=" + clientUserindex + " ]";
    }
    
}
