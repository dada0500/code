package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    private JDBCUtil(){};
    private static DataSource ds;

    static{
        try {
            Properties pro = new Properties ();
            pro.load (JDBCUtil.class.getClassLoader ().getResourceAsStream ("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }
/*    public static Connection getConnection() throws SQLException {
        return ds.getConnection ();
    }*/

}
