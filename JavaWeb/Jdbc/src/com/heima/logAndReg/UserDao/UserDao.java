package com.heima.logAndReg.UserDao;

import com.heima.demoLogin.domain.User;
import com.heima.logAndReg.Utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private static JdbcTemplate jdbcTemplate = new JdbcTemplate (JdbcUtils.getDataSource ());

    public static boolean login (String username, String password) {
        List<User> list = jdbcTemplate.query ("select * from user where username = ? and password = ?", new BeanPropertyRowMapper<> (User.class), username, password);
        if(list.size () > 0){
            return true;
        }
        return false;
    }

    public static boolean register (String reg_username, String reg_password) {
        int update = jdbcTemplate.update ("insert into user (username , password) values(?,?)", reg_username, reg_password);
        if(update > 0){
            return true;
        }
        return false;
    }
}
