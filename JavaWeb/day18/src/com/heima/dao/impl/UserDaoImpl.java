package com.heima.dao.impl;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import com.heima.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (JDBCUtils.getDataSource ());

    @Override
    public User findUserByUsernameAndPassword (String username, String password) {
        try {
            String sql = "SELECT * FROM USER WHERE username = ? AND  password = ?";
            return jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class), username, password);
        } catch (DataAccessException e) {
            System.out.println (e);
            System.out.println ("username:" + username);
            System.out.println ("password:" + password);
            return null;
        }
    }

    @Override
    public int getUserCountByCondition (Map<String, String[]> condition) {
        StringBuilder sql = new StringBuilder ("SELECT COUNT(1) FROM USER WHERE 1=1 ");
        ArrayList<Object> params = new ArrayList<> ();
        for (String key : condition.keySet ()) {
            String value = condition.get (key)[0];
            if ("currentPage".equals (key) || "rows".equals (key)) {
                continue;
            }
            if (value != null && !"".equals (value)) {
                sql.append (" AND " + key + " LIKE ? ");
                params.add ("%" + value + "%");
            }
        }

        return jdbcTemplate.queryForObject (sql.toString (),int.class,params.toArray ());
    }

    /**
     * 根据id删除用户
     *
     * @param id
     */
    @Override
    public void delUserById (int id) {
        String sql = "DELETE FROM USER  WHERE id = ?";
        jdbcTemplate.update (sql, id);
    }

    @Override
    public int getUserCount () {
        String sql = "SELECT COUNT(1) FROM USER";
        return jdbcTemplate.queryForObject (sql, int.class);
    }

    @Override
    public List<User> findUsersBypage (int start, int rows, Map<String, String[]> condition) {

        StringBuilder sql = new StringBuilder ("SELECT * FROM USER WHERE 1=1 ");
        ArrayList<Object> params = new ArrayList<> ();
        for (String key : condition.keySet ()) {
            String value = condition.get (key)[0];
            if ("currentPage".equals (key) || "rows".equals (key)) {
                continue;
            }
            if (value != null && !"".equals (value)) {
                sql.append (" AND " + key + " LIKE ? ");
                params.add ("%" + value + "%");
            }
        }
        sql.append (" LIMIT ?,? ");
        params.add (start);
        params.add (rows);

        return jdbcTemplate.query (sql.toString (), new BeanPropertyRowMapper<User> (User.class),params.toArray ());
    }

}
