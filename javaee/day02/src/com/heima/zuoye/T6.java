package com.heima.zuoye;

import java.util.ArrayList;

public class T6 {
    public static void main (String[] args) {
        /*练习六：Collection集合isEmpty()方法的使用
        六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/

        ArrayList<String> c = new ArrayList ();
        c.add ("1");
        c.clear ();
        listTest (c);

    }

    public static void listTest(ArrayList<String> al){
        System.out.println (al.isEmpty ());
    }
}
