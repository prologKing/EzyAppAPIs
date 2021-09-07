/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.dto;

import com.allianz.entities.PolhDetlPK;

/**
 *
 * @author Developer
 */
public class PolhDetlPKDTO {
int polhSysid;
    int polhCusSysid;
    int polhPdtSysid;
    int polhUserSysid;

    public PolhDetlPKDTO() {
    }

    public PolhDetlPKDTO(int polhSysid) {
        this.polhSysid = polhSysid;
    }

    public PolhDetlPKDTO(int polhSysid, int polhCusSysid, int polhPdtSysid, int polhUserSysid) {
        this.polhSysid = polhSysid;
        this.polhCusSysid = polhCusSysid;
        this.polhPdtSysid = polhPdtSysid;
        this.polhUserSysid = polhUserSysid;
    }
    
    
    
   public PolhDetlPKDTO(PolhDetlPK pdpk) {
        this.polhSysid = pdpk.getPolhSysid();
        this.polhCusSysid = pdpk.getPolhCusSysid();
        this.polhPdtSysid = pdpk.getPolhPdtSysid();
        this.polhUserSysid = pdpk.getPolhUserSysid();
    } 

    public int getPolhSysid() {
        return polhSysid;
    }

    public void setPolhSysid(int polhSysid) {
        this.polhSysid = polhSysid;
    }

    public int getPolhCusSysid() {
        return polhCusSysid;
    }

    public void setPolhCusSysid(int polhCusSysid) {
        this.polhCusSysid = polhCusSysid;
    }

    public int getPolhPdtSysid() {
        return polhPdtSysid;
    }

    public void setPolhPdtSysid(int polhPdtSysid) {
        this.polhPdtSysid = polhPdtSysid;
    }

    public int getPolhUserSysid() {
        return polhUserSysid;
    }

    public void setPolhUserSysid(int polhUserSysid) {
        this.polhUserSysid = polhUserSysid;
    }

    @Override
    public String toString() {
        return "PolhDetlPKModel{" + "polhSysid=" + polhSysid + ", polhCusSysid=" + polhCusSysid + ", polhPdtSysid=" + polhPdtSysid + ", polhUserSysid=" + polhUserSysid + '}';
    }
   
   
}
