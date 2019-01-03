package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (JDBCUtils.getDataSource ());

    /*      uid                  INT NOT NULL AUTO_INCREMENT,
        username             VARCHAR(100) NOT NULL,
        PASSWORD             VARCHAR(32) NOT NULL,
        NAME                 VARCHAR(100),
        birthday             DATE,
        sex                  CHAR(1),
        telephone            VARCHAR(11),
        email                VARCHAR(100),
        STATUS               CHAR(1) ,
        CODE					VARCHAR(50),*/
    /**
     * 根据用户名查找用户是否存在
     * @param user
     * @return
     */
    @Override
    public User findUser (User user) {
        String sql = "SELECT * FROM tab_user WHERE username = ?";
        User u = null;
        try {
            u = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class), user.getUsername ());
        } catch (DataAccessException e) {

        }
        return u;
    }

    /**
     * 根据用户名、密码查询用户
     * @param username
     * @param password
     * @return
     */
    @Override
    public User findUser (String username, String password) {
        String sql = "SELECT * FROM tab_user WHERE username = ? AND password = ?";
        User u = null;
        try {
            u = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class), username,password);
        } catch (DataAccessException e) {

        }
        return u;
    }

    /**
     * 注册用户
     * @param user
     */
    @Override
    public void register (User user) {
        String sql = "INSERT INTO tab_user (username,password,email,name,telephone,sex,birthday,status,code) VALUES(?,?,?,?,?,?,?,?,?) ";
        jdbcTemplate.update (sql,user.getUsername (),user.getPassword (),user.getEmail (),user.getName (),user.getTelephone (),user.getSex (),user.getBirthday (),user.getStatus (),user.getCode ());
/*
        username: segsegsegseg
        password:
        email:
        name:
        telephone:
        sex: 男
        birthday:
        */


    }

    @Override
    public boolean active (String status, String code) {
        status = "Y";
        String sql = "UPDATE tab_user SET status = ? WHERE code = ?";
        try {
            int update = jdbcTemplate.update (sql, status, code);
            if(update > 0){
                return true;
            }
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return false;
    }

}
