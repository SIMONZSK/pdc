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
 * ���ݿ����Ӷ���
 * ���������ݿ���صĲ�����ʹ����һ�����ݿ����Ӷ���
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
