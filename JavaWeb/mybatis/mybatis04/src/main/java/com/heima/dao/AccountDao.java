package com.heima.dao;

import com.heima.domain.Account;
import com.heima.domain.AccountUser;
import com.heima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 查询所有账户 一对一，多对一
     */
    public List<AccountUser> findAllAccountUser ();

    /**
     * 查询所有账户
     */
    public List<Account> findAllAccount ();


    @Select("select * from account")
    @Results(id="accountMap",value = {
            @Result(property="id",column="id"),
            @Result(property="uid",column="uid"),
            @Result(property="money",column="money"),
            @Result(property = "user",column="uid",javaType = User.class,
                    one=@One(select = "com.heima.dao.UserDao.findUserById")
            )
    })
    public List<Account> findAccount();
}
