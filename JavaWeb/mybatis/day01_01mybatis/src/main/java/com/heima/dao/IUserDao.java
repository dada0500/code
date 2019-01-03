package com.heima.dao;

import com.heima.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

    void saveUser(User user);

    User findUser (Integer uid);

    // 省略其他方法...

    void deleteUser(Integer uid);

    // 模糊查询
    List<User> findByUsername(String username);
}
