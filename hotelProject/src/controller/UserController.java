/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UserInfo;

/**
 *
 * @author hasee
 */
public class UserController extends DatabaseController {
    /**
     * Log in to connect to the database implementation;
     */
    public boolean login(UserInfo userInfo){
        String sql = "select * from USERINFO where NAME=? AND PASSWORD=? AND USERTYPE=? ";
        UserInfo userResult = null;
        try {
            PreparedStatement prst = conn.prepareStatement(sql);//Pass SQL statements to the database action object
            prst.setString(1, userInfo.getUserName());
            prst.setString(2, userInfo.getPassword());
            prst.setBoolean(3, userInfo.getUserType());
            ResultSet rs = prst.executeQuery();
         
            while(rs.next()){
//                userResult=new UserInfo();      
//                userResult.setUserName(rs.getString(1));
//                userResult.setPassword(rs.getString(2)); 
//                userResult.setUserType(rs.getBoolean(3));
                  return true;
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        return userResult;
        return false;

    }
    public boolean register(UserInfo userInfo){
        //make sure the database has this person's name
//        UserInfo userResult = null;
//        userResult=this.login(userInfo);
//        if(userInfo.getUserName().equals(userResult.getUserName())){
//            System.out.println("The database already exists for this user");
//        }else System.out.println("The database does not exist for this user");
        
        String sql = "INSERT INTO USERINFO VALUES(?,?,?) ";    
        try {
            PreparedStatement prst = conn.prepareStatement(sql);//Pass SQL statements to the database action object
            prst.setString(1, userInfo.getUserName());
            prst.setString(2, userInfo.getPassword());
            prst.setBoolean(3, userInfo.getUserType());
            if(prst.executeUpdate() > 0) return true;   
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;           
      
    }
   
    
}
