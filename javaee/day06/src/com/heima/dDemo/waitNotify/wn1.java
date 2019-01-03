package com.heima.dDemo.waitNotify;

public class wn1 {
    public static void main (String[] args) {
        Baozi bz = new Baozi ("白面","肉",true);

        //店家
        new Thread (new Runnable () {
            @Override
            public void run () {
                while (true){
                    synchronized(bz){
                        if(bz.isFlag () == true){
                            try {
                                System.out.println ("有包子，暂停生产。。。");
                                bz.wait ();
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                        }else {
                            System.out.println ("包子铺开始生产包子");
                            try {
                                Thread.sleep (3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                            bz.setFlag (true);
                            bz.notify ();
                        }
                    }
                }
            }
        }).start ();

        //吃货
        new Thread (new Runnable () {
            @Override
            public void run () {
                while (true){
                    synchronized(bz){
                        if(bz.isFlag () == false){
                            try {
                                System.out.println ("没包子，吃货等待。。。");
                                bz.wait ();
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                        }else {
                            System.out.println ("吃货开始吃包子，吃完。");
                            try {
                                Thread.sleep (3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                            System.out.println ("吃货吃完。");
                            bz.setFlag (false);
                            bz.notify ();
                        }
                    }
                }
            }
        }).start ();
    }
}

class Baozi{
    private String pi;
    private String xian;
    private boolean flag;

    public Baozi () {
    }

    public Baozi (String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi () {
        return pi;
    }

    public void setPi (String pi) {
        this.pi = pi;
    }

    public String getXian () {
        return xian;
    }

    public void setXian (String xian) {
        this.xian = xian;
    }

    public boolean isFlag () {
        return flag;
    }

    public void setFlag (boolean flag) {
        this.flag = flag;
    }
}