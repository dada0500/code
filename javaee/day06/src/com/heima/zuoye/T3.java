package com.heima.zuoye;

public class T3 {

/*
    	练习三：多线程练习
    问题：
    请编写程序，分别打印主线程的名称和子线程的名称。
    要求使用两种方式实现：
    第一种方式：继承Thread类。
    第二种方法：实现Runnable接口。
*/
    public static void main (String[] args) {
        //继承Thred类
        new Thread ("继承Thread类"){
            @Override
            public void run () {
                System.out.println ( "线程：" + getName ());
            }
        }.start ();

        System.out.println ( "线程：" + Thread.currentThread ().getName () );

        //实现Runnable接口
        new Thread (() -> System.out.println ( "线程：" + Thread.currentThread ().getName () ),"实现Runnable接口").start ();
    }
}
