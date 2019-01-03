package com.heima.demo.supplier;

import java.util.function.Supplier;

public class Supplier01 {
    public static void main (String[] args) {
        int arr[] = {1,33,-3,0,9};
        int maxInArr = getMax (() -> {
            int max = arr[0];
            for (int i : arr) {
                if (max < i){
                    max = i;
                }
            }
            return max;
        });

        System.out.println ("MAX: " + maxInArr);
    }
    public static int getMax(Supplier<Integer> sup){
        return sup.get ();
    }
}
