/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfedu.booklibws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Sergey
 */
@WebService(serviceName = "LogicS")
public interface LogicS {

    /**
     * This is a sample web service operation
     */

    
    @WebMethod
    public String printBookById(@WebParam (name = "bookID") int bookID);
   
    public void setDatabaseProps(@WebParam (name = "db_host") String db_host, 
                                 @WebParam (name = "db_port") String db_port, 
                                 @WebParam (name = "db_name") String db_name, 
                                 @WebParam (name = "db_user") String db_user, 
                                 @WebParam (name = "db_pass") String db_pass);
    
    
    }

