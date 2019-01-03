package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean register (User user);

    boolean active (String status, String code);

    User findUser (String username, String password);
}
