/*
package com.heima.zuoye;
*/
/*
	练习九：多线程练习
        问题：
        请按要求编写多线程应用程序，模拟多个人通过一个山洞：
        1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
        2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
*//*


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class T9 {
    public static void main (String[] args) {
        List<String> nameList = List.of ("老大", "老二", "老三", "老四", "老五", "老六", "老七", "老八", "老九", "小十");
//        Collections.shuffle (nameList);
        ThroughCave tc = new ThroughCave ();
//
//        Random r = new Random ();
        for (int i = 0; i < 10; i++) {
            tc.setP (new Person ( nameList.get(i) , i + 1) );
            new Thread (tc).start ();
        }
    }
}

class ThroughCave implements Runnable {
    private Person p;
    private int count = 0;

    public ThroughCave () {
    }

    public ThroughCave (Person p, int count) {
        this.p = p;
        this.count = count;
    }

    public Person getP () {
        return p;
    }

    public void setP (Person p) {
        this.p = p;
    }

    public int getCount () {
        return count;
    }

    public void setCount (int count) {
        this.count = count;
    }

    @Override
    public void run () {
        System.out.println ("第" + p.getId () + "个人，姓名：" + p.getName () + " 开始过山洞");
        synchronized (ThroughCave.class) {
            try {
//                throughCave.class.wait (5000);
                Thread.sleep (5000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println ("第" + p.getId () + "个人，姓名：" + p.getName () + " 第" + (++count) + "个过去山洞了");
        }
    }
}


class Person {
    private String name;
    private int id;

    public Person (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person () {
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
*/
