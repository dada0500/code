package com.heima.zuoye;
/*
	练习六：多线程
        问题：
        请在指定位置插入代码实现打印输出1-99。
public class Test06 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
        new Test06().method();
    }
    public void method() {
//请在此处插入代码，实现功能
        Thread t = new Thread( a );
        t.start();
    }
}
*/


public class T6 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
        new T6().method();
    }
    public void method() {
//请在此处插入代码，实现功能
/*        Runnable a = new Runnable () {
            @Override
            public void run () {
                for (int i = 1; i <= 99; i++) {
                    System.out.println (i);
                }
            }
        };*/

        Runnable a = () -> {
            for (int i = start; i <= end; i++) {
                System.out.println (i);
            }
        };

        Thread t = new Thread( a );
        t.start();
    }
}
