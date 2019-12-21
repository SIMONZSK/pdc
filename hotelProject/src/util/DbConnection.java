/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.UserController;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon ���util��Ҫ��Ϊ��ʵ��һ�����Ը��õ����ݿ����Ӷ��� ���������ݿ���صĲ�����ʹ����һ�����ݿ����Ӷ���
 */
public class DbConnection {

    Connection conn = null;
    String url = "jdbc:derby:HotelDB; create =true";  //url of the DB host
    String username = "root";  //your DB username
    String password = "123456";   //your DB password
    DatabaseMetaData meta;

    public DbConnection() {

    }

    public Connection connectHotelDB() {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(url + "  successfully connected��...");
            init();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public void connectToDB() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(url + "  successfully connected��...");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("���ݿ�����ʧ�ܣ�");
        }

    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println(url + "  successfully closed��...");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
    }

    //�������ݿ�
    public void init() {

        try {
            DatabaseMetaData meta;
            meta = this.conn.getMetaData();
            ResultSet user_table = meta.getTables(null, "ROOT", "USERINFO", null);
            if (!user_table.next()) {
                try {
                    /**
                     * USERINFO TABLE private String userName; private String
                     * password; private Boolean userType=true;
                     * ������ݿ�����û���������ô���ȴ�����
                     */
                    String sql = "create table USERINFO\n"
                            + "(\n"
                            + "	NAME VARCHAR(32) not null,\n"
                            + "	PASSWORD VARCHAR(32) not null,\n"
                            + "	USERTYPE BOOLEAN not null\n"
                            + ")";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(sql);
                    System.out.println("initialize table: USERINFO��");
                } catch (SQLException ex) {
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            ResultSet rent_table = meta.getTables(null, "ROOT", "RENTINFO", null);
            if (!rent_table.next()) {
                try {
                    /**
                     * USERINFO TABLE private String userName; private String
                     * password; private Boolean userType=true;
                     * ������ݿ�����û���������ô���ȴ�����
                     * ע�⣺���޸���Ѻ�����Ϊ�գ���ΪԤ����ʱ����Ҫ��Ѻ��  ,�Լ�ID����Ψһ����Ϊһ���˿��Կ���䷿��
                     * 
                     */
                    String sql = "create table RENTINFO\n"
                            + "(\n"
                            + "	GUESTIDNUMBER VARCHAR(32) not null,\n"
                            + "	GUESTNAME VARCHAR(32) not null,\n"
                            + "	RENTTYPE VARCHAR(32) not null,\n"
                            + " ROOMTYPE VARCHAR(32) not null,\n"
                            + "	RENTDAYS int not null,\n"
                            + "	ANTECEDENTMONEY int ,\n"  
                            + "	REMARK VARCHAR(99)\n"
                            + ")";
                    String insertSql="insert into RENTINFO values ('test','test','Hour Room','Single Room',2,100,'it is a test renting info!')";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(sql);
                    statement.executeUpdate(insertSql);
                    System.out.println("initialize table:RENTINFO��");
                } catch (SQLException ex) {
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            ResultSet room_table = meta.getTables(null, "ROOT", "ROOMINFO", null);
            if (!room_table.next()) {
                try {
                    /**
                     * USERINFO TABLE private String userName; private String
                     * password; private Boolean userType=true;
                     * ������ݿ�����û���������ô���ȴ�����
                     */
                    String sql = "create table ROOMINFO\n"
                            + "(\n"
                            + "	ROOMNAME VARCHAR(32) not null UNIQUE,\n"
                            + "	ROOMTYPE VARCHAR(32) not null,\n"
                            + "	ROOMCONDITION BOOLEAN\n"
                            + ")";
                    String insertSql="insert into ROOMINFO (ROOMNAME,ROOMTYPE,ROOMCONDITION) values('1000','Single Room',true),('1001','Single Room',true),('1002','Single Room',true),\n" +
"                                                              ('1003','Double Room',true),('1004','Double Room',true),\n" +
"                                                              ('1005','Family Room',true)";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(sql);
                    statement.executeUpdate(insertSql);
                    System.out.println("initialize table:ROOMINFO��");
                } catch (SQLException ex) {
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            ResultSet request_table = meta.getTables(null, "ROOT", "REQUESTINFO", null);
            if (!request_table.next()) {
                try {
                    /**
                     * USERINFO TABLE private String userName; private String
                     * password; private Boolean userType=true;
                     * ������ݿ�����û���������ô���ȴ�����
                     */
                    String sql = "create table REQUESTINFO\n"
                            + "(\n"
                            + "	REQUEST VARCHAR(99) not null,\n"
                            + "	NAME VARCHAR(32) not null,\n"
                            + "	ID VARCHAR(32) not null\n"
                            + ")";
                    String insertSql="insert into REQUESTINFO values ('test room service','tester','1')";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(sql);
                    statement.executeUpdate(insertSql);
                    System.out.println("initialize table:REQUESTINFO��");
                } catch (SQLException ex) {
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            ResultSet reserve_table = meta.getTables(null, "ROOT", "RESERVEINFO", null);
            if (!reserve_table.next()) {
                try {
                    /**
                     * USERINFO TABLE private String userName; private String
                     * password; private Boolean userType=true;
                     * ������ݿ�����û���������ô���ȴ�����
                     */
                    String sql = "create table RESERVEINFO\n"
                            + "(\n"
                            + "	GUESTIDNUMBER VARCHAR(32) not null,\n"
                            + "	GUESTNAME VARCHAR(32) not null,\n"
                            + "	RENTTYPE VARCHAR(32) not null,\n"
                            + "	ROOMTYPE VARCHAR(32) not null,\n"
                            + "	RENTDAYS int not null,\n"
                            + "	REMARK VARCHAR(99),\n"
                            + "	RESULT BOOLEAN \n"
                            + ")";
                     String insertSql="insert into RESERVEINFO values ('123456','tester','Hour Room','Single Room',1,'test the booking room function',false)";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(sql);
                    statement.executeUpdate(insertSql);
                    System.out.println("initialize table:RESERVEINFO��");
                } catch (SQLException ex) {
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        //�����������ݿ��Ƿ��˽�ɹ�
        DbConnection dbc = new DbConnection();
        try {
            dbc.connectHotelDB();
            System.out.println("database connect successfully!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("database connect failed!");
        }

        dbc.closeConnections();

    }
}
