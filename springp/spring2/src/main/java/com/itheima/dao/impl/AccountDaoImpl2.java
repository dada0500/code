package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository("accountDao2")
public class AccountDaoImpl2 extends JdbcDaoSupport implements AccountDao {


    /**
     *  插入记录,保存
     * @param account
     */
    public void save(Account account){

    }

    /**
     *  删除
     * @param accountId
     */
    public void del(Integer accountId){

    }
    /**
     *  修改记录
     * @param account
     */
    public void update(Account account){
        System.out.println ("accountDao2执行了update");
        getJdbcTemplate ().update ("update account set money = ? where name = ?",account.getMoney (),account.getName ());
    }

    /**
     *  查询所有
     * @param
     */
    public List<Account> findAll(){
            return getJdbcTemplate ().query ("select * from account",new BeanPropertyRowMapper<Account> (Account.class));
    }

    /**
     *  根据名称查询
     * @param
     */
    public Account findByName(String name){
        return getJdbcTemplate ().queryForObject ("select * from account where name = ?",new BeanPropertyRowMapper<Account> (Account.class),name);
    }
}
