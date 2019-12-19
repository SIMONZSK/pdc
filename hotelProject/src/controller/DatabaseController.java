/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import util.DbConnection;

/**
 *
 * @author hasee
 * 数据库连接对象
 * 其他与数据库相关的操作都使用这一个数据库连接对象
 */
public class DatabaseController {
    public Connection conn =new DbConnection().connectHotelDB();
    
    public void closeBaseDB(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
