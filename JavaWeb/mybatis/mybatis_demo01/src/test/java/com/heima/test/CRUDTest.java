package com.heima.test;

import com.heima.dao.UserDao;
import com.heima.domain.PojoVo;
import com.heima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRUDTest {
    SqlSession session;
    InputStream in;
    UserDao userDao;

    @Before
    public void init () throws IOException {
        in = Resources.getResourceAsStream ("SqlMapConfig.xml");
        session = new SqlSessionFactoryBuilder ().build (in).openSession ();
        userDao = session.getMapper (UserDao.class);
    }

    @After
    public void destroy () throws IOException {

        session.commit ();
        session.close ();
        in.close ();
    }

    @Test
    public void testAdd () {
        User user = new User ();
        user.setUsername ("增加用户17");
        user.setBirthday (new Date ());
        user.setSex ("男");
        user.setAddress ("北京");
        System.out.println ("增加前：" + user);
        userDao.addUser (user);
        System.out.println ("增加后：" + user);
    }

    @Test
    public void testDel () {
        userDao.deleteUser ("%加%");
    }

    @Test
    public void testUpdate () {
        User user = new User ();
        user.setId (48);
        user.setUsername ("修改");
        System.out.println ("修改前：" + user);
        userDao.updateUser (user);
        System.out.println ("修改后：" + user);
    }

    @Test
    public void testFind() {
        List<User> users = userDao.findByUsername ("老王");

        for (User u : users) {
            System.out.println (u);
        }
    }

    @Test
    public void testFindByCondition() {
        User user = new User ();
        user.setUsername ("老王");
//        user.setSex ("");
        List<User> us = userDao.findByCondition (user);

        for (User u : us) {
            System.out.println (u);
        }
    }

    @Test
    public void testFindByIds() {
        PojoVo vo = new PojoVo ();

        User user = new User ();
        user.setUsername ("老王");

        vo.setUser (user);

        List<Integer> ids = new ArrayList<Integer> ();
        ids.add (55);
        ids.add (56);
        ids.add (57);

        vo.setIds (ids);
//        user.setSex ("");
        List<User> us = userDao.findByIds (vo);

        for (User u : us) {
            System.out.println (u);
        }
    }


}
