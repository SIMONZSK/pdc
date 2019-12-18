
package controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        try {
            BaseDB baseDB=new BaseDB();
            Statement statement=baseDB.conn.createStatement();
            statement.executeUpdate("delete from RESERVEINFO where GUESTIDNUMBER=\'TEST\'");
        } catch (SQLException ex) {
            Logger.getLogger(ReserveDBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
        try {
            BaseDB baseDB=new BaseDB();
            Statement statement=baseDB.conn.createStatement();
            statement.executeUpdate("delete from RESERVEINFO where GUESTIDNUMBER=\'TEST\'");
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
     * Test of addRent method, of class ReserveDB.
     */
    @Test
    public void testAddRent() {
        System.out.println("addRent");
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.setGuestIDnumber("test");
        reserveInfo.setGuestName("test");
        reserveInfo.setRentType("test");
        reserveInfo.setRoomType("test");
        reserveInfo.setRentDays(1);
        reserveInfo.setRemark("test");
        reserveInfo.setResult(true);  
        ReserveDB instance = new ReserveDB();
        boolean expResult = true;
        boolean result = instance.addRent(reserveInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRentList method, of class ReserveDB.
     */
    @Test
    public void testGetRentList() {
        System.out.println("getRentList");
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.setGuestName("test");
        ReserveDB instance = new ReserveDB();
        boolean expResult=true;
        boolean result=false;
        if(instance.getRentList(reserveInfo).size()>0) result=true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getReserveResult method, of class ReserveDB.
     */
    @Test
    public void testGetReserveResult() {
        System.out.println("getReserveResult");
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.setGuestIDnumber("test");
        reserveInfo.setResult(true);
        
        ReserveDB instance = new ReserveDB();
        boolean expResult = false;
        boolean result = instance.getReserveResult(reserveInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class ReserveDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String guestIDnumber = "test";
        ReserveDB instance = new ReserveDB();
        boolean expResult = true;
        boolean result = instance.delete(guestIDnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
