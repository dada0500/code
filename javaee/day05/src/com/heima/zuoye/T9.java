package com.heima.zuoye;

public class T9 {
    public static void main (String[] args) {
        new Thread (){
            @Override
            public void run () {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println (i + "是偶数======================");
                    }
                }
            }
        }.start ();
        for (int i = 1; i <= 10000; i++) {
            if(i % 2 != 0){
                System.out.println (i + "是奇数...............");
            }
        }

    }
}
