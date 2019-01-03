package com.heima.demo;

import java.util.function.Supplier;

public class Sum {
    public static void main (String[] args) {
        int[] arr = {11,22,33};

        int max = getMax(()->{
            int maxnum = arr[0];
            for(int num : arr){
                if(maxnum < num){
                    maxnum = num;
                }
            }
            return maxnum;
        });
        System.out.println (max);

    }

    private static int getMax (Supplier<Integer> supplier) {
       return supplier.get ();
    }
}

