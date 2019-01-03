package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    void addUser (User user);

    User findUserByUsernameAndPasswrod (String username, String password);

    int getUserCountByCondition (Map<String, String[]> condition);

    List<User> findUsesByPage (int currentPage, int rows, Map<String, String[]> condition);

    void updateUser (User user);
}
