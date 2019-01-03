package com.heima.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
    private JdbcUtils(){}
    private static DataSource ds;

    static {
        try {
            Properties pro = new Properties ();
            pro.load (JdbcUtils.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }

    public static Connection getConnection(){
        try {
            return ds.getConnection ();
        } catch (SQLException e) {
            e.printStackTrace ();
            return null;
        }
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


}
