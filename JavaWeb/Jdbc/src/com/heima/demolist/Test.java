package com.heima.demolist;

import java.util.function.Supplier;

public class Test {
    /*
         使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
     */
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 66, 55};

        int result = getMax(() -> {
            int max = arr[0];

            for (int num : arr) {
                if (max < num) {
                    max = num;
                }
            }

            return max;
        });


        System.out.println(result);

    }

    public static int getMax(Supplier<Integer> s) {
        return s.get();
    }
}