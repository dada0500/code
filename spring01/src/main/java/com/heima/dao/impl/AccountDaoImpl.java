package com.heima.dao.impl;

import com.heima.dao.AccountDao;
import com.heima.doamin.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

/*    public void setJdbcTemplate (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

  /* public AccountDaoImpl (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/
    /**
     * 保存
     * @param account
     */
    public void save(Account account){
        try {
            jdbcTemplate.update ("INSERT account (name,money) VALUES(?,?)",account.getName (),account.getMoney ());
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
    }

    /**
     * 更新
     * @param account
     */
    public void update(Account account){
        try {
            jdbcTemplate.update ("UPDATE account SET name = ?, money = ? WHERE id = ?",account.getName (),account.getMoney (),account.getId ());
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
    }

    /**
     * 删除
     * @param accountId
     */
    public void del(Integer accountId){
        try {
            jdbcTemplate.update ("DELETE FROM account SET WHERE id = ?",accountId);
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }

    }

    /**
     * 根据id查询
     * @param accountId
     */
    public Account findById(Integer accountId){
        Account account = null;
        try {
            account = jdbcTemplate.queryForObject ("SELECT * FROM account WHERE id = ?", new BeanPropertyRowMapper<Account> (Account.class), accountId);
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return account;
    }

    /**
     * 查询所有
     * @param
     */
    public List<Account> findAll(){
        List<Account> accounts = null;
        try {
            accounts = jdbcTemplate.query ("SELECT * FROM account", new BeanPropertyRowMapper<Account> (Account.class));
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return accounts;

    }
}
