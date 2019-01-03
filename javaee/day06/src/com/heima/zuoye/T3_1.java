package com.heima.zuoye;

public class T3_1 {
    public static void main (String[] args) {
        new extendsThread("继承Thread类").start ();
        new Thread (new runnableImpl (),"实现Runnable接口").start ();
        System.out.println ( Thread.currentThread ().getName ());
    }
}

class extendsThread extends Thread{
    public extendsThread () {
    }

    public extendsThread (String name) {
        super (name);
    }

    @Override
    public void run () {
        System.out.println ( "线程：" + getName ());
    }
}

class runnableImpl implements Runnable{
    @Override
    public void run () {
        System.out.println ( "线程：" + Thread.currentThread ().getName () );
    }
}