package com.heima.zuoye;

//练习九：Supplier接口使用

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;
public class T9 {

    //1.	给出测试类中代码如下：
    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        //2.	分别使用lambda表达式获得以下对象：
        //a)	长度为5的String数组
        String[] getS = getObj (() -> new String[5]);

        //b)	包含5个1-20(含1和20)之间随机数的HashSet<Integer>集合
        HashSet<Integer> getHs = getObj (() -> {
            HashSet<Integer> hs = new HashSet<> ();

            Random r = new Random ();
            while (hs.size () < 5){
                    hs.add (r.nextInt (20) + 1);
            }

            return hs;
        });

        //c)	一个代表2018年4月1日的Calendar对象*/
        Calendar getC = getObj (new Supplier<Calendar> () {
            @Override
            public Calendar get () {

                Calendar calendar = Calendar.getInstance ();
                calendar.set (2018, 3, 1);
                return calendar;

            }
        });


        System.out.println (getS);
        System.out.println (getHs);
        System.out.println (getC.getTime ());
    }
}



