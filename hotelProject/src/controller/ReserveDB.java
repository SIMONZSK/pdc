/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author hasee
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ReserveInfo;
import util.StringUtil;

/**
 *
 * @author GP62MVR
 */
public class ReserveDB extends BaseDB {

    public boolean addRent(ReserveInfo reserveInfo) {
        String sql = "insert into RESERVEINFO VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, reserveInfo.getGuestIDnumber());
            preparedStatement.setString(2, reserveInfo.getGuestName());
            preparedStatement.setString(3, reserveInfo.getRentType());
            preparedStatement.setString(4, reserveInfo.getRoomType());
            preparedStatement.setInt(5, reserveInfo.getRentDays());
            preparedStatement.setString(6, reserveInfo.getRemark());
            preparedStatement.setBoolean(7, reserveInfo.getResult());
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return false;
    }

    public List<ReserveInfo> getRentList(ReserveInfo reserveInfo) {
        List<ReserveInfo> resultList = new ArrayList<ReserveInfo>();
        String sqlString = "select * from RESERVEINFO";
        if (!StringUtil.isEmpty(reserveInfo.getGuestName())) {
            sqlString += " where GUESTNAME like '%" + reserveInfo.getGuestName() + "%'";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                ReserveInfo rent = new ReserveInfo();
                rent.setGuestIDnumber(executeQuery.getString("GUESTIDNUMBER"));
                rent.setGuestName(executeQuery.getString("GUESTNAME"));
                rent.setRentType(executeQuery.getString("RENTTYPE"));
                rent.setRoomType(executeQuery.getString("ROOMTYPE"));
                rent.setRentDays(executeQuery.getInt("RENTDAYS"));
                rent.setRemark(executeQuery.getString("REMARK"));
                if (executeQuery.getBoolean("RESULT")) {
                    rent.setResult(true);
                }
                resultList.add(rent);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
        return resultList;
    }

    public boolean getReserveResult(ReserveInfo reserveInfo) {
        String sqlString = "select * from RESERVEINFO";
        if (!StringUtil.isEmpty(reserveInfo.getGuestIDnumber())) {
            sqlString += " where GUESTIDNUMBER = \'" + reserveInfo.getGuestIDnumber()+"\'";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                if (executeQuery.getBoolean("RESULT")) {
                    return true;
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String guestIDnumber) {
        String sql = "delete from RESERVEINFO where GUESTIDNUMBER=?";
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

}
