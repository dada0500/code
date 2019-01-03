package com.heima.zuoye;

/*
练习三：Map接口中的常用方法
        一、请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
*/


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T3 {
    public static void main (String[] args) {
        Map<String,Integer> map = new HashMap<> ();
        map.put ("张三",18);
        map.put ("李四",17);
        map.put ("王五",16);
        map.put ("赵六",15);
        map.put ("赵六",16);

        map.remove ("张三");
        System.out.println (map);

        map.remove ("李四",24);
        System.out.println (map);
        map.remove ("李四",17);
        System.out.println (map);

        map.replace ("赵六",26);
        System.out.println (map);
        map.replace ("赵六",16,19);
        System.out.println (map);


        Collection<Integer> values = map.values ();
        System.out.println (values);

        Set<String> key = map.keySet ();
        for (String s : key) {
            System.out.println (s + " : " + map.get(s) );
        }
    }

}
