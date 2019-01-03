package com.heima;
/*
4.	描述：（代码实现）
        现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
*/


public class T4 {
    public static void main (String[] args) throws InterruptedException {

        Printer p = new Printer ();

        new Thread ("T1"){
            @Override
            public void run () {
                synchronized(T4.class){
                    try {
                        p.print1 ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        }.start ();
        new Thread ("T2"){
            @Override
            public void run () {
                synchronized(T4.class){
                    try {
                        p.print2 ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        }.start ();
        new Thread ("T3"){
            @Override
            public void run () {
                synchronized(T4.class){
                    try {
                        p.print3 ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            }
        }.start ();

    }


}


class Printer {
    int flag = 1;

    public void print1 () throws InterruptedException {
        while (flag != 1){
            T4.class.wait ();
        }
        System.out.println (Thread.currentThread ().getName () + "线程执行");
        flag = 2;
        T4.class.notify ();
    }

    public void print2 () throws InterruptedException {
        while (flag != 2){
            T4.class.wait ();
        }
        System.out.println (Thread.currentThread ().getName () + "线程执行");
        flag = 3;
        T4.class.notify ();
    }

    public void print3 () throws InterruptedException {
        while (flag != 3){
            T4.class.wait ();
        }
        System.out.println (Thread.currentThread ().getName () + "线程执行");
        flag = 0;
        T4.class.notify ();
    }
}