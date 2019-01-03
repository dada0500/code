package com.heima.test;

import java.util.ArrayList;

public class t {
    public static void main (String[] args) {
        ArrayList<String> list1 = new ArrayList<> ();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add ("abc");
        list2.add (123);
        print(list1);
        print(list2);



        ArrayList<Person> fu = new ArrayList<>();
        fu.add(new Person());
        ArrayList<Student> zi = new ArrayList<>();
        zi.add(new Student());

        fu.addAll(zi);      // 编译通过

//        zi.addAll(fu);      // 编译失败

//        ArrayList<? extends Person> list = new ArrayList<Object>(); //报错
    }
    public static <E> void print (ArrayList<E> list){
        System.out.println (list);
    }



}
class Person{}
class Student extends Person{}
