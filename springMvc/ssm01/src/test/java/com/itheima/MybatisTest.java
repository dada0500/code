package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
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
    public void mTest() throws IOException {
        // 1.加载配置文件
        InputStream is = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (is);
        // 3.生产SqlSession
        SqlSession session = factory.openSession ();
        // 4.生成dao的代理对象
        AccountDao dao = session.getMapper (AccountDao.class);
        // 5. 执行sql操作
        List<Account> accounts = dao.findAll ();
        for (Account account : accounts) {
            System.out.println (account);
        }
        // 6.释放资源
        is.close ();
        session.close ();
    }

    //测试修改数据
    @Test
    public void moTest() throws IOException {
        // 1.加载配置文件
        InputStream is = Resources.getResourceAsStream ("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build (is);
        // 3.生产SqlSession
        SqlSession session = factory.openSession ();
        // 4.生成dao的代理对象
        AccountDao dao = session.getMapper (AccountDao.class);
        // 5. 执行sql操作
        Account account = new Account ();
        account.setName ("aaa");
        account.setMoney (1000D);
        dao.update (account);
        Account ac = dao.findByName ("aaa");
        System.out.println (ac);
        // 6.提交事务
        session.commit ();
        // 7.释放资源
        is.close ();
        session.close ();
    }
}
