package com.heima.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_update01 {
    public static void main (String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 1. 注册驱动
            DriverManager.registerDriver (new com.mysql.jdbc.Driver ());
            // 2. 获取数据库连接对象
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/dbj", "root", "root");
            // 3. 获取语句执行对象执行sql
            ps = conn.prepareStatement ("UPDATE student SET name = '猪九介' WHERE name = '猪八戒';");
            // 4. 执行sql,获取结果
            int i = ps.executeUpdate ();
            // 5. 处理结果
            System.out.println ("影响了" + i + "行");
            if(i > 0){
                System.out.println ("成功");
            }else{
                System.out.println ("失败");
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            if(ps != null){
                try {
                    ps.close ();
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
