package com.heima.demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdTest {
    public static void ma() throws Exception{
        Properties properties = new Properties ();
        properties.load (JdTest.class.getClassLoader ().getResourceAsStream ("druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource (properties);
        Connection conn = ds.getConnection ();
        PreparedStatement pstmt = conn.prepareStatement ("SELECT max(score) FROM sc");

        ResultSet rs = pstmt.executeQuery ();
        while (rs.next ()){
            System.out.println (rs.getDouble (1));
        }


    }
}
