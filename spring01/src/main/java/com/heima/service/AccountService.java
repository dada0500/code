package com.heima.service;

import com.heima.doamin.Account;

import java.util.List;

public interface AccountService {
    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 根据id查询
     * @param accountId
     */
    Account findAccountById(Integer accountId);

    /**
     * 查询所有
     * @param
     */
    List<Account> findAllAccount();
}
