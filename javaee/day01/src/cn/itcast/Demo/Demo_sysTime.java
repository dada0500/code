package cn.itcast.Demo;

import static java.lang.Thread.sleep;

public class Demo_sysTime {
    public static void main (String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis ();

        for (int i = 0; i < 1000; i++) {
            System.out.println ("哈哈");
        }
        long endTime = System.currentTimeMillis ();
        System.out.println (endTime - startTime);
        sleep(2000);
        System.out.println ("---");
    }
}
