package com.heima.demoLogin.dao;

import com.heima.demoLogin.domain.User;
import com.heima.demoLogin.utils.DataSourceUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;

public class UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (DataSourceUtils.getDataSource ());
    // 通过用户名和密码查询指定的用户
    public User login(String name, String password){
        String sql = "select * from user where username = ? and password = ?";


//        User user = jdbcTemplate.queryForObject (sql,User.class,name,password);
//        User user = jdbcTemplate.queryForObject (sql,new BeanPropertyRowMapper<User> (User.class),name,password);


        List<User> list = jdbcTemplate.query (sql, new BeanPropertyRowMapper<User> (User.class), name, password);
        if(list.size ()>0){
            User user = list.get (0);
            if(user != null){
                return user;
            }
        }
        return null;
    }


    // 查询所有的联系人并显示出来
    public List<User> findMyUser(){
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query (sql, new BeanPropertyRowMapper<User> (User.class));
        return list;
    }
}
