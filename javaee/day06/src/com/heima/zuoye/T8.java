package com.heima.zuoye;

public class T8 {
    public static void main (String[] args) {
        new Thread (new Runnable () {
            @Override
            public void run () {
                for (int i = 0; i < 200; i++) {
                    System.out.println ("播放背景音乐");
                }
            }
        }).start ();

        for (int i = 0; i < 200; i++) {
            System.out.println ("显示画面");
        }

/*
        new Thread (){
            @Override
            public void run () {
                for (int i = 0; i < 100; i++) {
                    System.out.println ("显示画面");
                }
            }
        }.start ();

        */
    }
}
