package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;
import cn.itcast.travel.domain.User;

import java.util.List;

public interface UserDao {
    User findUserByUsername (String username);

    void register (User user);

    User findUserByCode (String code);

    boolean activeUser (User user);

    User finUserByUsernameAndPassword (String username, String password);

}
