package com.heima.demo_login.Dao;

import com.heima.demo_login.Domain.User;
import com.heima.demo_login.Utills.JdbcUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate (JdbcUtils.getDataSource ());

    public User checkLogin(String username, String password){
        try {
            String sql = "SELECT * FROM user WHERE username= ? AND password=?";
//        List<User> list = jdbcTemplate.query (sql, new BeanPropertyRowMapper<> (User.class), username, password);

            User user = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<> (User.class), username, password);
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace ();
            return null;
        }

    }

    /*
    private String id;
    private String username;
    private String password;
    private String email;
*/

}
