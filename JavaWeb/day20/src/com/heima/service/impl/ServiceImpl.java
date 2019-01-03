package com.heima.service.impl;

import com.heima.dao.UserDao;
import com.heima.dao.impl.UserDaoImpl;
import com.heima.demo.PageBean;
import com.heima.domain.User;
import com.heima.service.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements Service {
    UserDao userDao = new UserDaoImpl ();

    @Override
    public User checkLogin (String username, String password) {
        return userDao.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public PageBean<User> findUsersByPage (Map<String, String[]> condition) {
        int currentPage = 1;
        int start = 1;
        int rows = 5;
        int totalCount = 0;
        int totalPage = 0;

        Map<String,String> cond = new HashMap<> ();
        for (String key : condition.keySet ()) {
            String value = condition.get (key)[0];

            if(value != null && !"".equals (value)){
                if("currentPage".equals (key)){
                    currentPage = Integer.parseInt (value);
                    continue;
                }
                if("rows".equals (key)){
                    rows = Integer.parseInt (value);
                    continue;
                }
                cond.put (key,value);
            }
        }

        if(rows <= 0){
            rows = 5;
        }

        totalCount = userDao.getUserCountByCondition(cond);

        totalPage = (totalCount % rows == 0) ? totalCount / rows : totalCount / rows + 1 ;

        if(currentPage > totalPage){
            currentPage = totalPage;
        }
        if(currentPage <= 0){
            currentPage = 1;
        }
        start = (currentPage - 1) * rows;
        List<User> list = userDao.findUsersByPage (start, rows, cond);

        PageBean<User> pb = new PageBean<> (currentPage,rows,totalCount,totalPage,list);
        return pb;
    }
}
