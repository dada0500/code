package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    /**
     *  插入记录,保存
     * @param account
     */
    void save(Account account);

    /**
     *  删除
     * @param accountId
     */
    void del(Integer accountId);

    /**
     *  修改记录
     * @param account
     */
    void update(Account account);

    /**
     *  查询所有
     * @param
     */
    List<Account> findAll();

    /**
     *  根据名称查询
     * @param
     */
    Account findByName(String name);
 }
