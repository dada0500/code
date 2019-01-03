package com.itheima.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class logger {

    public void printLog(){
            // 1.设置事务手动提交
        TransactionManager.setNotAutoCommit ();
            // 2.执行sql

            // 4.返回结果
//            return returnValue;
        System.out.println ("前置...");
    }

    public void afterReturn() {
        System.out.println ("后置");
        // 3.提交事务
//        TransactionManager.commit ();
    }

    public void afterThrowing() {
        System.out.println ("异常");
        // 5.回滚事务
        TransactionManager.rollback ();
    }

    public void endLog(){
        // 6.设置事务自动提交,释放连接
//        TransactionManager.setAutoCommit ();
//        TransactionManager.release ();
        System.out.println ("最终...");
    }
    public void around(ProceedingJoinPoint pjp){
        System.out.println ("环绕...");
        Object target = pjp.getTarget ();
        System.out.println ("target:"+target);
        Object args = pjp.getArgs ();
        System.out.println ("args:"+args);
        Object kind = pjp.getKind ();
        System.out.println ("kind:"+kind);
        Object i = pjp.getThis ();
        System.out.println ("i:"+i);

    }
}
