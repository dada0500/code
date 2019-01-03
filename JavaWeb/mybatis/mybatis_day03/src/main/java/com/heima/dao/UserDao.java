package com.heima.dao;

import com.heima.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     */
    public List<User> findAll();
    /**
     * 查询用户 id
     */
    public User findUserById(int id);
    /**
     * 查询所有 username
     */
    public User findUserByUsername(String username);

    /**
     * 查询所有用户 及其 账户信息
     */
    public List<User> findAllUserAccount();

    /**
     * 查询所有用户 及其 角色信息
     */
    public List<User> findAllUserRole();
}
