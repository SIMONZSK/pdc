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
import model.RoomInfo;
import util.StringUtil;

/**
 *
 * @author hasee
 */
public class RoomController extends DatabaseController {

    public boolean addRoom(RoomInfo roomInfo) {
        String sql = "insert into ROOMINFO VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, roomInfo.getRoomName());
            preparedStatement.setString(2, roomInfo.getRoomType());
            preparedStatement.setBoolean(3, roomInfo.getRoomCondition());
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
        }
        return false;
    }

    public List<RoomInfo> getRoomList(RoomInfo roomInfo) {
        List<RoomInfo> resultList = new ArrayList<RoomInfo>();
        String sqlString = "select * from ROOMINFO";
        if (!StringUtil.isEmpty(roomInfo.getRoomName())) {
            sqlString += " where ROOMNAME like \'%" + roomInfo.getRoomName() + "%\'";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                RoomInfo room = new RoomInfo();
                room.setRoomName(executeQuery.getString("ROOMNAME"));
                room.setRoomType(executeQuery.getString("ROOMTYPE"));
                room.setRoomCondition(executeQuery.getBoolean("ROOMCONDITION"));
                resultList.add(room);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
        return resultList;
    }

    public int getRoomNumber(RoomInfo roomInfo) {
        int num = 0;
        String sqlString="select * from ROOMINFO where ROOMCONDITION=true AND ROOMTYPE='"+roomInfo.getRoomType()+"'";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                num++;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

        }
        return num;
    }
}
