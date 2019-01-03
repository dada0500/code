package com.heima.dao;

import com.heima.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User findUserByUsernameAndPassword (String username, String password);

    int getUserCountByCondition (Map<String, String> cond);

    List<User> findUsersByPage (int start, int rows, Map<String, String> cond);
}
