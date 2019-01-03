package com.heima.zuoye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class T10 {
    public static void main (String[] args) {
      /*  练习十：Collection集合练习
        十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10 且不重复的数字放到一个list集合中，并打印到控制台。*/

        int[] arr = new int[10];
        Random r = new Random ();

        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt (100) + 1;
        }
        System.out.println (Arrays.toString (arr));

        ArrayList<Integer> list = new ArrayList<> ();

        for (int i : arr) {
            if(i >= 10 && !list.contains (i)){
                list.add (i);
            }
        }

        System.out.println (list);
    }
}
