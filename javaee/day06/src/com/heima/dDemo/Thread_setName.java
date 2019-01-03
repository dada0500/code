package com.heima.dDemo;


public class Thread_setName {
    public static void main (String[] args) {
        //第 条线程
        new Thread("线程A"){
            @Override
            public void run () {
                for (int i = 0; i < 100; i++) {
                    System.out.println (getName () + "..........");
                }
            }
        }.start ();


        //第 条线程
        MyThread mt = new MyThread ("线程B");
        mt.start();
    }
}


class MyThread extends Thread {
    public MyThread(){}
    public MyThread (String name) {
        super(name);
    }

    @Override
    public void run () {
        for (int i = 0; i < 200; i++) {
            System.out.println (getName () + "====================");
        }
    }
}
