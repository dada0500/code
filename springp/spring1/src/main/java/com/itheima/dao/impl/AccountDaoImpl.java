package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.util.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    QueryRunner runner;
    ConnectionUtil connectionUtil;

    public AccountDaoImpl (QueryRunner runner, ConnectionUtil connectionUtil) {
        this.runner = runner;
        this.connectionUtil = connectionUtil;
    }

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
        try {
            runner.update (connectionUtil.getConnection (),"update account set money = ? where name = ?",account.getMoney (),account.getName ());
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    /**
     *  查询所有
     * @param
     */
    public List<Account> findAll(){
        try {
            return runner.query (connectionUtil.getConnection (),"select * from account",new BeanListHandler<Account> (Account.class));
        } catch (SQLException e) {
            e.printStackTrace ();
            return null;
        }
    }

    /**
     *  根据名称查询
     * @param
     */
    public Account findByName(String name){
        try {
            return runner.query (connectionUtil.getConnection (),"select * from account where name = ?",new BeanHandler<Account> (Account.class),name);
        } catch (SQLException e) {
            e.printStackTrace ();
            return null;
        }
    }
}
