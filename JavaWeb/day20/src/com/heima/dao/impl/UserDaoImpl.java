package com.heima.dao.impl;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import com.heima.util.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jt = new JdbcTemplate (JDBCUtil.getDataSource ());

    /**
     * 根据用户名密码查询用户
     * @param username
     * @param password
     * @return
     */
    @Override
    public User findUserByUsernameAndPassword (String username, String password) {
        String sql = "SELECT * FROM USER WHERE username = ? AND password = ?";
        try {
            return jt.queryForObject (sql,new BeanPropertyRowMapper<> (User.class),username,password);
        } catch (DataAccessException e) {
            System.out.println ("findUserByUsernameAndPassword: " + e);
            return null;
        }
    }

    /**
     * 查询符合条件的记录总数
     * @param cond
     * @return
     */
    @Override
    public int getUserCountByCondition (Map<String, String> cond) {
        StringBuilder sql = new StringBuilder ();
        System.out.println (sql.toString ());
        sql.append ("SELECT count(1) FROM USER WHERE 1 = 1 ");
        List<Object> params = new ArrayList<> ();
        String value;
        for (String key : cond.keySet ()) {
            value = cond.get (key);
            sql.append (" AND " + key + " = ? ");
            params.add (value);
        }

        try {
            return jt.queryForObject (sql.toString (),Integer.class,params.toArray ());
        } catch (DataAccessException e) {
            System.out.println ("getUserCountByCondition:" + e);
            return 0;
        }
    }

    /**
     *  查询符合条件的记录，以list返回
     * @param start
     * @param rows
     * @param cond
     * @return
     */
    @Override
    public List<User> findUsersByPage (int start, int rows, Map<String, String> cond) {
        StringBuilder sql = new StringBuilder ();
        sql.append ("SELECT * FROM USER WHERE 1 = 1 ");
        List<Object> params = new ArrayList<> ();
        String value;

        for (String key : cond.keySet ()) {
            value = cond.get (key);
            sql.append (" AND " + key + " = ? ");
            params.add (value);
        }

        sql.append (" LIMIT ? ,? ");
        params.add (start);
        params.add (rows);

        try {
            return jt.query (sql.toString (),new BeanPropertyRowMapper<User> (User.class),params.toArray ());
        } catch (DataAccessException e) {
            e.printStackTrace ();
            return null;
        }
    }
}
