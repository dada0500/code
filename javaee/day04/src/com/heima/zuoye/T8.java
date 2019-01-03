package com.heima.zuoye;

import java.util.*;

public class T8 {
    public static void main (String[] args) {
       /* 练习八：Map集合的使用（三）
        八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/

       //定义一个泛型为ng类型的List集合
        List<String> list = new ArrayList<> ();
        list.add ("abc");
        list.add ("bcd");

        //统计该集合中每个字符（注意，不是字符串）出现的次数
        //定义HashMap,【键】为【字符】,【值】为字符出现的【次数】
        HashMap<Character,Integer> map = new HashMap<> ();
        for (String s : list) {
            for (char c : s.toCharArray ()) {
                if(map.containsKey (c)){
                    map.put ( c , map.get (c) + 1 );
                }else {
                    map.put (c , 1);
                }
            }
        }

        System.out.println (map);
        //遍历Map，输出结果
        Iterator<Map.Entry<Character,Integer>> it = map.entrySet ().iterator ();
        while (it.hasNext ()){
            Map.Entry<Character, Integer> en = it.next ();
            System.out.print (en.getKey () + " = " + en.getValue ());
            if(it.hasNext ()){
                System.out.print(",");
            }
        }
    }
}
