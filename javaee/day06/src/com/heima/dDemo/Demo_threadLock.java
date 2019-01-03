package com.heima.dDemo;

public class Demo_threadLock {
    public static void main (String[] args) {
//        Tickets t = new Tickets();
        new Tickets ("窗口A").start();
        new Tickets ("窗口B").start();
        new Tickets ("窗口C").start();
    }
}


// 1. 编写线程任务对象（Runnable）
class Tickets extends Thread{
    // 2. 在Runnable实现类当中，定义共享资源300张票
    static int tickets = 300;

    public Tickets () {
    }

    public Tickets (String name) {
        super (name);
    }

    @Override
    public void run () {
        while (true){
//            synchronized(this){
            synchronized(TicketsImpl.class){
                if(tickets <= 0 ){
                    // 票卖光了
                    break;
                }

                //买票
                System.out.println (Thread.currentThread ().getName () + "卖出第" + tickets-- + "张票");
            }
        }
    }
}
