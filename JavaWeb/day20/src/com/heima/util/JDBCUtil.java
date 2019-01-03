package com.heima.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
    private JDBCUtil(){}
    private static DataSource ds;

    static {
        try {
            Properties pro = new Properties ();
            pro.load (JDBCUtil.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }

/*    public static Connection getConnection() throws SQLException {
        return ds.getConnection ();
    }

    public void close(ResultSet rs, Statement stmt, Connection connn){
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
        if(connn != null){
            try {
                connn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }*/

}
