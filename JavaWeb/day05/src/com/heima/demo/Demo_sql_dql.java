package com.heima.demo;

import java.sql.*;

public class Demo_sql_dql {
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName ("com.mysql.jdbc.Driver");
            // 2. 获取connection数据连接对象
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/dbj", "root", "root");
            System.out.println (conn);
            // 3. 获取statement提交sql语句对象
            stmt = conn.createStatement ();
            System.out.println (stmt);
            // 4. 定义sql语句
            String sql = "SELECT * FROM student";
            // 5. 执行sql语句，得到ResultSet结果集
            rs = stmt.executeQuery (sql);
            System.out.println (rs);
            // 6. 遍历ResultSet，取出每一条记录
            while (rs.next ()) {
                int id = rs.getInt ("id");
                String name = rs.getString ("name");
                boolean gender = rs.getBoolean ("gender");
                Date birthday = rs.getDate ("birthday");
                System.out.println ("编号：" + id + "，\t姓名：" + name + "，\t性别：" + (gender ? '男' : '女') + "，\t生日：" + birthday);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            // 7. 释放资源
            if(rs != null){
                try {
                    rs.close ();
                } catch (SQLException e) {
                    e.printStackTrace ();
                }
            }
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
