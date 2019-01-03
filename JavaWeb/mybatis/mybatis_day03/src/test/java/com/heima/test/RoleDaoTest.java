package com.heima.test;

import com.heima.dao.RoleDao;
import com.heima.domain.Role;
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

public class RoleDaoTest {
    SqlSession session;
    InputStream in;
    RoleDao roleDao;

    @Before
    public void init() throws IOException {
        // 1. 读取配置文件
        in = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2. 创建SqlSessionFactoryBuilder构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder ();
        // 3. 创建SqlSessionFactory工厂
        SqlSessionFactory factory = builder.build (in);
        // 4. 创建SqlSession
        session = factory.openSession ();
        // 5. 创建代理对象
        roleDao = session.getMapper (RoleDao.class);
        // ....执行查询
    }

    @After
    public void destroy() throws IOException {
        // 6. 提交事务
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void testFindRoleUser(){
        List<Role> roles = roleDao.findRoleUser ();
        for (Role role : roles) {
            System.out.println ("--------");
            System.out.println (role);
            System.out.println (role.getUser ());
        }
    }

}
