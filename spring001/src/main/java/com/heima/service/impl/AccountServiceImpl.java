package com.heima.service.impl;

import com.heima.dao.AccountDao;
import com.heima.dao.impl.AccountDaoImpl;
import com.heima.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    public AccountServiceImpl(){
        System.out.println ("创建了AccountServiceimpl");
    }

    public void save () {
        accountDao.save();
    }

    public void init(){
        System.out.println ("初始化");
    }
    public void destroy(){
        System.out.println ("销毁");
    }
}
