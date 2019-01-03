package com.heima.service.impl;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.heima.dao.AccountDao;
import com.heima.doamin.Account;
import com.heima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

@Component("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
//    @Resource
    private AccountDao accountDao;

/*    public void setAccountDao (AccountDao accountDao) {
        this.accountDao = accountDao;
    }*/

/*    public AccountServiceImpl(AccountDao accountDao){
        this.accountDao = accountDao;
    }*/
    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account){
        accountDao.save (account);
    }

    /**
     * 更新
     * @param account
     */
    public void updateAccount(Account account){
        accountDao.update (account);
    }

    /**
     * 删除
     * @param accountId
     */
    public void deleteAccount(Integer accountId){
        accountDao.del (accountId);
    }

    /**
     * 根据id查询
     * @param accountId
     */
    public Account findAccountById(Integer accountId){
        return accountDao.findById (accountId);
    }
    /**
     * 查询所有
     * @param
     */
    public List<Account> findAllAccount(){
        return accountDao.findAll ();
    }
}
