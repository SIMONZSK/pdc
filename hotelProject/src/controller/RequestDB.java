/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.RentInfo;
import model.RequestInfo;
import util.StringUtil;

/**
 *
 * @author GP62MVR
 */
public class RequestDB extends BaseDB {

    public boolean addRequest(RequestInfo requestInfo) {
        String sql = "insert into REQUESTINFO VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, requestInfo.getRequest());
            preparedStatement.setString(2, requestInfo.getName());
            preparedStatement.setString(3, requestInfo.getId());
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }

        public List<RequestInfo> getRequestList(RequestInfo requestInfo){
            List<RequestInfo>resultList = new ArrayList<RequestInfo>();
            String sqlString = "select * from REQUESTINFO";
            if (!StringUtil.isEmpty(requestInfo.getName())) {
			sqlString = " select * from REQUESTINFO where NAME= '"+requestInfo.getName()+"'";
                        
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                RequestInfo request = new RequestInfo();
                request.setRequest(executeQuery.getString("REQUEST"));
                request.setName(executeQuery.getString("NAME"));
                request.setId(executeQuery.getString("ID"));
                resultList.add(request);
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
        }
        return resultList;
    }
        
        
        
        public boolean delete(String name) {
        String sql = "delete from REQUESTINFO where NAME=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(2, name);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return false;
    }

        
        
        
        
}
