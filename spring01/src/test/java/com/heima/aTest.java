package com.heima;

import com.config.Config;
import com.heima.doamin.Account;
import com.heima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Config.class})
public class aTest {

    @Autowired
    @Qualifier("accountService")
    AccountService as;

    @Test
    public void noJunitTest(){
        System.out.println (as);
        List<Account> allAccount = as.findAllAccount ();
        System.out.println (allAccount);

    }

    @Test
    public void bTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext (Config.class);
        String n = ac.getApplicationName ();
        System.out.println (n);
        String n1 = ac.getDisplayName ();
        System.out.println (n1);
        AccountService as1 = ac.getBean ("accountService", AccountService.class);
        System.out.println (as1);
        AccountService as2 = ac.getBean ("accountService", AccountService.class);
        System.out.println ("as2:"+as2);
        List<Account> allAccount = as1.findAllAccount ();
        System.out.println (allAccount);

    }


    @Test
    public void aTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext ("com/heima/doamin/bean.xml");
        AccountService as = ac.getBean ("accountService", AccountService.class);
        AccountService as2 = ac.getBean ("accountService", AccountService.class);
        System.out.println (as);
        System.out.println (as2);
        List<Account> allAccount = as.findAllAccount ();
        System.out.println (allAccount);

        System.out.println ("---0---");

        Account accountById = as.findAccountById (2);
        System.out.println (accountById);
        System.out.println ("---1---");

        accountById.setMoney (21003f);
        as.updateAccount (accountById);

        System.out.println ("---2---");
        Account accountById2 = as.findAccountById (2);
        System.out.println (accountById2);

    }
}
