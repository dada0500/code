package com.heima.zuoye;

import com.heima.zuoye.lei.Student;

import java.util.ArrayList;

public class T12 {
    public static void main (String[] args) {
       Integer[] a = {1,3,5};
       method(a);
    }

    private static <E> void method (E[] a) {
        for (int i = 0; i < a.length / 2; i++) {

        }
    }

    public static <E> void reverse(E e1, E e2){

    }
//    public static void reverse(? e1, ? e2){
//
//    }

    ArrayList<? super Student> list = new ArrayList<Object> ();
}
