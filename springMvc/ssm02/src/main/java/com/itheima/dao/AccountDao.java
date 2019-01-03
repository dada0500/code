package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 根据姓名查询账户
     * @return
     */
    @Select("select * from account where name = #{name}")
    Account findByName(String name);

    /**
     * 更新账户
     * @param account
     */
    @Update ("update account set money = #{money} where name = #{name}")
    void update(Account account);
}
