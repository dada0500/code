package com.heima.ttt1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
编程实现以下数据：
    "yureban" -> "01" "zhangsan"
    "yureban" -> "02" "lisi"
    "jiuyeban" -> "01" "wangwu"
    "jiuyeban" -> "02" "zhaoliu"
  注意一个键对应一个值，所以根据上面的例子，应该想到这个“值”本身也要是一个集合来存储具有映射关系的多对值。
   HashMap是无序的
 */
public class Demo03 {

    public static void main(String[] args) {
        /*
        思路：HashMap集合的value值就是一个HashMap集合对象，接下来就是遍历，不需要多说
         */
        HashMap<String,HashMap<String,String>> hm=new HashMap<String,HashMap<String,String>>();
        HashMap<String,String> yure=new HashMap<String,String>();
        HashMap<String,String> jiuye=new HashMap<String,String>();
        yure.put("01","zhangsan");
        yure.put("02","lisi");
        jiuye.put("01","wangwu");
        jiuye.put("02","zhaoliu");
        hm.put("yure",yure);
        hm.put("jiuye",jiuye);

        //printAll(hm);

        printAll1(hm);
    }

    private static void printAll1(HashMap<String, HashMap<String, String>> hm) {

        Set<String> set = hm.keySet();
        for (String key1 : set) {
            HashMap<String, String> values = hm.get(key1);
            Set<String> set1 = values.keySet();
            for (String key : set1) {
                String value = values.get(key);
                System.out.println(key1+"--->"+key+":"+value);
            }
        }
    }

    private static void printAll(HashMap<String,HashMap<String,String>> hm) {

        Set<Map.Entry<String, HashMap<String, String>>> set = hm.entrySet();

        Iterator<Map.Entry<String, HashMap<String, String>>> iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, HashMap<String, String>> next = iterator.next();

            String key = next.getKey();

            HashMap<String, String> map = next.getValue();

            Set<Map.Entry<String, String>> entrySet = map.entrySet();

            Iterator<Map.Entry<String, String>> iterator1 = entrySet.iterator();
            while (iterator1.hasNext()) {
                Map.Entry<String, String> next1 = iterator1.next();
                String sub_key = next1.getKey();
                String sub_value = next1.getValue();

                System.out.println(key+"--->"+sub_key+":"+sub_value);
            }

        }
    }

}
