package com.heima;
/*
3.	描述：（代码实现）
        编程实现以下数据：
        "yureban" -> "01" "zhangsan"
        "yureban" -> "02" "lisi"
        "jiuyeban" -> "01" "wangwu"
        "jiuyeban" -> "02" "zhaoliu"
        注意一个键对应一个值，所以根据上面的例子，应该想到这个“值”本身也要是一个集合来存储具有映射关系的多对值。
*/

import java.util.HashMap;
import java.util.LinkedHashMap;

public class T3 {
    public static void main (String[] args) {

//        HashMap<String,String> hm01 = new HashMap<String,String> ();
        HashMap<String,String> hm01 = new HashMap<> ();
//        LinkedHashMap<String,HashMap<String,String>> hm0 = new LinkedHashMap<String,HashMap<String,String>> ();
        LinkedHashMap<String,HashMap<String,String>> hm0 = new LinkedHashMap<> ();

        hm01.put ("01","zhangsan");
//        hm0.put("yureban",hm01);
        hm01.put ("02","lisi");
        hm0.put("yureban",hm01);
        hm01.put ("01","wangwu");
//        hm0.put("jiuyeban",hm01);
        hm01.put ("02","zhaoliu");
        hm0.put("jiuyeban",hm01);

                
//        System.out.println (hm0);

        for (String hm0key : hm0.keySet ()) {
//            System.out.println (hm0key + " -> " + hm0.get (hm0key));
            for (String hm01key : hm0.get (hm0key).keySet ()) {
                System.out.println (hm0key + " -> " + hm01key + " " + hm0.get (hm0key).get (hm01key));
            }
        }
    }
}