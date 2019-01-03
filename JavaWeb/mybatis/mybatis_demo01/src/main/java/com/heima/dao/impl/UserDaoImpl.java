/*
package com.heima.dao.impl;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    SqlSession session;
    public UserDaoImpl(SqlSession session){
        this.session = session;
    }

    public List<User> findAll () {
        return null;
    }

    public void addUser (User user) {
        session.insert ("com.heima.dao.UserDao.addUser",user);
    }

    public void deleteUser (String username) {
        session.delete ("com.heima.dao.UserDao.deleteUser",username);
    }

    public void updateUser (User user) {

    }

    public List<User> findByUsername (String username) {
        return null;
    }
}
*/
