package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有账户
     * @return
     */
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<Account> findAllAccount(){
        System.out.println ("查询所有账户");
        List<Account> accounts = accountDao.findAll ();
        for (Account account : accounts) {
            System.out.println (account);
        }
        return null;
    }



    /**
     * 更新账户
     * @param account
     */
    public void updateAccount(Account account){
        System.out.println ("更新账户");
        accountDao.update (account);
        findAllAccount ();
    }

    /**
     * 转账
     * @param a, b, money
     * @param b
     * @param money
     */
    public void transfer (String a, String b, Double money) {
        System.out.println ("转账");
        Account aa = accountDao.findByName (a);
        aa.setMoney (aa.getMoney () + 100);
        accountDao.update (aa);
        Account ab = accountDao.findByName (b);
        ab.setMoney (ab.getMoney () - 100);
//        int n = 10/0;
        accountDao.update (ab);
//        findAllAccount ();
    }
}
