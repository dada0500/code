package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate (JDBCUtil.getDataSource ());

/*   CREATE TABLE USER(   -- 创建表
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20) NOT NULL,
	gender VARCHAR(5),
	age INT,
	address VARCHAR(32),
	qq	VARCHAR(20),
	email VARCHAR(50),
	username VARCHAR(20),
	PASSWORD VARCHAR(20)
);*/
    @Override
    public void addUser (User user) {
        String sql = "INSERT INTO USER VALUES (null,?,?,?,?,?,?,null,null)";
        template.update (sql,user.getName (),user.getGender (),user.getAge (),user.getAddress (),user.getQq (),user.getEmail ());
    }

    @Override
    public User findUserByUsernameAndPasswrod (String username, String password) {
        String sql = "SELECT * FROM USER WHERE username = ? AND password = ?";
        try {
            return template.queryForObject (sql,new BeanPropertyRowMapper<User> (User.class),username,password);
        } catch (DataAccessException e) {
            e.printStackTrace ();
            return null;
        }
    }

    @Override
    public int getUserCountByCondition (Map<String, String[]> condition) {
        StringBuilder sql = new StringBuilder ("SELECT COUNT(*) FROM USER WHERE 1=1 ");
        List<Object> paras = new ArrayList<> ();

        for (String key : condition.keySet ()) {
            String value = condition.get (key)[0];
            if("currentPage".equals (key) || "rows".equals (key)){
                continue;
            }
            if(value != null && !"".equals (value)){
                sql.append (" AND " + key + " LIKE ? ");
                paras.add ("%" + value + "%");
            }
        }

        try {
            return template.queryForObject (sql.toString (), int.class,paras.toArray ());
        } catch (DataAccessException e) {
            e.printStackTrace ();
            return 0;
        }
    }

    @Override
    public List<User> findUsesByPage (int currentPage, int rows, Map<String, String[]> condition) {
        StringBuilder sql = new StringBuilder ("SELECT * FROM USER WHERE 1=1 ");
        List<Object> paras = new ArrayList<> ();

        for (String key : condition.keySet ()) {
            String value = condition.get (key)[0];
            if("currentPage".equals (key) || "rows".equals (key)){
                continue;
            }
            if(value != null && !"".equals (value)){
                sql.append (" AND " + key + " LIKE ? ");
                paras.add ("%" + value + "%");
            }
        }

        sql.append (" LIMIT ?,?");

        if(currentPage <= 0){
            currentPage = 1;
        }
        if(rows <= 0){
            rows = 5;
        }

        paras.add ((currentPage - 1)*rows);
        paras.add (rows);
        try {
            return template.query(sql.toString (), new BeanPropertyRowMapper<User> (User.class),paras.toArray ());
        } catch (DataAccessException e) {
            e.printStackTrace ();
            return null;
        }
    }

    @Override
    public void updateUser (User user) {
        String sql = "UPDATE USER SET name = ? ,gender = ? ,age = ? , address = ? , qq = ?, email = ? WHERE id = ? ";
        template.update (sql,user.getName (),user.getGender (),user.getAge (),user.getAddress (),user.getQq (),user.getEmail (),user.getId ());
    }
}
