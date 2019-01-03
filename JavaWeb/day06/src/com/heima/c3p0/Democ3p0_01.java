package com.heima.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Democ3p0_01 {
    public static void main (String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource ();
            conn = ds.getConnection ();
            pstmt = conn.prepareStatement ("SELECT * FROM user");
            rs = pstmt.executeQuery ();
            while (rs.next ()){
                String name = rs.getString ("name");
                String password = rs.getString ("password");
                System.out.println (name + " ... " + password);
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        } finally {
            try {
                rs.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                pstmt.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            try {
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

    }
}
