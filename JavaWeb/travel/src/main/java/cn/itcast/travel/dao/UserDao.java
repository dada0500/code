package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

    /**
     * 查找用户是否存在
     * @param user
     * @return
     */
    User findUser (User user);

    /**
     * 注册用户
     * @param user
     */
    void register (User user);

    boolean active (String status, String code);

    User findUser (String username, String password);
}
