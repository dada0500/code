package com.heima.ceshi5;

import java.util.*;

/*
    八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
    例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Test1 {
    public static void main (String[] args) {
        List<String> list = List.of ("abc", "bcd");
        HashMap<Character, Integer> hm = new HashMap<> ();

        for (String s : list) {
            for (char c : s.toCharArray ()) {
                if(hm.containsKey (c)){
                    hm.put (c,hm.get (c) + 1);
                }else {
                    hm.put (c,1);
                }
            }
        }

        Set<Map.Entry<Character, Integer>> en = hm.entrySet ();

        int last = 0;

        for (Map.Entry<Character, Integer> entry : en) {
            last++;
            if(last < hm.size ()){
                System.out.print(entry.getKey () + " = " + entry.getValue () + ",");
            }else {
                System.out.print(entry.getKey () + " = " + entry.getValue ());
            }
        }
    }
}
