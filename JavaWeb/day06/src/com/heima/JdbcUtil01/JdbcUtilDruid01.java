package com.heima.JdbcUtil01;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtilDruid01 {
    private static DataSource ds = null;
    static{
        try {
            Properties pro = new Properties ();
            pro.load (JdbcUtilDruid01.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection ();
    }

    public static void close(Statement stmt, Connection conn){
        close (null,stmt,conn);
    }
    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if(rs != null){
            try {
                rs.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if(stmt != null){
            try {
                stmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if(conn != null){
            try {
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
