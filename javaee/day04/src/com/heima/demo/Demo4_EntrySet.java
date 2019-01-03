package com.heima.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4_EntrySet {
    public static void main (String[] args) {
        HashMap<String,String> hm = new HashMap<> ();
        hm.put ("张三","北京");
        hm.put ("李四","上海");
        hm.put ("王五","广州");
        hm.put ("赵六","深圳");

        // 1. 获取集合当中，【所有】的键值对对象。
        Set<Map.Entry<String,String>> entrySet = hm.entrySet();
        // 2. 遍历set集合，获取到【每一个】Entry对象
        for (Map.Entry<String,String> en : entrySet){
            // 3. 使用【每一个】Entry对象，分别调用getKey()  getValue()
            System.out.println (en.getKey () + "..." + en.getValue ());
        }

        System.out.println ("---------------------");

        for ( Map.Entry<String,String> en : hm.entrySet ()){
            System.out.println (en.getKey () + "..." + en.getValue ());
        }
    }
}
