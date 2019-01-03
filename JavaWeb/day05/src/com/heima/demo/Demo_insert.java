package com.heima.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_insert {
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            Class.forName ("com.mysql.jdbc.Driver");
            // 2. 获取connection数据连接对象
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/dbj", "root", "root");
            // 3. 获取statement提交sql语句对象
            stmt = conn.createStatement ();
            // 4. 定义插入的记录条数
            int count = 0;
            // 5. 执行sql语句
            count += stmt.executeUpdate ("INSERT INTO student VALUES (null, '孙悟空', 1, '1993-03-24')");
            count += stmt.executeUpdate ("INSERT INTO student VALUES (null, '白骨精', 0, '1995-03-24')");
            count += stmt.executeUpdate ("INSERT INTO student values(null, '猪八戒', 1, '1903-03-24')");
            count += stmt.executeUpdate ("INSERT INTO student VALUES (null, '嫦娥', 0, '1993-03-11')");
            // 6. 接收返回值
            System.out.println ("插入了" + count + "条记录");
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            // 7. 释放资源
            if (stmt != null) {
                try {
                    stmt.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
            if (conn != null) {
                try {
                    conn.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
}
