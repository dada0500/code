package work.Thread;

public class Thread01 {
    private static int flag = 1;
    public static void main (String[] args) {
        Object lock = new Object ();
        new Thread (()->{
            synchronized (lock){
                for (int i = 0; i < 300; i++) {
                    if(flag != 1){
                        try {
                            lock.wait ();
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }else{

                        System.out.print(Thread.currentThread ().getName () + ":");
                        System.out.print ("传");
                        System.out.print ("智");
                        System.out.print ("播");
                        System.out.print ("客");
                        System.out.println();
                        flag = 2;
                        lock.notifyAll ();
                    }
                }
                System.out.println (Thread.currentThread ().getName () + ": -----结束");
            }
        },"线程1").start ();

        new Thread (()->{
            synchronized (lock){
                for (int i = 0; i < 300; i++) {
                    if(flag != 2){
                        try {
                            lock.wait ();
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }else{

                        System.out.print(Thread.currentThread ().getName () + ":");
                        System.out.print ("黑");
                        System.out.print ("马");
                        System.out.print ("程");
                        System.out.print ("序");
                        System.out.print ("员");
                        System.out.println();
                        flag = 3;
                        lock.notifyAll ();
                    }
                }
                System.out.println (Thread.currentThread ().getName () + ": -----结束");
            }
        },"线程2").start ();

        new Thread (()->{
            synchronized (lock){
                for (int i = 0; i < 300; i++) {
                    if(flag != 3){
                        try {
                            lock.wait ();
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }else{

                        System.out.print(Thread.currentThread ().getName () + ":");
                        System.out.print("I");
                        System.out.print("T");
                        System.out.print("C");
                        System.out.print("A");
                        System.out.print("S");
                        System.out.print("T");
                        System.out.println();
                        flag = 1;
                        lock.notifyAll ();
                    }
                }
                System.out.println (Thread.currentThread ().getName () + ": -----结束");
            }
        },"线程3").start ();
    }

}
