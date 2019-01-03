package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (JDBCUtils.getDataSource ());
    @Override
    public User findUserByUsername (String username) {
        try {
            return jdbcTemplate.queryForObject ("SELECT * FROM tab_user WHERE username =  ? ",new BeanPropertyRowMapper<User> (User.class),username);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public void register (User user) {
        String sql = "INSERT INTO tab_user VALUES(null,?,?,?,?,?,?,?,?,?)";
//        uid  username    password  name    birthday    sex     telephone    email  status  code
        try {
            jdbcTemplate.update (sql,user.getUsername (),user.getPassword (),user.getName (),user.getBirthday (),user.getSex (),user.getTelephone (),user.getEmail (),user.getStatus (),user.getCode ());
        } catch (DataAccessException e) {
            System.out.println (e);
//            e.printStackTrace ();
        }
    }

    @Override
    public User findUserByCode (String code) {
        try {
            return jdbcTemplate.queryForObject ("SELECT * FROM tab_user WHERE code =  ? ",new BeanPropertyRowMapper<User> (User.class),code);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public boolean activeUser (User user) {
        String sql = "UPDATE tab_user SET status = ? WHERE code = ?";
        try {
            jdbcTemplate.update (sql,"Y",user.getCode ());
        } catch (DataAccessException e) {
            System.out.println (e);
//            e.printStackTrace ();
            return false;
        }
        return true;
    }

    @Override
    public User finUserByUsernameAndPassword (String username, String password) {
        String sql = "SELECT * FROM tab_user WHERE username = ? AND password = ?";
        User user = null;
        try {
            user = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class), username, password);
        } catch (DataAccessException e) {
            System.out.println (e);
//            e.printStackTrace ();
        }
        return user;
    }


}
