package com.heima.zuoye;

import java.util.ArrayList;

public class T8 {
    public static void main (String[] args) {
       /* 练习八：Collection集合返回首次出现索引
        八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
*/
        ArrayList<Integer> c = new ArrayList ();
        c.add (1);
        c.add (2);
        c.add (3);
        System.out.println (listTest (c,1));
        System.out.println (listTest (c,3));
        System.out.println (listTest (c,4));

    }

    public static int listTest(ArrayList<Integer> al, Integer s){
        return al.indexOf (s);
    }
}
