package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

public interface Service {
    public void addUser (User user);

    public User login (String username, String password);

    public PageBean<User> findUsersByPage (String currentPage, String rows, Map<String, String[]> condition);

    void updateUser (User user);
}
