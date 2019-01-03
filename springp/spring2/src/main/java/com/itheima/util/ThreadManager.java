package com.itheima.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class ThreadManager {


//    @Pointcut("execution(* com.itheima.service.impl.*.*(..))")
//    @Pointcut("execution(* com.itheima.service.impl.*.*(*,*))")
    private void pt1(){}

//    @Before("pt1()")
    public void before(){
        System.out.println ("前置通知");
    }

//    @AfterReturning("pt1()")
    public void afterReturning(){
        System.out.println ("后置通知");
    }

//    @AfterThrowing("pt1()")
    public void afterThrowing(){
        System.out.println ("异常通知");
    }

//    @After("pt1()")
    public void after(){
        System.out.println ("最终通知");
    }

//    @Around ("pt1()")
    public void around(ProceedingJoinPoint pjp){
        System.out.println ("环绕通知");
        Object[] args = pjp.getArgs ();
        try {
            pjp.proceed (args);
        } catch (Throwable throwable) {
            throwable.printStackTrace ();
        }
    }
}
