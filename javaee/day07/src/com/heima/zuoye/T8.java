package com.heima.zuoye;
/*
	练习八：线程池练习
        问题：
        使用线程池创建多线程。模拟同学找老师学习Java。
        1.	创建线程池对象，包含2个线程。从线程池中获取线程对象，然后调用MyRunnable中的run()。
        2.	在MyRunnable实现类中，首先在控制台打印需求，“我需要一个老师”。模拟需要2秒钟时间老师可以过来指导学生，并在控制台打印老师的姓名。最后，在控制台打印“教我java,教完后，老师回到了办公室”；
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class T8 {
    public static void main (String[] args) {
        //创建Runnable实例对象
        MyRunnableImpl r = new MyRunnableImpl ();
        //创建线程池对象，包含2个线程对象
        ExecutorService service = Executors.newFixedThreadPool (2);
        service.submit (r);
        service.submit (r);
        service.submit (r);
    }
}

class MyRunnableImpl implements Runnable{
int i = 1;
    @Override
    public void run () {
        Thread.currentThread ().setName ("线程"+ i++);
        System.out.println ("我需要一个老师");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("老师的姓名：" + Thread.currentThread().getName ());
        System.out.println ("教我java,教完后，老师回到了办公室");
    }
}
