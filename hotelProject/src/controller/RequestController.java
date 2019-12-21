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
 * Request information and database synchronization ;
 *
 */
public class RequestController extends DatabaseController {

    //Insert data into the database table REQUESTINFO;
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

    public List<RequestInfo> getRequestList(RequestInfo requestInfo) {
       //Synchronize the request information from the database and import it into the List;
        List<RequestInfo> resultList = new ArrayList<RequestInfo>();
        String sqlString = "select * from REQUESTINFO";
        if (!StringUtil.isEmpty(requestInfo.getName())) {
            sqlString = " select * from REQUESTINFO where NAME= '" + requestInfo.getName() + "'";

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
        //Delete by NAME from the information table;
        String sql = "delete from REQUESTINFO where NAME=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
        }
        return false;
    }

}
