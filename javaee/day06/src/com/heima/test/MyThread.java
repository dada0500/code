package com.heima.test;

public class MyThread extends Thread{

        public MyThread() {
        }

        public MyThread(String name){

            super(name);//把线程名称传递给父类,让父类(Thread)给子线程起一个名字
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println ("run:" + i);
            }
        }
}
