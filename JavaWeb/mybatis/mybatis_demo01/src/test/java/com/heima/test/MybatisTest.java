package com.heima.test;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void testFindAll() throws IOException {
        // 1. 读取配置文件
        InputStream is = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2. 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder ();
        SqlSessionFactory factory = builder.build (is);
        // 3. 通过SqlSessionFactory创建SqlSession对象
        SqlSession session = factory.openSession ();
        // 4. 使用SqlSession对象创建UserDao的代理对象
        UserDao user = session.getMapper (UserDao.class);
        // 5. 执行查询
        List<User> users = user.findAll ();
        for (User u : users) {
            System.out.println (u);
        }
        // 6. 释放资源
        session.close ();
        is.close ();
    }
}
