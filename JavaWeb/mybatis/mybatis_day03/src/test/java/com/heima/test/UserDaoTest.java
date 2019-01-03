package com.heima.test;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoTest {
    SqlSession session;
    InputStream in;
    UserDao userDao;

    @Before
    public void init() throws IOException {
        // 1. 加载配置文件
        in = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2. 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder ();
        SqlSessionFactory factory = builder.build (in);
        // 3. 使用SqlSessionFactory工厂生产SqlSession对象
        session = factory.openSession ();
        // 4. 通过Sqlsession创建dao的代理对象
        userDao = session.getMapper (UserDao.class);

    }

    @After
    public void destroy() throws IOException {
        // 提交事务
        session.commit ();
        // 6. 释放资源
        session.close ();
        in.close ();
    }

    @Test
    public void testFindAll(){
        // 5. 使用代理对象调用方法
        List<User> users = userDao.findAll ();
    }

    @Test
    public void testFindAllUserAccount(){
        int i = 1;
        List<User> users = userDao.findAllUserAccount ();
        for (User user : users) {
            System.out.println ("-----【"+i+"】-----");
            System.out.println (user);
            System.out.println (user.getAccounts ());
            i++;
        }
    }

    /**
     * 查询用户
     */
    @Test
    public void testFindUserByID(){
        User user1 = userDao.findUserById (48);
        System.out.println (user1);
        User user2 = userDao.findUserByUsername ("小马宝莉");
        System.out.println (user2);
        System.out.println (user1 == user2);
    }

    /**
     * 查询所有用户及其角色信息
     */
    @Test
    public void testFindAllUserRole(){
        int i = 1;
        List<User> users = userDao.findAllUserRole ();
        for (User user : users) {
            System.out.println ("-----【"+i+"】-----");
            System.out.println (user);
            System.out.println (user.getRoles ());
            i++;
        }
    }
}
