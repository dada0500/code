package com.heima.dao;

import com.heima.Demo_JdbcUtils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    // 1. 获取连接对象
    private Connection conn = JdbcUtils.getConnection ();

    public boolean login (String user, String password) {
        boolean flag = false;
        if(user == null || password == null){
            return flag;
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            // 2. 获取SQL语句的执行者，执行SQL
            ps = conn.prepareStatement ("SELECT name FROM user WHERE BINARY name = ? AND password = ? ");
            ps.setString (1,user);
            ps.setString (2,password);
            rs = ps.executeQuery ();
            // 调用 .next()方法，查看是否查询到了数据，如果查到，说明用户名密码正确
            flag = rs.next ();
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            JdbcUtils.close (rs,ps,conn);
        }
        return flag;
    }
}
