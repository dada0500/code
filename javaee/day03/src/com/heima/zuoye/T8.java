package com.heima.zuoye;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class T8 {

/*
    练习八：LinkedHashSet基本使用
    八、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。使用迭代器和增强for循环遍历LinkedHashSet。
*/


    public static void main (String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet <>();

        Collections.addAll (lhs,"王昭君","王昭君","西施","杨玉环","貂蝉");

        Iterator<String> i = lhs.iterator ();
        while (i.hasNext ()){
            System.out.print (i.next () + " - ");
        }

        System.out.println ("\r\n--------------");

        for (String s : lhs) {
            System.out.print (s + " _ ");
        }
    }
}
