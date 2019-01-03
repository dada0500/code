package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class rTest {
    @Autowired
    @Qualifier("accountService")
    AccountService as;

    @Test
    public void testTransfer(){
        as.transfer ("aaa","ccc");
    }

    @Test
    public void testUpdate(){
        List<Account> accounts = as.findAllAccount ();
        System.out.println (accounts);
    }



    @Test
    public void testR(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate ();
        List<Account> accounts = jdbcTemplate.query ("sql", new BeanPropertyRowMapper<Account> (Account.class), as);
        Account account = new Account ();
        as.saveAccount (account);
        as.t0 ();
        as.t1 (1);
        as.t2 (1,2);
        as.t3 (1,2,3);
    }
}