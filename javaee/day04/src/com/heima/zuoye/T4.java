package com.heima.zuoye;

/*
练习四：Map接口中的方法
        四、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
//tips: 参阅Map接口中values()方法
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T4 {
    public static void main (String[] args) {
        Map<String,Integer> map = new HashMap<> ();
        map.put ("张三",18);
        map.put ("李四",17);
        map.put ("王五",16);
        map.put ("赵六",15);
        map.put ("赵六",16);


        for (Integer value : map.values ()) {
            System.out.print (value + "  ");
        }

        System.out.println ("\r\n----------------");
        // 获取 map 中 值 的集合
        Collection<Integer> values = map.values ();
        // 获取 values集合的迭代器
        Iterator<Integer> it = values.iterator ();
        //使用迭代器遍历values
        while (it.hasNext ()){
            System.out.print(it.next () + "  ");
        }
    }
}
