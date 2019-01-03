package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.Service;

import java.util.List;
import java.util.Map;

public class ServiceImpl implements Service {
    UserDao userDao = new UserDaoImpl ();

    @Override
    public void addUser (User user) {
        userDao.addUser(user);
    }

    @Override
    public User login (String username, String password) {
        return userDao.findUserByUsernameAndPasswrod(username,password);
    }

    @Override
    public PageBean<User> findUsersByPage (String currentPageStr, String rowsStr, Map<String, String[]> condition) {
        int currentPage = 1;
        int rows = 5;
        if (currentPageStr != null && currentPageStr != "") {
            currentPage = Integer.parseInt (currentPageStr);
        }
        if (rowsStr != null && rowsStr != "") {
            rows = Integer.parseInt (rowsStr);
        }

        if(currentPage <= 0){
            currentPage = 1;
        }

        int totalCount = userDao.getUserCountByCondition (condition);
        int totalPage = (totalCount % rows == 0) ? (totalCount / rows) : (totalCount / rows) + 1;

        if(currentPage > totalPage){
            currentPage = totalPage;
        }

        List<User> list = userDao.findUsesByPage (currentPage, rows, condition);
        PageBean<User> pb = new PageBean<> ();
        pb.setCurrentPage (currentPage);
        pb.setRows (rows);
        pb.setList (list);
        pb.setTotalCount (totalCount);
        pb.setTotalPage (totalPage);

        return pb;

    }

    @Override
    public void updateUser (User user) {
        userDao.updateUser(user);
    }

}
