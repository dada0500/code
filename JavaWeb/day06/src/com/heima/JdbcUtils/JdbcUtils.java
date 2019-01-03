package com.heima.JdbcUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
    private JdbcUtils(){}  //优化，如果一个类中的所有方法都是静态的，往往都会私有构造方法，目的是不让其他类创建本类对象。
    private static DataSource ds;

    static{
        try {
            Properties pro = new Properties ();
            pro.load (JdbcUtils.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    // 1. 获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection ();
    }

    // 2. 获取连接池对象
    public static DataSource getDataSource(){
        return ds;
    }

    // 3. 释放资源
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
