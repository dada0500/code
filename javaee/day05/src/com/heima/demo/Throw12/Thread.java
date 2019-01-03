package com.heima.demo.Throw12;

 class aThread {
    public static void main (String[] args) {
        new Thread (){
            @Override
            public void run () {
                for (int i = 0; i < 200; i++) {
                    System.out.println ("bb");
                }
            }
        }.start ();
        new Thread (){
            @Override
            public void run () {
                for (int i = 0; i < 200; i++) {
                    System.out.println ("aaaaaaaaaaaaaaaaa");
                }
            }
        }.start ();
    }
}
