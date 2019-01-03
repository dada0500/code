package com.heima.test;

import com.heima.dao.impl.UserDaoImpl;
import com.heima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/*
public class ImplTest {
    SqlSession session;
    UserDaoImpl userDao;
    InputStream in;
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream ("SqlMapConfig.xml");
        session = new SqlSessionFactoryBuilder ().build (in).openSession ();
        userDao = new UserDaoImpl (session);
    }


    @After
    public void destroy() throws IOException {
        session.commit ();
        session.close ();
        in.close ();
    }

    @Test
    public void testAdd(){
        User user = new User ();
        user.setUsername ("testAdd");
        userDao.addUser (user);
    }

    @Test
    public void testDel(){
        userDao.deleteUser ("%改%");
    }
}
*/
