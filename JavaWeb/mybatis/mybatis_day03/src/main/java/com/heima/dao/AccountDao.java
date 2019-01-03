package com.heima.dao;

import com.heima.domain.Account;
import com.heima.domain.AccountUser;
import com.heima.domain.User;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有账户 一对一，多对一
     */
    public List<AccountUser> findAllAccountUser ();

    /**
     * 查询所有账户
     */
    public List<Account> findAllAccount ();
}
