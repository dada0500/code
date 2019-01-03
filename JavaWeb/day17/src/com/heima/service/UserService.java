package com.heima.service;

import com.heima.domain.Page;
import com.heima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    // 查询所有用户
    public List<User> findAll();

    // 根据id查询用户
    public User findUserById (int uid);

    // 修改用户
    public boolean update(User user);

    // 添加用户
    public boolean add(User user);

    // 删除用户
    public boolean del(int uid);

    // 查询是否存在 用户名、密码 匹配的用户
    public User findByNameAndPassword (String username, String password);

    // 根据传入的信息查询
    List<User> findUsers (Map map);
    Page findUsersToPage (Map<String,String[]> map);

    // 分页查询，查询一页的用户信息
    List<User> findAllLimitOnePage (int start, int Count);

    // 获取用户总数
    int getUserCount ();
}
