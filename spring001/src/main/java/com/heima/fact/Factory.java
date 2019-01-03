package com.heima.fact;

import com.heima.dao.AccountDao;
import com.heima.dao.impl.AccountDaoImpl;
import com.heima.service.AccountService;
import com.heima.service.impl.AccountServiceImpl;

public class Factory {

    public AccountService getAccountService(){
        return new AccountServiceImpl ();
    }

    public static AccountDao getAccountDao(){
        return new AccountDaoImpl ();
    }
}
