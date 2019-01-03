package com.heima.ceshi5;
/*
    需求 : 3个窗口同时售票300张.
 */
public class Test2 {
    public static void main (String[] args) {
        Ticket ticket = new Ticket ();
        new Thread (ticket,"窗口1").start ();
        new Thread (ticket,"窗口2").start ();
        new Thread (ticket,"窗口3").start ();
    }


}

class Ticket implements Runnable{
//    int ticket = 300;

    int flag = 1;
    @Override
    public void run () {
//        int ticket = 300;
    int ticket=0;
    int stop=0;
//synchronized (Ticket.class){
    if(flag == 1){
        ticket = 300;
        stop = 0;
        flag++;
    }else if(flag == 2){
        ticket = 900;
        stop = 600;
        flag++;
    }else{
        ticket = 1300;
        stop = 1000;
    }
//}

//        synchronized (Ticket.class){

            while (true){
                if(ticket > stop) {
//                if(ticket > 0) {
                    System.out.println (Thread.currentThread ().getName () + "卖出第" + (ticket--) + "张票");

                    try {
                        Thread.sleep (10);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }

                }else {

                    break;
                }
//            }
        }
    }

}