package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    @Qualifier("accountDao2")
    AccountDao accountDao;

    /**
     *  插入记录,保存
     * @param account
     */
    public void saveAccount(Account account){
        System.out.println ("保存了...");
    }

    public void t0(){
        System.out.println ("t0执行了...");
    }
    public void t1(int a){
        System.out.println ("t1执行了...");
    }
    public void t2(int a, int b){
        System.out.println ("t2执行了...");
    }
    public void t3(int a, int b , int c){
        System.out.println ("t3执行了...");
    }

    /**
     *  删除
     * @param accountId
     */
    public void deleteAccount(Integer accountId){
        accountDao.del (accountId);
    }

    public void transfer (String name1, String name2) {
        System.out.println ("service:transfer执行了.....");
        // 1. 根据名称name查找账户 account
        Account account1 = accountDao.findByName (name1);
        Account account2 = accountDao.findByName (name2);
        // 2. 转账
        account1.setMoney (account1.getMoney () - 100);
        int a = 3/0;
        account2.setMoney (account2.getMoney () + 100);
        // 3. 数据库更改记录
        accountDao.update (account1);
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
        System.out.println ("service:findALl执行了.....");
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
        System.out.println ("service:findByName执行了.....");
        return accountDao.findByName (name);
    }
}
