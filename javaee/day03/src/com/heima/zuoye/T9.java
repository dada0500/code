package com.heima.zuoye;

import java.util.ArrayList;
import java.util.Collections;

public class T9 {
    public static void main (String[] args) {
       /* 练习九：Collections工具类使用
        九、ArrayList集合中有如下内容： {33,11,77,55}，使用Collections.sort()对ArrayList集合中的数据进行排序，并打印出排序后的结果。
*/
        ArrayList<Integer> list = new ArrayList<> ();
        Collections.addAll (list,33,11,77,55);

        Collections.sort (list);
//        Collections.shuffle (list);
        System.out.println (list);
    }
}
