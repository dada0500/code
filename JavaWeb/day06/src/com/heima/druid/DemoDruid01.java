package com.heima.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DemoDruid01 {
    public static void main (String[] args) {
       /*   InputStream is = DemoDruid01.class.getClassLoader ().getResourceAsStream ("druid.properties");
        p.load (is);*/
 /*       try {
            new Properties().load (
                    DemoDruid01.class.getClassLoader().getResourceAsStream ("druid.properties")
            );
        } catch (IOException e) {
            e.printStackTrace ();
        }*/


        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        try {
            Properties p = new Properties ();
            p.load (
                    DemoDruid01.class.getClassLoader().getResourceAsStream ("druid.properties")
            );
            DataSource ds = DruidDataSourceFactory.createDataSource (
                    p
            );
            conn = ds.getConnection ();
            pstmt1 = conn.prepareStatement ("SHOW DATABASES;");
            pstmt2 = conn.prepareStatement ("show tables;");
            rs1 = pstmt1.executeQuery ();
            rs2 = pstmt2.executeQuery ();
            while (rs1.next ()){
                String string = rs1.getString (1);
                System.out.println (string);
            }
            System.out.println ("---------");
            while (rs2.next ()){
                String string = rs2.getString (1);
                System.out.println (string);
            }
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
            try {
                rs1.close ();
                rs2.close ();
                pstmt1.close ();
                pstmt2.close ();
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

    }
}
