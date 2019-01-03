package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.oracle.webservices.internal.api.message.PropertySet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;


@PropertySource ("classpath:jdbcConfig.properties")
public class Source {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource1){
        return new JdbcTemplate (dataSource1);
    }

    /**
     * 创建连接池1
     * @return
     */
    @Bean("dataSource1")
    public DataSource getDs1(){
        DataSource dataSource = null;
        try {
            Properties pro = new Properties ();
            pro.put ("driver",driver);
            pro.put ("url",url);
            pro.put ("username",username);
            pro.put ("password",password);
            dataSource = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
        }
        return dataSource;
    }

    /**
     * 创建连接池
     * @return
     */
    @Bean("dataSource")
    public DataSource getDs(){
        DataSource dataSource = null;
        try {
            InputStream is = Source.class.getClassLoader ().getResourceAsStream ("jdbcConfig.properties");
            Properties pro = new Properties ();
            pro.load (is);
            dataSource = DruidDataSourceFactory.createDataSource (pro);
        } catch (Exception e) {
            e.printStackTrace ();
        } finally {
        }
        return dataSource;
    }
}
