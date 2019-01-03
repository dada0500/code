package com.heima.service.impl;

import com.heima.dao.UserDao;
import com.heima.dao.impl.UserDaoImpl;
import com.heima.domain.Page;
import com.heima.domain.PageBean;
import com.heima.domain.User;
import com.heima.service.Service;

import java.util.List;
import java.util.Map;


public class ServiceImpl implements Service {
    UserDao userDao = new UserDaoImpl ();
    @Override
    public User login (User user) {
        return userDao.findUserByUsernameAndPassword(user.getUsername (),user.getPassword ());
    }

    @Override
    public void deleltUser (int id) {
        userDao.delUserById(id);
    }

    @Override
    public Page<User> findUsersByPage (String currentPageStr, String rowsStr, Map<String, String[]> condition) {
        int currentPage = 1;
        int rows = 5;
        try {
            currentPage = Integer.parseInt (currentPageStr);
            rows = Integer.parseInt (rowsStr);
        } catch (NumberFormatException e) {
//            e.printStackTrace ();
        }

        // 1. 创建空的Page对象
        Page<User> page = new Page<User> ();

        // 2. 设置属性值
        // 获取总记录数
        int totalCount = userDao.getUserCountByCondition (condition);
        // 2.3 setTotalCount
        page.setTotalCount (totalCount);
        // 2.4 setTotalpage
        int totalPage = (totalCount % rows == 0) ? (totalCount / rows) : (totalCount / rows) + 1;
        page.setTotalPage (totalPage);

        if(currentPage > totalPage){
            currentPage = totalPage;
        }

        if(currentPage <= 0 ){
            currentPage = 1;
        }
        if(rows <= 0 ){
            rows = 5;
        }

        // 2.1 setCurrentPage
        page.setCurrentPage (currentPage);
        // 2.2 setRows
        page.setRows (rows);
        // 2.5 setList
        // 获取 详细记录
        int start = (currentPage - 1) * rows;
        List<User> list = userDao.findUsersBypage(start,rows,condition);
        page.setList (list);
        return page;
    }
}
