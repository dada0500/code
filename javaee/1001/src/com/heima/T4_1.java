package com.heima;
/*
4.	描述：（代码实现）
        现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
*/


public class T4_1 {
    public static void main (String[] args) throws InterruptedException {

        Prin p = new Prin ();

        new Thread (() -> {
            try {
                p.print1();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        },"T1").start ();

        new Thread (() -> {
            try {
                p.print2();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        },"T2").start ();

        new Thread (() -> {
            try {
                p.print3();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        },"T3").start ();


    }





}
class Prin{

    int flag = 1;

    public void print1 () throws InterruptedException {
        synchronized (T4.class){
            while (flag != 1){
                T4.class.wait ();
            }
            System.out.println (Thread.currentThread ().getName () + "线程执行");
            flag = 2;
            T4.class.notifyAll ();
        }
    }

    public void print2 () throws InterruptedException {
        synchronized (T4.class){
            while (flag != 2){
                T4.class.wait ();
            }
            System.out.println (Thread.currentThread ().getName () + "线程执行");
            flag = 3;
            T4.class.notifyAll ();
        }

    }

    public void print3 () throws InterruptedException {
        synchronized (T4.class){
            while (flag != 3){
                T4.class.wait ();
            }
            System.out.println (Thread.currentThread ().getName () + "线程执行");
            flag = 0;
            T4.class.notifyAll ();
        }
    }
}