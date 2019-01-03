package com.heima.dao;

import com.heima.doamin.Account;

import java.util.List;

public interface AccountDao {

    /**
     * 保存
     * @param account
     */
    void save(Account account);

    /**
     * 更新
     * @param account
     */
    void update(Account account);

    /**
     * 删除
     * @param accountId
     */
    void del(Integer accountId);

    /**
     * 根据id查询
     * @param accountId
     */
    Account findById(Integer accountId);

    /**
     * 查询所有
     * @param
     */
    List<Account> findAll();
}
