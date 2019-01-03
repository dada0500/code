package com.heima.test;

import java.util.ArrayList;

public class StrTest extends Object{
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.remove (Integer.valueOf (111));

        System.out.println (list);

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println (s1.hashCode ());
        System.out.println (s2.hashCode ());

        System.out.println (s1==s2);
    }

}
