package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 转账
     * @param a, b, money
     */
    void transfer(String a, String b, Double money);
}
