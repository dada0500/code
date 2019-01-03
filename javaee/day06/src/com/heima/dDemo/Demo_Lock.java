package com.heima.dDemo;

public class Demo_Lock {
    public static void main (String[] args) {
        TicketsImpl t = new TicketsImpl ();
        new Thread (t,"窗口A").start();
        new Thread (t,"窗口B").start();
        new Thread (t,"窗口C").start();
    }
}


// 1. 编写线程任务对象（Runnable）
class TicketsImpl implements Runnable{
    // 2. 在Runnable实现类当中，定义共享资源300张票
    int tickets = 300;
    @Override
    public void run () {
        while (true){
//            synchronized(this){
            synchronized(TicketsImpl.class){
                if(tickets <= 0 ){
                    // 票卖光了
                    break;
                }

                try {
                    Thread.sleep (200);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }

                //买票
                System.out.println (Thread.currentThread ().getName () + "卖出第" + tickets-- + "张票");
            }
        }
    }
}
