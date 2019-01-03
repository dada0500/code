package com.heima.zuoye;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class T7 {
   /* 练习七：List集合元素替换
    七、向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。
*/

    public static void main (String[] args) {
        List<String> link = new LinkedList<> ();
        Collections.addAll (link, "张三", "李四", "王五", "二丫", "钱六", "孙七");
        int index = link.indexOf ("二丫");
        link.set (index,"王小丫");


        System.out.println (link);

    }
}
