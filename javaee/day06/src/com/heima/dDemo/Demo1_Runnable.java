package com.heima.dDemo;

public class Demo1_Runnable {
    public static void main (String[] args) {
        // 4. 创建线程对象（任务/资源）
        MyRunnable mr = new MyRunnable();
        // 5. 创建Thread 对象，并将线程任务mr，传入构造方法
        new Thread (mr,"线程A。。。。").start();

        //匿名内部类 创建Runnable线程
        new Thread (new Runnable () {
            @Override
            public void run () {
                for (int i = 0; i < 100; i++) {
                    System.out.println (Thread.currentThread ().getName () + "new Thread(new Runnable()){}");
                }
            }
        },"线程B===================").start ();

    }
}

// 1. 找一个类实现Runnable接口
class MyRunnable implements Runnable{

    // 2. 重写run方法
    @Override
    public void run () {
        // 3. 将要执行的代码，写在run方法当中
        for (int i = 0; i < 100; i++) {
            System.out.println (Thread.currentThread ().getName () + "MyRunnable");
        }
    }
}