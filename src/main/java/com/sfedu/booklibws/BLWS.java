/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfedu.booklibws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ru.sfedu.booklib.api.PgsqlDatabaseApi;
import ru.sfedu.booklib.model.Book;
import org.apache.log4j.Logger;
import ru.sfedu.booklib.Constants;

/**
 *
 * @author Sergey
 */
@WebService(serviceName = "BLWS")
public class BLWS implements LogicS{
    
    Logger log = Logger.getLogger(BLWS.class);
    
    static String db_host;
    static String db_port;
    static String db_name;
    static String db_user;
    static String db_pass;
    
    @WebMethod
    public void setDatabaseProps(@WebParam (name = "db_host") String db_host, 
                                 @WebParam (name = "db_port") String db_port, 
                                 @WebParam (name = "db_name") String db_name, 
                                 @WebParam (name = "db_user") String db_user, 
                                 @WebParam (name = "db_pass") String db_pass) {
        BLWS.db_host = db_host;
        BLWS.db_port = db_port;
        BLWS.db_name = db_name;
        BLWS.db_user = db_user;
        BLWS.db_pass = db_pass;
    }
    
    
    @WebMethod
    public String printBookById(@WebParam (name = "bookID") int bookID) {
   
            try{
                log.info(db_host + "| " + 
                    db_port + "| " + 
                    db_name + "| " + 
                    db_user + "| " + 
                    db_pass);
                PgsqlDatabaseApi pgsql = new PgsqlDatabaseApi(db_host, db_port, db_name, db_user, db_pass);
                Book bookObject = pgsql.getBookById(bookID);
                String result =
                    bookObject.bookID + "| " + 
                    bookObject.bookName + "| " + 
                    bookObject.bookAuthor + "| " + 
                    bookObject.bookGenre + "| " + 
                    bookObject.bookYear + "| " + 
                    bookObject.bookPublisher + "| " + 
                    bookObject.pageQuantity;
                pgsql.closeConnection();
                return result;
                }
            catch (Exception e){
                String error = e.toString();
                return "suka";
            }
        
    }

    
}
       
       

