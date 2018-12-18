/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfedu.booklibws;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergey
 */
public class BLWSTest {
    
    public BLWSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hello method, of class BLWS.
     */
  
    /**
     * Test of connectToDatabase method, of class BLWS.
     */
   

    //@Test при включенном тесте данные базы будут загружены автоматически.
    public void testPrintBookById() {
         System.out.println("setDatabaseProps");
        String db_host = "127.0.0.1";
        String db_port = "5432";
        String db_name = "db";
        String db_user = "postgres";
        String db_pass = "somepass";
        BLWS instance = new BLWS();
        instance.setDatabaseProps(db_host, db_port, db_name, db_user, db_pass);
        
        System.out.println("printBookById");
       
        String result = instance.printBookById(66);
        System.out.print(result);
        
    }

    
    
}
