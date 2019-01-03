package com.heima.zuoye;

public class T11 {
    public static void main (String[] args) {
        long start1 = System.currentTimeMillis ();
        new Thread1 ().start ();
        long end1 = System.currentTimeMillis ();
        System.out.println (end1 - start1);

        long start2 = System.currentTimeMillis ();
        new Thread2 ().start ();
        long end2 = System.currentTimeMillis ();
        System.out.println (end2 - start2);

        long start3 = System.currentTimeMillis ();
        new Thread3 ().start ();
        long end3 = System.currentTimeMillis ();
        System.out.println (end3 - start3);
    }
}

class Thread1 extends Thread{
    @Override
    public void run () {
        Integer a = null;
        for (int i = 0; i < 100000; i++) {
            a = i;
        }
        System.out.println ("a = " + a);
    }
}
class Thread2 extends Thread{
    @Override
    public void run () {
        String b = null;
        for (int i = 0; i < 100000; i++) {
            b = "黑马程序员";
        }
        System.out.println ("b = " + b);
    }
}
class Thread3 extends Thread{
    @Override
    public void run () {
        String c = null;
        for (int i = 0; i < 100000; i++) {
            c = i + "黑马程序员";
        }
        System.out.println ("c = " + c);
    }
}