package com.heima.dao;

import com.heima.domain.Page;
import com.heima.domain.User;
import com.heima.util.JdbcUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao{
    // 获取JdbcTemplate对象
    private  JdbcTemplate jt = new JdbcTemplate (JdbcUtils.getDataSource ());

    // 向数据库中增加用户信息
    @Override
    public int addUser(User user){
        // 定义sql语句：增加记录
        String sql = "INSERT INTO USER (NAME,gender,age,address,qq,email) VALUES(?,?,?,?,?,?);";
        // 使用JdbcTemplate执行语句
        int update = jt.update (sql,  user.getName (), user.getGender (), user.getAge (), user.getAddress (), user.getQq (), user.getEmail ());

        return update;
    }

    // 修改用户信息
    @Override
    public int updateUserById(User user){
        // 定义sql语句：修改记录
        String sql = "UPDATE USER SET NAME= ?, gender= ?,age = ?,address = ? , qq = ?, email = ? WHERE id = ?;";
        // 使用JdbcTemplate执行语句
        int update = jt.update (sql,  user.getName (), user.getGender (), user.getAge (), user.getAddress (), user.getQq (), user.getEmail (), user.getId ());

        return update;
    }

    // 根据id从数据库删除用户信息
    @Override
    public int delUserById(int uid){
        // 定义sql语句：删除记录
        String sql = "DELETE FROM USER WHERE id = ?";
        // 使用JdbcTemplate执行语句
        int update = jt.update (sql, uid);

        return update;
    }

    // 登录验证，查询是否有用户名和密码匹配的用户
    @Override
    public User findAdminByNameAndPassword (String username, String password) {
        // 定义sql语句：查询所有记录
        String sql = "SELECT * FROM admin WHERE name = ? AND password = ? ";
        // 使用JdbcTemplate执行语句,获取所有用户信息
        User user = null;
        try {
            user = jt.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class),username,password);
        } catch (DataAccessException e) {
            System.out.println ("username:"+username);
            System.out.println ("password:"+password);
            return user;
        }

        return user;
    }

    // 根据id查找用户信息
    @Override
    public User findUserById (int uid) {
        String sql = "SELECT * FROM USER WHERE id = ?";
        User user = null;
        try {
            user = jt.queryForObject (sql, new BeanPropertyRowMapper<User> (User.class), uid);
        } catch (DataAccessException e) {
//            return user;
        }
        return user;
    }


/*    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private String qq;
    private String email;*/
    @Override
    public List<User> findUsers(Map<String,String[]> map){
/*        // 获取 user类的所有成员变量名
        String[] fieldNames = new String[0];
        Object[] fieldValues = new Object[0];
        try {
            Field[] fields = user.getClass ().getDeclaredFields ();
            fieldNames = new String[fields.length];
            fieldValues = new Object[fields.length];
            for (int i = 0;i < fields.length; i++) {
                fields[i].setAccessible (true);
                fieldNames[i] = fields[i].getName();
                fieldValues[i] = fields[i].get (user);
            }
        } catch (IllegalAccessException e) {
            System.out.println ("反射获取user成员变量出错");
            e.printStackTrace ();
        }

        // 定义sql语句
        String sql = "";
        // 遍历 传入的 user，判断其各成员变量是否有值
        System.out.println (user);
        for (int i = 0; i < fieldValues.length; i++) {
            if(fieldValues[i] != null){
                sql += " AND " + fieldNames[i] + " = " + fieldValues[i];
            }
            System.out.println (i + " sql: " + sql);
        }
        if(sql != ""){
            sql = "SELECT * FROM USER WHERE 1=1 " + sql;
        }else {
            System.out.println ("ERROR: sql == \"\"");
            return null;
        }
 */

        String sql = "SELECT * FROM USER WHERE 1=1 ";
        for (Map.Entry<String, String[]> entry : map.entrySet ()) {
            String key = entry.getKey ();
            String value = entry.getValue ()[0];
            if(value != null && value != ""){
                sql += " AND " + key + " = " + value;
            }
        }
        // 执行sql，查询用户
        List<User> users = null;
        try {
            users = jt.query (sql, new BeanPropertyRowMapper<User> (User.class));
        } catch (DataAccessException e) {
            System.out.println ("List<User> findUsers(User user)查询用户出错");
            e.printStackTrace ();
        }

        return users;

    }

    /**
     *  分页查询，查询一页的用户信息
     * @param start
     * @param count
     * @return
     */
    @Override
    public List<User> findAllLimitOnePage (int start, int count) {
        // 定义 sql 语句
        String sql = "SELECT * FROM USER limit ?,?";
        // 执行 sql 语句
        try {
            return jt.query (sql, new BeanPropertyRowMapper<User> (User.class), start, count);
        } catch (DataAccessException e) {
            System.out.println ("执行：findAllLimitOnePage(int start, int count) 查询出错！");
            e.printStackTrace ();
        }
        return null;
    }

    /**
     *  获取用户总记录数
     * @return
     */
    @Override
    public int getUserCount () {
        // 定义sql语句：查询所有记录
        String sql = "SELECT COUNT(1) FROM USER";
        // 使用JdbcTemplate执行语句,获取所有用户信息
        return  jt.queryForObject (sql,int.class);
    }

    @Override
    public Page findUsersToPage (Map<String, String[]> map) {
        String sql = "SELECT * FROM USER WHERE 1=1 ";
        String userCountSql = "SELECT COUNT(1) FROM USER WHERE 1=1 ";
        int currentPage = 1;
        int rows = 10;
        // 遍历map
        for (Map.Entry<String, String[]> entry : map.entrySet ()) {
            if("pageNum".equals (entry.getKey ())){
                currentPage = Integer.parseInt (entry.getValue ()[0]);
                continue;
            }
            if("rows".equals (entry.getKey ())){
                rows = Integer.parseInt (entry.getValue ()[0]);
                continue;
            }
            if(entry.getValue () != null && entry.getValue ()[0] != ""){
                sql += " AND " + entry.getKey () + " = '" + entry.getValue ()[0] +"'";
                userCountSql += " AND " + entry.getKey () + " = '" + entry.getValue ()[0] +"' ";
            }
        }
        sql += " LIMIT ?,?";
        if(rows <= 0){
            rows = 10;
        }
        int userCount = jt.queryForObject (userCountSql,int.class);
        int pageCount = (userCount % rows == 0) ? (userCount / rows) : (userCount / rows) + 1;
        if(currentPage >= pageCount){
            currentPage = pageCount;
        }
        if(currentPage <= 0 ){
            currentPage = 1;
        }
        int start = (currentPage - 1) * rows;

        List<User> list = jt.query (sql, new BeanPropertyRowMapper<User> (User.class),start,rows);
    Page page = new Page (userCount,pageCount,currentPage,list,rows);
        return page;
    }

    // 查询数据库中所有用户
    @Override
    public List<User> findAllUsers(){
        // 定义sql语句：查询所有记录
        String sql = "SELECT * FROM USER";
        // 使用JdbcTemplate执行语句,获取所有用户信息
        List<User> users = jt.query(sql, new BeanPropertyRowMapper<User> (User.class));

        return users;
    }
}
