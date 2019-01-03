package com.heima.dao;

import com.heima.domain.Page;
import com.heima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    // 查询所有用户
    public List<User> findAllUsers();

    // 修改用户
    public int updateUserById(User user);

    // 添加用户
    public int addUser(User user);

    // 根据id删除用户
    public int delUserById(int uid);

    // 查询是否存在 用户名、密码 匹配的用户
    public User findAdminByNameAndPassword (String username, String password);

    // 根据id查找用户信息
    public User findUserById (int uid);

    // 传入map，查找用户信息
    public List<User> findUsers (Map<String,String[]> map);

    // 分页查询，查询一页的用户信息
    List<User> findAllLimitOnePage (int start, int count);

    // 获取用户总数
    int getUserCount ();

    Page findUsersToPage (Map<String, String[]> map);
}
