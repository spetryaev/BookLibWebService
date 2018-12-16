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
    
    
    }

