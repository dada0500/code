package com.heima.Demo_JdbcUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
        static Connection conn;

        static{
            try {
                // 1. 获取配置文件
                InputStream is = JdbcUtils.class.getClassLoader ().getResourceAsStream ("jdbc.properties");
                Properties pro = new Properties ();
                pro.load (is);
                // 2. 读取配置参数
                String url = pro.getProperty ("url");
                String user = pro.getProperty ("user");
                String pwd = pro.getProperty ("pwd");
                String driver = pro.getProperty ("driver");

                // 3. 注册驱动
                Class.forName (driver);
                // 4. 获取 Connection
                conn = DriverManager.getConnection (url, user, pwd);
            } catch (Exception e) {
                e.printStackTrace ();
            }
        }

        public static Connection getConnection(){
            return conn;
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
