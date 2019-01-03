package com.heima.service;

import com.heima.demo.PageBean;
import com.heima.domain.User;

import java.util.Map;

public interface Service {
    User checkLogin (String username, String password);

    PageBean<User> findUsersByPage (Map<String, String[]> condition);
}
