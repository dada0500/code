package com.heima.zuoye;
/*
	练习六：多线程练习
        问题：
        编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线
        程执行”
*/

public class T6 {
    public static void main (String[] args) {

        new Thread (){
            @Override
            public void run () {
                for (int i = 0; i < 100; i++) {
                    System.out.println ("子线程执行");
                }
            }
        }.start ();

        for (int i = 0; i < 100; i++) {
            System.out.println ("主线程执行");
        }
    }
}
