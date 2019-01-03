package com.heima.zuoye;

import java.util.ArrayList;
import java.util.Collection;

public class T2 {
    public static void main (String[] args) {
        Collection<String> list = new ArrayList<> ();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));

    }

    public static void print(ArrayList<Object> list){

    }

    public static int listTest(Collection<String> list,String s){
        int count = 0;

        for (String s1 : list) {
            if(s.equals (s1)){
                count++;
            }
        }

        return count;
    }
}
