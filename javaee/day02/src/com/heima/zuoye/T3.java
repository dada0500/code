package com.heima.zuoye;

/*
练习三：Collection集合数组转集合
        三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。

*/

import java.util.ArrayList;
import java.util.Collection;

public class T3 {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};

        Collection<Integer> integers = arrayToCollection (arr);

        System.out.println (integers);
    }

    public static Collection<Integer> arrayToCollection(int[] arr){
        Collection<Integer> c = new ArrayList<> ();
        for (int i : arr) {
            c.add (i);
        }
        return c;
    }
}
