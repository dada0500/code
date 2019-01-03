package work.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread011 {

    public static void main (String[] args) {
//        Object lock = new Object ();
        p3 p3 = new p3();
  /*      new Thread (p3.run1 (),"线程1").start ();
        new Thread (p3.run2 (),"线程2").start ();
        new Thread (p3.run3 (),"线程3").start ();*/

        ExecutorService service = Executors.newFixedThreadPool (3);
        service.submit (p3.run1 ());
        service.submit (p3.run2 ());
        service.submit (p3.run3 ());
        service.shutdown ();
//
    }



}


class p3{
    private static int flag = 1;
    public static Runnable run3 () {
        return ()->{
                try {
                    synchronized (Thread011.class){
                        for (int k = 0; k < 300; k++) {
                        while(flag != 3){
                            Thread011.class.wait ();

                        }

                            System.out.print(Thread.currentThread ().getName () + ":" + k + ":");
                            System.out.print("I");
                            System.out.print("T");
                            System.out.print("C");
                            System.out.print("A");
                            System.out.print("S");
                            System.out.print("T");
                            System.out.println();
                            flag = 1;
                            Thread011.class.notifyAll ();
                        }
                    }
                    System.out.println (Thread.currentThread ().getName () + ": -----结束");
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
        };
    }

    public static Runnable run2 () {
        return ()->{
                try {
                    synchronized (Thread011.class){
                        for (int j = 0; j < 300; j++) {
                        while(flag != 2){
                            Thread011.class.wait ();

                        }

                            System.out.print(Thread.currentThread ().getName () + ":" + j + ":");
                            System.out.print ("黑");
                            System.out.print ("马");
                            System.out.print ("程");
                            System.out.print ("序");
                            System.out.print ("员");
                            System.out.println();
                            flag = 3;
                            Thread011.class.notifyAll ();
                        }
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            System.out.println (Thread.currentThread ().getName () + ": -----结束");
        };
    }

    public static Runnable run1 () {
        return ()->{
                try {
                    synchronized (Thread011.class){

                        for (int i = 0; i < 300; i++) {
                        while(flag != 1){
                            Thread011.class.wait ();
                        }

                            System.out.print(Thread.currentThread ().getName () + ":" + i + ":");
                            System.out.print ("传");
                            System.out.print ("智");
                            System.out.print ("播");
                            System.out.print ("客");
                            System.out.println();
                            flag = 2;
                            Thread011.class.notifyAll ();

                        }
                    }
                    System.out.println (Thread.currentThread ().getName () + ": -----结束");
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
        };
    }
}