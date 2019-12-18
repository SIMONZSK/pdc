/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.ReserveInfo;
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
public class ReserveDBTest {
    
    public ReserveDBTest() {
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
     * Test of addRent method, of class ReserveDB.
     */
    @Test
    public void testAddRent() {
        System.out.println("addRent");
        ReserveInfo reserveInfo = null;
        ReserveDB instance = new ReserveDB();
        boolean expResult = false;
        boolean result = instance.addRent(reserveInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentList method, of class ReserveDB.
     */
    @Test
    public void testGetRentList() {
        System.out.println("getRentList");
        ReserveInfo reserveInfo = null;
        ReserveDB instance = new ReserveDB();
        List<ReserveInfo> expResult = null;
        List<ReserveInfo> result = instance.getRentList(reserveInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReserveResult method, of class ReserveDB.
     */
    @Test
    public void testGetReserveResult() {
        System.out.println("getReserveResult");
        ReserveInfo reserveInfo = null;
        ReserveDB instance = new ReserveDB();
        boolean expResult = false;
        boolean result = instance.getReserveResult(reserveInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ReserveDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String guestIDnumber = "";
        ReserveDB instance = new ReserveDB();
        boolean expResult = false;
        boolean result = instance.delete(guestIDnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
