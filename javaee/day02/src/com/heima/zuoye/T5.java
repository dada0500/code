package com.heima.zuoye;


//练习五：Collection集合contains()方法使用
//        五、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。


import java.util.ArrayList;
import java.util.Collection;

public class T5 {
    public static void main (String[] args) {
        ArrayList<String> c = new ArrayList ();
        c.add ("1");
        c.add ("2");
        c.add ("3");
        listTest (c,"1");
    }

    public static void listTest(ArrayList<String> al, String s){
        System.out.println (al.contains (s));
    }
}
