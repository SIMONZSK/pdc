/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RequestInfo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hasee
 */
public class RequestDBTest {
    
    public RequestDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("insert into REQUESTINFO values(\'test\',\'test\',\'test\')");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("delete from REQUESTINFO where NAME==\'test\'");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addRequest method, of class RequestDB.
     */
    @Test
    public void testAddRequest() {
        System.out.println("addRequest");
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setRequest("test");
        requestInfo.setName("test");
        requestInfo.setId("test");
        RequestController instance = new RequestController();
        boolean expResult = true;
        boolean result = instance.addRequest(requestInfo);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getRequestList method, of class RequestDB.
     */
    @Test
    public void testGetRequestList() {
        System.out.println("getRequestList");
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setName("test");
        RequestController instance = new RequestController();
        boolean expResult = true;
        boolean result=false;
        if(instance.getRequestList(requestInfo).size()>0)
            result=true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of delete method, of class RequestDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String name = "test";
        RequestController instance = new RequestController();
        boolean expResult = false;
        boolean result = instance.delete(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    
}
