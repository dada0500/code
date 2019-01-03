package work.Thread;

public class Test3_WaitNotify {
    /*
        需求: 使用2条线程在控制台打印输出黑马程序员和传智播客

                要求一人一句

                       黑马程序员
                       传智播客
                       黑马程序员
                       传智播客
                       黑马程序员
                       传智播客
                       ...

        Object :

                wait () :  无限等待, 必须让人进行唤醒

                notify() : [随机]唤醒单个线程

                方法必须在同步当中进行使用, 而且是必须由锁对象才能调用

                ---------------------------------

                notifyAll() : 唤醒所有等待的线程
     */
    public static void main(String[] args) {

        Printer p = new Printer();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();


        new Thread (() -> {
            while (true) {
                try {
                    p.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        p.print3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}

class Printer {

    int flag = 1;

    public void print1() throws InterruptedException {

        synchronized (Printer.class) {

            while(flag != 1){
                // 如果标记不是1, 线程1就不该执行, 线程1在此等待
                Printer.class.wait();
            }

            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.println();

            flag = 2;
            // 唤醒另外一条线程
            Printer.class.notifyAll();
        }

    }

    public void print2() throws InterruptedException {

        synchronized (Printer.class) {

            while(flag != 2){
                // 如果标记不是2, 线程2就不该执行, 线程2在此等待
                Printer.class.wait();
            }

            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.println();

            flag = 3;
            Printer.class.notifyAll();
        }
    }

    public void print3() throws InterruptedException {

        synchronized (Printer.class) {

            while(flag != 3){
                // 如果标记不是3, 线程3就不该执行, 线程3在此等待
                Printer.class.wait();        // wait方法, 在哪儿等待, 就在哪儿醒来.
            }

            System.out.print("传");
            System.out.print("智");
            System.out.print("专");
            System.out.print("修");
            System.out.print("学");
            System.out.print("院");
            System.out.println();

            flag = 1;
            Printer.class.notifyAll();
        }
    }

}
