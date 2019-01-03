package com.heima.dDemo.wait;

public class Wait {
    public static void main (String[] args) {

    }
}

class print{
    int flag =1;

    public void print1() throws InterruptedException {
        synchronized (this){
            while ( flag != 1 ){
                this.wait ();
            }
            System.out.println ("黑");
            System.out.println ("马");
            System.out.println ("程");
            System.out.println ("序");
            System.out.println ("员");
            System.out.println ();
            flag = 2;
        }
    }
    public void print2() throws InterruptedException {
        synchronized (this){
            while ( flag != 2 ){
                this.wait ();
            }
            System.out.println ("黑");
            System.out.println ("马");
            System.out.println ("程");
            System.out.println ("序");
            System.out.println ("员");
            System.out.println ();
        }
    }
}
