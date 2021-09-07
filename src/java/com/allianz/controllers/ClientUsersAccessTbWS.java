/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.controllers;

import com.allianz.dto.AccessTypeDTO;
import com.google.gson.Gson;
import com.allianz.services.ClientUsersAccessTbLogic;
import com.allianz.dto.ClientUsersAccessTbDTO;
import java.sql.SQLException;
import java.util.List;
import java.util.TimeZone;
import javax.naming.NamingException;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Bolaji
 */
@Path("useraccess")
public class ClientUsersAccessTbWS {

    /**
     * Creates a new instance of ClientUsersAccessTbWS
     */
    public ClientUsersAccessTbWS() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getClientUsersAccessTbs() throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        List<ClientUsersAccessTbDTO> sblist = new ClientUsersAccessTbLogic().getClientUsersAccessTb();
 
        return (sblist.size() > 0) ? gson.toJson(sblist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{mobile}")
    public String getAccessType(@PathParam("mobile") String mobile) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        AccessTypeDTO dmodel = new ClientUsersAccessTbLogic().getAccessType(mobile);
 
        return gson.toJson(dmodel);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String postClientUsersAccessTb(@PathParam("key") String key, String content) throws SQLException, NamingException, Exception {
        Gson gson = new Gson();
        ClientUsersAccessTbDTO dmodel = gson.fromJson(content, ClientUsersAccessTbDTO.class);
        String response = new ClientUsersAccessTbLogic().saveClientUsersAccess(dmodel);
        return response;
    }

}
