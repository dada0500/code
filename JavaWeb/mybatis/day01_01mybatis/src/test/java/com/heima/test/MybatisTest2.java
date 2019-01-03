package com.heima.test;

import com.heima.dao.IUserDao;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class MybatisTest2 {
    InputStream is;
    SqlSession sqlSession;
    IUserDao userDao;

    @Before
    public void init() throws IOException {
        // 1. 加载配置文件 SqlMapConfig.xml
        is = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2. 创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder ();
        SqlSessionFactory factory = builder.build (is);
        // 3. 使用SqlSessionFactor工厂获取SqlSession对象
        sqlSession = factory.openSession ();
        // 4. 使用SqlSession工厂获取dao的代理对象
        userDao = sqlSession.getMapper (IUserDao.class);
    }
    @After
    public void destory() throws IOException {
        // 提交事务
        sqlSession.commit ();
        // 6.释放资源
        sqlSession.close ();
        is.close ();
    }


    @Test
    public void testDelete(){
        // 5. 执行sql语句
        userDao.deleteUser (9);
    }
    @Test
    public void testfindUser(){
        // 5. 执行sql语句
        User user = userDao.findUser (9);
        System.out.println (user);
    }

    // 模糊查询
    @Test
    public void testfindByUsername(){
        // 5. 执行sql语句
        List<User> list = userDao.findByUsername ("%zhang%");
        System.out.println (list);
    }

    // 保存数据. 插入操作
    @Test
    public void testSave(){
        User user = new User ();
        user.setUsername ("mybatis last insertid");
        user.setPassword ("batis");
        System.out.println ("保存前:" + user);  //id=null
        // 5. 执行sql语句
        userDao.saveUser (user);
        System.out.println ("保存后:" + user);  //id=52
    }
}
