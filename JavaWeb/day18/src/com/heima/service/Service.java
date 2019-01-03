package com.heima.service;

import com.heima.domain.Page;
import com.heima.domain.PageBean;
import com.heima.domain.User;

import java.util.Map;

public interface Service {
    User login (User user);

    void deleltUser (int id);

    Page<User> findUsersByPage (String currentPage, String rows, Map<String, String[]> condition);
}
