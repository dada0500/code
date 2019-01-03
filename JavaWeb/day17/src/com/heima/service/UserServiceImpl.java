package com.heima.service;

import com.heima.dao.UserDao;
import com.heima.dao.UserDaoImpl;
import com.heima.domain.Page;
import com.heima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserServiceImpl implements UserService {
    // 获取UserDao实现类对象
    private UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll () {
        List<User> users = userDao.findAllUsers ();
        return users;
    }

    @Override
    public User findUserById (int uid) {
        return userDao.findUserById(uid);
    }

    @Override
    public boolean update (User user) {
        if(user == null || user.getName () == null){
            return false;
        }
        int i = userDao.updateUserById (user);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean add (User user) {
        if(user == null || user.getName () == "" || user.getName () == null){
            return false;
        }
        int i = userDao.addUser (user);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean del ( int uid) {
        int i = userDao.delUserById (uid);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public User findByNameAndPassword (String username, String password) {
        if(username == null || password == null){
            return null;
        }
        return userDao.findAdminByNameAndPassword(username,password);
    }

    @Override
    public List<User> findUsers (Map map) {
        return userDao.findUsers (map);
    }

    @Override
    public Page findUsersToPage (Map<String,String[]> map) {
        return userDao.findUsersToPage(map);
    }

    @Override
    public List<User> findAllLimitOnePage (int start, int Count) {
        return userDao.findAllLimitOnePage (start,Count);
    }

    // 获取用户总数
    @Override
    public int getUserCount () {
        return userDao.getUserCount();
    }


}
