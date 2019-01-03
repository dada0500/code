package com.heima.demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class Jdbctemplate_swef {
    public static void main (String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Properties pro = new Properties ();
            pro.load (Jdbctemplate_swef.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            DataSource ds = DruidDataSourceFactory.createDataSource (pro);
/*            conn = ds.getConnection ();
            ps = conn.prepareStatement ("UPDATE emp SET salary=? WHERE id=?");
            ps.setInt (1, 8002);
            ps.setInt (2, 1001);
            int i = ps.executeUpdate ();
            System.out.println ("影响了" + i + "行");*/

            JdbcTemplate jdbctemplate = new JdbcTemplate (ds);
            List<Emp> emps = jdbctemplate.query ("select * from emp", new BeanPropertyRowMapper<Emp> (Emp.class));
            for (Emp emp : emps) {
                System.out.println (emp);
            }

        } catch (Exception e) {
            e.printStackTrace ();
        } /*finally {
            try {
                ps.close ();
                conn.close ();
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }*/




    }
}
