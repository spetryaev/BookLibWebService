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

/**
 *
 * @author Sergey
 */
@WebService(serviceName = "BLWS")
public class BLWS implements LogicS{
    
    
    static PgsqlDatabaseApi pgsql = new PgsqlDatabaseApi();
    String txt;

    @WebMethod
    public String printBookById(@WebParam (name = "bookID") int bookID) {
   
            try{
                Book bookObject = pgsql.getBookById(bookID);
                String result =
                    bookObject.bookID + ", " + 
                    bookObject.bookName + ", " + 
                    bookObject.bookAuthor + ", " + 
                    bookObject.bookGenre + ", " + 
                    bookObject.bookYear + ", " + 
                    bookObject.bookPublisher + ", " + 
                    bookObject.pageQuantity;
                return result;
                }
            catch (Exception e){
                String error = e.toString();
                return "suka";
            }
        
    }
}
       
       

