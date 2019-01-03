package com.heima.test;

import com.heima.dao.AccountDao;
import com.heima.dao.UserDao;
import com.heima.domain.Account;
import com.heima.domain.AccountUser;
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

public class AccountDaoTest {
    SqlSession session;
    InputStream in;
    AccountDao accountDao;

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
        accountDao = session.getMapper (AccountDao.class);

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
        List<AccountUser> users = accountDao.findAllAccountUser ();
        for (AccountUser account : users) {
            System.out.println (account);
//            System.out.println (account.getUser ());
        }
    }

    @Test
    public void testFindAllAccount(){
        // 5. 使用代理对象调用方法
        List<Account> users = accountDao.findAllAccount ();
        for (Account account : users) {
            System.out.println (account);
            System.out.println (account.getUser());
        }
    }

    @Test
    public void testFindAccount(){
        // 5. 使用代理对象调用方法
        List<Account> accounts = accountDao.findAccount ();
        for (Account account : accounts) {
            System.out.println (account);
            System.out.println (account.getUser());
        }
    }
}
