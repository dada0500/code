package com.heima.zuoye;

import java.util.Arrays;

public class T11 {
   /* 练习十一：泛型方法
    十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
*/

    public static void main (String[] args) {
        Integer[] intArr = {1,3,5};
        String[]  strArr = {"aa","bb","cc"};
        Character[] chArr = {'a','b','c'};

        new T11 ().reverArr (intArr,0,2);
        new T11 ().reverArr (strArr,0,2);
        new T11 ().reverArr (chArr,0,2);
        System.out.println (Arrays.toString (intArr));
        System.out.println (Arrays.toString (strArr));
        System.out.println (Arrays.toString (chArr));
    }

    public static <E> void reverArr(E[] arr,int a,int b){
        E temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
