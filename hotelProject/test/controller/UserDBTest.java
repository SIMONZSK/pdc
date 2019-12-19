/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UserInfo;
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
public class UserDBTest {

    public UserDBTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("insert into USERINFO values(\'test\' ,\'test\',true)");
        } catch (SQLException ex) {
            Logger.getLogger(UserDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @AfterClass
    public static void tearDownClass() {
        try {
            DatabaseController baseDB = new DatabaseController();
            Statement statement = baseDB.conn.createStatement();
            statement.executeUpdate("delete from USERINFO where NAME=\'test\'");
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
     * Test of login method, of class UserDB.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("test");
        userInfo.setPassword("test");
        userInfo.setUserType(true);
        UserController instance = new UserController();
        boolean expResult = true;
        boolean result = instance.login(userInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class UserDB.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("test");
        userInfo.setPassword("test");
        userInfo.setUserType(true);
        UserController instance = new UserController();
        boolean expResult = true;
        boolean result = instance.register(userInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
