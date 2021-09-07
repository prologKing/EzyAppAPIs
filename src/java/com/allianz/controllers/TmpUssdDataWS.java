/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.controllers;

import com.allianz.dto.CustomerTbDTO;
import com.allianz.dto.ProductAgentsTbDTO;
import com.allianz.dto.ProductConstantSetupDTO;
import com.allianz.dto.ProductFreqMinAmtDTO;
import com.allianz.dto.ProductPlanDTO;
import com.allianz.dto.ProductRidersDTO;
import com.allianz.dto.ProductTbDTO;
import com.allianz.dto.ProductTermDTO;
import com.google.gson.Gson;
import com.allianz.services.TmpUssdDataLogic;
import com.allianz.dto.TmpUssdDataDTO;
import com.allianz.services.CustomerTbLogic;
import com.allianz.services.ProductAgentsTbLogic;
import com.allianz.services.ProductConstantSetupLogic;
import com.allianz.services.ProductFreqMinAmtLogic;
import com.allianz.services.ProductTbLogic;
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
@Path("tmpussd")
public class TmpUssdDataWS {

    /**
     * Creates a new instance of TmpUssdDataWS
     */
    public TmpUssdDataWS() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTmpUssdDatas() throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        List<TmpUssdDataDTO> sblist = new TmpUssdDataLogic().getTmpUssdData();
 
        return (sblist.size() > 0) ? gson.toJson(sblist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{mobile}")
    public String getAccessType(@PathParam("mobile") String mobile) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        TmpUssdDataDTO dmodel = new TmpUssdDataLogic().getTmpUssdDataByMobile(mobile);
 
        return gson.toJson(dmodel);
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("uproduct/{mobile}")
    public String getUnsubscribedProducts(@PathParam("mobile") String mobile) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        List<ProductConstantSetupDTO> datalist = new ProductConstantSetupLogic().getUnSubscribedProductsByMobile(mobile);
 
        return (datalist.size() > 0) ? gson.toJson(datalist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("productinfo/{pid}")
    public String getProductInfo(@PathParam("pid") int pid) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        ProductConstantSetupDTO data = new ProductConstantSetupLogic().getProductConstantSetupById(pid);
 
        return data.getPcsSysid() != 0 ? gson.toJson(data) : "{}";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("agent/{mobile}")
    public String getAgentByMobile(@PathParam("mobile") String mobile) throws SQLException, NamingException, Exception {
         
        Gson gson = new Gson();
        ProductAgentsTbDTO data = new ProductAgentsTbLogic().getProductAgentsTbByMobile("0" + mobile.substring(3));
 
        return data.getProductAgentsTbPK().getPagtSysid() != 0 ? gson.toJson(data) : "{}";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("pdtinfo/{id}")
    public String getProductInfoById(@PathParam("id") int id) throws SQLException, NamingException, Exception {
          
        Gson gson = new Gson();
        ProductTbDTO data = new ProductTbLogic().getProductTbByProdSysId(id);
 
        return data.getProductTbPK().getPdtSysid()!= 0 ? gson.toJson(data) : "{}";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("customer/{mobile}")
    public String getCustomerByMobile(@PathParam("mobile") String mobile) throws SQLException, NamingException, Exception {
         
        Gson gson = new Gson();
        CustomerTbDTO data = new CustomerTbLogic().getCustomerByMobile("0" + mobile.substring(3));
 
        return data.getCustomerTbPK().getCusSysid()!= 0 ? gson.toJson(data) : "{}";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("pdt/frequency/{productid}")
    public String getProductFrequency(@PathParam("productid") String productid) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        List<ProductFreqMinAmtDTO> datalist = new ProductFreqMinAmtLogic().getProductFreqMinAmtById(productid);
  
        return (datalist.size() > 0) ? gson.toJson(datalist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("pdt/plans/{productid}")
    public String getProductPlans(@PathParam("productid") int productid) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();       
        List<ProductPlanDTO> datalist = new ProductFreqMinAmtLogic().getProductPlans(productid);
  
        return (datalist.size() > 0) ? gson.toJson(datalist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("pdt/riders/{productid}")
    public String getProductRiders(@PathParam("productid") int productid) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();
        List<ProductRidersDTO> datalist = new ProductFreqMinAmtLogic().getProductRiders(productid);
  
        return (datalist.size() > 0) ? gson.toJson(datalist) : "[]";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("pdt/terms/{productid}")
    public String getProductTerms(@PathParam("productid") int productid) throws SQLException, NamingException, Exception {

        Gson gson = new Gson();  
        List<ProductTermDTO> datalist = new ProductFreqMinAmtLogic().getProductTerms(productid);
  
        return (datalist.size() > 0) ? gson.toJson(datalist) : "[]";
    }


    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String postTmpUssdData(String content) throws SQLException, NamingException, Exception {
        Gson gson = new Gson();
        TmpUssdDataDTO dmodel = gson.fromJson(content, TmpUssdDataDTO.class);
        String response = new TmpUssdDataLogic().saveTmpUssdData(dmodel);
        return response;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("register")
    public String postRegistrationData(String content) throws SQLException, NamingException, Exception {
        Gson gson = new Gson();
        TmpUssdDataDTO dmodel = gson.fromJson(content, TmpUssdDataDTO.class);
        String response = new TmpUssdDataLogic().saveRegistrationData(dmodel);
        return response;
    }

}
