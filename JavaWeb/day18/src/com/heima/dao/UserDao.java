package com.heima.dao;

import com.heima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findUserByUsernameAndPassword (String username, String password);

    /**
     * 根据id删除用户
     * @param id
     */
    void delUserById (int id);


    int getUserCount ();

    /**
     * 根据条件，分页查询用户
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    List<User> findUsersBypage (int start, int rows, Map<String, String[]> condition);

    int getUserCountByCondition (Map<String, String[]> condition);
}
