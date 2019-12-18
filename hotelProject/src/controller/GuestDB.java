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
import model.UserInfo;
import util.StringUtil;

/**
 *
 * @author hasee
 */
public class GuestDB extends BaseDB {

//    public List<RentInfo> getRentList(RentInfo rentInfo) {
//        List<RentInfo> resultList = new ArrayList<RentInfo>();
//        String sqlString = "select * from USERINFO where USERTYPE=true ";
////        if (!StringUtil.isEmpty(rentInfo.getGuestIDnumber())) {
////            sqlString += " where USERTYPE like '%" + rentInfo.getGuestIDnumber() + "%'";
////        }
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
//            ResultSet executeQuery = preparedStatement.executeQuery();
//            while (executeQuery.next()) {
//                UserInfo userInfo = new UserInfo();
//                userInfo.setUserName(sqlString);
//                rent.setGuestIDnumber(executeQuery.getString("GUESTIDNUMBER"));
//                rent.setGuestName(executeQuery.getString("GUESTNAME"));
//                rent.setRentType(executeQuery.getString("RENTTYPE"));
//                rent.setRoomType(executeQuery.getString("ROOMTYPE"));
//                rent.setRentDays(executeQuery.getInt("RENTDAYS"));
//                rent.setAntecedentMoney(executeQuery.getInt("ANTECEDENTMONEY"));
//                rent.setRemark(executeQuery.getString("REMARK"));
//                resultList.add(rent);
//            }
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return resultList;
//    }
}
