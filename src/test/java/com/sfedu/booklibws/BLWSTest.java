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
   

    @Test
    public void testPrintBookById() {
        System.out.println("printBookById");
      
        BLWS instance = new BLWS();
       
        String result = instance.printBookById(66);
        System.out.print(result);
        
    }
    
}
