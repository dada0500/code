package com.heima.Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorsE {
    public static void main (String[] args) {
        // 1. 获取线程池对象，指定线程数量
        //当前这下是对象，但是中没有任务。
        ExecutorService service = Executors.newFixedThreadPool(2);

        // 2. 设置线程任务 1（submit:提交）
        service.submit (new Runnable () {
            @Override
            public void run () {
                System.out.println ("----" + Thread.currentThread().getName() + "，正在执行线程任务1");
            }
        });
        // 2. 设置线程任务 2（submit:提交）
        service.submit (new Runnable () {
            @Override
            public void run () {
                System.out.println ("----" + Thread.currentThread().getName() + "，正在执行线程任务2");
            }
        });
        // 2. 设置线程任务 3（submit:提交）
        service.submit (new Runnable () {
            @Override
            public void run () {
                System.out.println ("----" + Thread.currentThread().getName() + "，正在执行线程任务3");
            }
        });

        service.shutdown();
//        service.shutdownNow ();
    }
}
