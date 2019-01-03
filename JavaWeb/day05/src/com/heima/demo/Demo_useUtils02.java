package com.heima.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo_useUtils02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入用户名：");
        String user = sc.nextLine ();
        System.out.println ("请输入密码：");
        String password = sc.nextLine ();
        login(user,password);
    }

    private static void login (String user, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //通过JdbcUtils获取数据连接对象
            conn = JdbcUtils_Static.getConn ();
            //获取语句执行对象
            stmt = conn.createStatement ();
            //执行查询，查询用户输入的用户名与密码是否与user表中的某条记录匹配
            rs = stmt.executeQuery ("SELECT name,password FROM user WHERE name = '" + user + "'AND password = '" + password + "'");
            // sql注入： a' or '1'='1
            if (rs.next ()){
                System.out.println ("登录成功");
            }else {
            System.out.println ("登录失败");
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            JdbcUtils_Static.close (conn,stmt,rs);
        }

    }
}
