package com01.itheima.demo;

import oracle.jdbc.driver.OracleTypes;
import oracle.jdbc.oracore.OracleType;
import org.junit.Test;

import java.sql.*;

public class TestOjdbc {
    @Test
    public void aTest () throws ClassNotFoundException, SQLException {
        // 注册驱
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        // 获取连接
        Connection conn = DriverManager.getConnection ("jdbc:oracle:thin:@192.168.211.10:1521:orcl", "itheima", "itheima");
        // 获取pstmt
        PreparedStatement pstmt = conn.prepareStatement ("select ename from emp where empno = ?");
        pstmt.setInt (1,7788);
        ResultSet rs = pstmt.executeQuery ();
        while(rs.next ()){
            Object object = rs.getObject (1);
            System.out.println (object);
        }
        // 释放资源
        rs.close ();
        pstmt.close ();
        conn.close ();
    }

    @Test
    public void bTest ()throws ClassNotFoundException, SQLException {
        // 注册驱
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        // 获取连接
        Connection conn = DriverManager.getConnection ("jdbc:oracle:thin:@192.168.211.10:1521:orcl", "itheima", "itheima");
        // 获取pstmt
        CallableStatement pstmt = conn.prepareCall (" {call p1(?,?)}");
        pstmt.setInt (1,7788);
        pstmt.registerOutParameter (2, OracleTypes.VARCHAR);

        pstmt.execute ();

        String string = pstmt.getString (2);
        System.out.println (string);
/*        ResultSet rs = pstmt.executeQuery ();
        while(rs.next ()){
            Object object = rs.getObject (1);
            System.out.println (object);
        }
        // 释放资源
        rs.close ();*/
        pstmt.close ();
        conn.close ();
    }
}
