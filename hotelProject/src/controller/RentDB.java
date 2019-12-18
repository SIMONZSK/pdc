/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.RentInfo;
import util.StringUtil;

/**
 * 租房信息和数据库的同步 private String guestIDnumber; private String guestName; private
 * String rentType; private String roomType; private int RentDays; private int
 * antecedentMoney; private String remark;
 *
 * @author hasee
 */
public class RentDB extends BaseDB {

    public boolean addRent(RentInfo rentInfo) {
        String sql = "insert into RENTINFO VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, rentInfo.getGuestIDnumber());
            preparedStatement.setString(2, rentInfo.getGuestName());
            preparedStatement.setString(3, rentInfo.getRentType());
            preparedStatement.setString(4, rentInfo.getRoomType());
            preparedStatement.setInt(5, rentInfo.getRentDays());
            preparedStatement.setInt(6, rentInfo.getAntecedentMoney());
            preparedStatement.setString(7, rentInfo.getRemark());
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return false;
    }

    public List<RentInfo> getRentList(RentInfo rentInfo) {
        List<RentInfo> resultList = new ArrayList<RentInfo>();
        String sqlString = "select * from RENTINFO";
        if (!StringUtil.isEmpty(rentInfo.getGuestName())) {
			sqlString += " where GUESTNAME like '%"+rentInfo.getGuestName()+"%'";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                RentInfo rent = new RentInfo();
                rent.setGuestIDnumber(executeQuery.getString("GUESTIDNUMBER"));
                rent.setGuestName(executeQuery.getString("GUESTNAME"));
                rent.setRentType(executeQuery.getString("RENTTYPE"));
                rent.setRoomType(executeQuery.getString("ROOMTYPE"));
                rent.setRentDays(executeQuery.getInt("RENTDAYS"));
                rent.setAntecedentMoney(executeQuery.getInt("ANTECEDENTMONEY"));
                rent.setRemark(executeQuery.getString("REMARK"));
                resultList.add(rent);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resultList;
    }

    public boolean delete(String guestIDnumber) {
        String sql = "delete from RENTINFO where GUESTIDNUMBER=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, guestIDnumber);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return false;
    }

//    public boolean update(RentInfo rentInfo) {
//        String sql = "update RENTINFO set RENTTYPE=? ,ROOMTYPE=?,RENTDAYS=?,ANTECEDENTMONEY=?,REMARK=?   where GUESTIDNUMBER=?";
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setString(1, rentInfo.getRentType());
//            preparedStatement.setString(2, rentInfo.getRoomType());
//            preparedStatement.setInt(3, rentInfo.getRentDays());
//            preparedStatement.setInt(4, rentInfo.getAntecedentMoney());
//            preparedStatement.setString(5, rentInfo.getRemark());
//            preparedStatement.setString(6, rentInfo.getGuestIDnumber());
//            if (preparedStatement.executeUpdate() > 0) {
//                return true;
//            }
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return false;
//    }

}
