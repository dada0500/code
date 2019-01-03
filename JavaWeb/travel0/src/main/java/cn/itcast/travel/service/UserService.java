package cn.itcast.travel.service;

import cn.itcast.travel.domain.Category;
import cn.itcast.travel.domain.User;

import java.util.List;

public interface UserService {
    boolean registerUser (User user);

    boolean activeUser (String code);

    User login (String username, String password);

}
