package com.heima.test;

import com.heima.dao.IUserDao;
import com.heima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main (String[] args) throws IOException {
        // 读取核心配置文件 SqlMapConfig.xml
        InputStream is = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 创建SqlSessionFactory工厂，并读取核心配置文件中的配置信息
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder ();
        SqlSessionFactory factory = builder.build (is);
        // 通过SqlSessionFactor工厂的openSession方法1获取SqlSession对象
        SqlSession sqlSession = factory.openSession ();
        // 通过SqlSession对象的getMapper方法得到IUserDao的动态代理对象
        IUserDao userDao = sqlSession.getMapper (IUserDao.class);
        // 调用useDao中的findUser方法
        List<User> all = userDao.findAll ();
        for (User user : all) {
            System.out.println (user);
        }
        // 释放资源
        sqlSession.clearCache ();
        is.close ();
    }
}
