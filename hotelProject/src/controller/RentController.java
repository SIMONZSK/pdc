
package controller;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.RentInfo;
import util.StringUtil;

    /**
     * Rental information and database synchronization ;private String guestIDnumber; private String guestName; private

     */
public class RentController extends DatabaseController {
    //Add the data column to the RENTINFO data table to create the production table;
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
//            ex.printStackTrace();
        }
        return false;
    }

    public List<RentInfo> getRentList(RentInfo rentInfo) {
        //Get rental information from the database;
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
        }
        return resultList;
    }

    public boolean delete(String guestIDnumber) {
        //Delete the rental information of the customer;
        String sql = "delete from RENTINFO where GUESTIDNUMBER=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, guestIDnumber);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            
        }
        return false;
    }



}
