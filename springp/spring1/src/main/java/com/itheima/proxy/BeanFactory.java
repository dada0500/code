package com.itheima.proxy;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import com.itheima.util.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class BeanFactory {
    TransactionManager tm;
    AccountServiceImpl accountService;

    public void setAccountService (AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    public void setTm (TransactionManager tm) {
        this.tm = tm;
    }

    public AccountService getAccountService(){
        return (AccountService) Proxy.newProxyInstance (accountService.getClass ().getClassLoader (), accountService.getClass ().getInterfaces (), new InvocationHandler () {
            public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {

                try {
                    // 1.设置事务手动提交
                    tm.setNotAutoCommit ();
                    // 2.执行sql
                    Object returnValue = method.invoke (accountService, args);
                    // 3.提交事务
                    tm.commit ();
                    // 4.返回结果
                    return returnValue;
                } catch (Exception e) {
                    // 5.回滚事务
                    tm.rollback ();
                    e.printStackTrace ();
                    return null;
                }finally {
                    // 6.设置事务自动提交,释放连接
                    tm.setAutoCommit ();
                    tm.release ();
                }
            }
        });
    }
}
