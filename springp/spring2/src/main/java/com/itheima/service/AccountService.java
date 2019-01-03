package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     *  插入记录,保存
     * @param account
     */
    void saveAccount (Account account);

    /**
     *  删除
     * @param accountId
     */
    void deleteAccount (Integer accountId);

    /**
     *  修改记录
     * @param account
     */
    void updateAccount (Account account);

    /**
     *  查询所有
     * @param
     */
    List<Account> findAllAccount ();

    /**
     *  根据名称查询
     * @param
     */
    Account findAccountByName (String name);

    /**
     *  转账
     * @param
     */
    void transfer (String name1, String name2);



    public void t0();

    public void t1(int a);

    public void t2(int a, int b);

    public void t3(int a, int b , int c);

}
