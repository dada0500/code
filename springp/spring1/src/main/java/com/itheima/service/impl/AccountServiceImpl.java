package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.util.TransactionManager;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;

    public AccountServiceImpl (AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    /**
     *  插入记录,保存
     * @param account
     */
    public void saveAccount(Account account){
    }

    /**
     *  删除
     * @param accountId
     */
    public void deleteAccount(Integer accountId){
        accountDao.del (accountId);
    }

    public void transfer (String name1, String name2) {
        //1.根据名称name查找账户account
        Account account1 = accountDao.findByName (name1);
        Account account2 = accountDao.findByName (name2);
        //2.转账
        account1.setMoney (account1.getMoney () - 100);
        account2.setMoney (account2.getMoney () + 100);
        //3.数据库更改记录
        accountDao.update (account1);
        int a = 3/0;
        accountDao.update (account2);
    }

    /**
     *  修改记录
     * @param account
     */
    public void updateAccount(Account account){
        // account

    }

    /**
     *  查询所有
     * @param
     */
    public List<Account> findAllAccount(){
        System.out.println ("查询所有");
        return accountDao.findAll ();
/*        try {
            // 1.设置事务手动提交
            tm.setNotAutoCommit ();
            // 2.执行sql
            List<Account> accounts= accountDao.findAll ();
            // 3.提交事务
            tm.commit ();
            // 4.返回结果
            return accounts;
        } catch (Exception e) {
            // 5.回滚事务
            tm.rollback ();
            e.printStackTrace ();
            return null;
        }finally {
            // 6.设置事务自动提交,释放连接
            tm.setAutoCommit ();
            tm.release ();
        }*/
    }

    /**
     *  根据名称查询
     * @param
     */
    public Account findAccountByName(String name){
        return accountDao.findByName (name);
    }
}
