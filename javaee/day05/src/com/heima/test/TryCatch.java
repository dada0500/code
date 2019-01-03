package com.heima.test;

import java.util.List;

public class TryCatch {
    public static void main (String[] args) {
        try {//ArrayIndexOutOfBoundsException: 3
            List<Integer> list = List.of (1, 2, 3);
            System.out.println (list.get (3));//IndexOutOfBoundsException: Index 3 out-of-bounds for length 3

            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println (e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println (e);
        }
    }
}