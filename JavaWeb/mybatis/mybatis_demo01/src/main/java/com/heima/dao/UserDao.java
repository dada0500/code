package com.heima.dao;

import com.heima.domain.PojoVo;
import com.heima.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    void addUser(User user);

    void deleteUser(String username);

    void updateUser(User user);

    List<User> findByUsername(String username);

    List<User> findByCondition(User user);

    List<User> findByIds(PojoVo vo);
}
