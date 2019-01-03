package com.heima.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3_KeySet {
    public static void main (String[] args) {
        HashMap<String,String> hm = new HashMap<> ();
        hm.put ("张三","北京");
        hm.put ("李四","上海");
        hm.put ("王五","广州");
        hm.put ("赵六","深圳");

        // 1. 获取集合当中所有的键
        Set<String> keySet = hm.keySet ();
        // 2. 遍历集合，获取每一个键
        for (String key : keySet) {
            String value = hm.get (key);
            System.out.println (key + "..." + value);
        }

        System.out.println ("------------------");

        //获取集合当中的键，并遍历集合，获取每一个键
        for (String key : hm.keySet ()) {
            //根据键，查找对应的值 -> get方法
            System.out.println (key + "..." + hm.get (key));
        }


        System.out.println ("==============");

        Set<Map.Entry<String, String>> entrySet = hm.entrySet ();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println ( entry.getKey () + "..." + entry.getValue ());
        }
    }
}
