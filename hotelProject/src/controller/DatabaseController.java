
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import util.DbConnection;

/**
 * Database connection object;
 * This database connection object is used for other database-related operations;
 */
public class DatabaseController {
    public Connection conn =new DbConnection().connectHotelDB();
    
    public void closeBaseDB(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("database connect failed");
		}
	}
    
}
