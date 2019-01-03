package com.heima.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo01_jdbc {
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            Class.forName ("com.mysql.jdbc.Driver");
            // 2. 获取connection数据连接对象
//            conn = DriverManager.getConnection ("jdbc:mysql//localhost:3306/dbj", "root", "root");
            conn = DriverManager.getConnection ("jdbc:mysql:///dbj", "root", "root");
//                                                    "jdbc:mysql:///day24", "root", "root"
            // 3. 获取statement提交sql语句对象
            stmt = conn.createStatement ();
            // 4. 定义sql语句
            String sql = "create table student (id int PRIMARY key auto_increment,name varchar(20) not null, gender boolean, birthday date)";
//            String sql = "CREATE TABLE IF NOT EXISTS tb02(id int,name varchar(20));";
            // 5. 执行sql语句
            int n = stmt.executeUpdate (sql);
            // 6. 接收返回值
            System.out.println (n);
            System.out.println ("执行sql成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            // 7. 释放资源
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

}
