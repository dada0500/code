package com.heima.demo;

import java.sql.*;

public class JdbcUtils {
    // 定义 url,用户名,密码,驱动类
    private String URL;
    private String USER;
    private String PWD;
    private String DRIVER;

    private void regDriver () {
        System.out.println (DRIVER);
        try {
            Class.forName (DRIVER);
            System.out.println ("加载驱动类成功。");
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }

    public JdbcUtils (String URL, String USER, String PWD) {
        this.URL = URL;
        this.USER = USER;
        this.PWD = PWD;
    }

    public JdbcUtils (String URL, String USER, String PWD, String DRIVER) {
        this.URL = URL;
        this.USER = USER;
        this.PWD = PWD;
        this.DRIVER = DRIVER;
        regDriver ();
    }

    //获取Connection对象的方法
    public Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection (URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return conn;
    }

    // 获取Statement的方法
    public Statement getStmt(Connection conn){
        Statement stmt = null;
        try {
            stmt = conn.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return stmt;
    }

    // 释放资源 conn,stmt
    public void close(Connection conn, Statement stmt){
        if (stmt != null) {
            try {
                stmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (conn != null) {
            try {
                stmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }
    // 释放资源 conn,stmt,rs
    public void close(Connection conn, Statement stmt, ResultSet rs){
        if (rs != null) {
            try {
                stmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        close (conn,stmt);
    }
}
