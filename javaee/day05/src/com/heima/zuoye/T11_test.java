package com.heima.zuoye;

public class T11_test {
    public static void main (String[] args) {


        new Thread(){
            @Override
            public void run () {

                long start1 = System.currentTimeMillis ();

                Integer a = null;
                for (int i = 0; i < 100000; i++) {
                    a = i;
                }
                System.out.println ("a = " + a);

                long end1 = System.currentTimeMillis ();
                System.out.println ("time: " + (end1 - start1));
            }
        }.start();
    }
}
