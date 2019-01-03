package com.heima.test;

import java.text.ParseException;
import java.util.Objects;

public class T_throw {
    public static void main (String[] args) {
//        int[] arr = {1,2,3};
//        int[] arr = {};
        int[] arr = new int[0];
//        int[] arr =null;
        method(arr,0);
    };

    private static void method (int[] arr,int i) {
        Objects.requireNonNull (arr);
        if( i >= arr.length){
            try {
                throw new Exception ("s");
//                System.out.println ("fe");
            } catch (Exception e) {
                e.printStackTrace ();
                return;
            }finally {
                System.out.println ("return finally");
            }
        }
        System.out.println (arr[i]);

    }


}
