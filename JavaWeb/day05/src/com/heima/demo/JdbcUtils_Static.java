package com.heima.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils_Static {
    // 定义 url,用户名,密码,驱动类
/*    private static final String URL = "jdbc:mysql:///dbj";
    private static final String USER = "root";
    private static final String PWD = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";*/

    // 定义 url,用户名,密码,驱动类
    private static final String URL;
    private static final String USER;
    private static final String PWD;
    private static final String DRIVER;

    static{
        //获取properies文件中的配置
        Properties pro = new Properties ();
        InputStream is = JdbcUtils_Static.class.getClassLoader ().getResourceAsStream ("jdbc.properties");
        try {
            pro.load (is);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        DRIVER = pro.getProperty ("driver");
        USER=pro.getProperty ("user");
        PWD=pro.getProperty ("pwd");
        URL = pro.getProperty ("url");
/*        System.out.println (DRIVER);
        System.out.println (USER);
        System.out.println (PWD);
        System.out.println (URL);*/
        try {
            Class.forName (DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }

    //获取数据连接对象
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection (URL,USER,PWD);
    }

    //释放资源
    /**
     * 关闭所有打开的资源 Connection conn, Statement stmt
     */
    public static void close(Connection conn, Statement stmt) {
        if (stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 关闭所有打开的资源 Connection conn, Statement stmt, ResultSet rs
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, stmt);
    }

}
