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
import model.RoomInfo;
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
public class RoomDBTest {
    
    public RoomDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        try {
            DatabaseController baseDB=new DatabaseController();
            Statement statement=baseDB.conn.createStatement();
            statement.executeUpdate("insert into ROOMINFO VALUES(\'test\',\'test\',true)");
        } catch (SQLException ex) {
            Logger.getLogger(ReserveDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
         try {
            DatabaseController baseDB=new DatabaseController();
            Statement statement=baseDB.conn.createStatement();
            statement.executeUpdate("delete from ROOMINFO where ROOMNAME=\'test\'");
            statement.executeUpdate("delete from ROOMINFO where ROOMNAME=\'test2\'");
        } catch (SQLException ex) {
            Logger.getLogger(ReserveDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addRoom method, of class RoomDB.
     */
    @Test
    public void testAddRoom() {
        System.out.println("addRoom");
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setRoomName("test2");
        roomInfo.setRoomType("test2");
        roomInfo.setRoomCondition(true);
        RoomController instance = new RoomController();
        boolean expResult = true;
        boolean result = instance.addRoom(roomInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRoomList method, of class RoomDB.
     */
    @Test
    public void testGetRoomList() {
        System.out.println("getRoomList");
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setRoomName("test");
        RoomController instance = new RoomController();
        boolean expResult=true;
        boolean result=false;
        if(instance.getRoomList(roomInfo).size()>0) result=true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRoomNumber method, of class RoomDB.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setRoomType("test");
        RoomController instance = new RoomController();
        boolean expResult=true;
        boolean result=false;
        if(instance.getRoomNumber(roomInfo)>0) result=true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
