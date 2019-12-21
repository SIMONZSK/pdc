
package controller;

/**
 *
 * Reserve information and database synchronization ;
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ReserveInfo;
import util.StringUtil;


public class ReserveController extends DatabaseController {
    
    public boolean addRent(ReserveInfo reserveInfo) {
        //Insert data into the database table RESERVEINFO;
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

        }
        return false;
    }

    public List<ReserveInfo> getRentList(ReserveInfo reserveInfo) {
        //Synchronize the request information from the database and import it into the ReserveInfo List;
        //Search function can achieve search and input information similar to the user name;
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
        //Determine the service request result and output True or False;
        String sqlString = "select * from RESERVEINFO";
        if (!StringUtil.isEmpty(reserveInfo.getGuestIDnumber())) {
            sqlString += " where GUESTIDNUMBER = \'" + reserveInfo.getGuestIDnumber() + "\'";
        }
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();
            while (executeQuery.next()) {
                if (executeQuery.getBoolean("RESULT")) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }

    public boolean delete(String guestIDnumber) {
        //Delete by GUESTIDNUMBER from the information table;
        String sql = "delete from RESERVEINFO where GUESTIDNUMBER=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, guestIDnumber);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block

        }
        return false;
    }

}
