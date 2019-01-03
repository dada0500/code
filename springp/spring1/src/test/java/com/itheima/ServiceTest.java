package com.itheima;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:bean.xml"})
public class ServiceTest {
    @Autowired
    AccountService as;

    @Test
    public void sTest(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext ("bean.xml");
//        AccountService as = ac.getBean ("accountService", AccountService.class);
        List<Account> accounts = as.findAllAccount ();
        for (Account account : accounts) {
            System.out.println (account);
        }
    }

    @Test
    public void upTest(){
//        as.transfer ("aaa","ccc");
        as.transfer ("ccc","aaa");
 /*       Account aaa = as.findAccountByName ("aaa");
        System.out.println (aaa);
        Account ccc = as.findAccountByName ("ccc");
        System.out.println (ccc);*/
    }

}
