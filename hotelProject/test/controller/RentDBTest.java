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
import model.RentInfo;
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
public class RentDBTest {
    
    public RentDBTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("insert into RENTINFO VALUES(\'test\' ,\'test\',\'test\' ,\'test\',1,1,\'test\' )");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("delete from RENTINFO where GUESTIDNUMBER=\'test\'");
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
     * Test of addRent method, of class RentDB.
     */
    @Test
    public void testAddRent() {
        System.out.println("addRent");
        RentInfo rentInfo = new RentInfo();
        rentInfo.setGuestIDnumber("test");
        rentInfo.setGuestName("test");
        rentInfo.setRentType("test");
        rentInfo.setRoomType("test");
        rentInfo.setAntecedentMoney(1);
        rentInfo.setRentDays(1);
        rentInfo.setRemark("test");
        RentController instance = new RentController();
        boolean expResult = true;
        boolean result = instance.addRent(rentInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getRentList method, of class RentDB.
     */
    @Test
    public void testGetRentList() {
        System.out.println("getRentList");
        RentInfo rentInfo = new RentInfo();
        rentInfo.setGuestName("test");
        RentController instance = new RentController();
        boolean expResult = true;
        boolean result=false;
        if(instance.getRentList(rentInfo).size()>0)
            result=true;
//        List<RentInfo> result = instance.getRentList(rentInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of delete method, of class RentDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String guestIDnumber = "test";
        RentController instance = new RentController();
        boolean expResult = true;
        boolean result = instance.delete(guestIDnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    
}
