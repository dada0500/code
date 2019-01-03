package com.heima.test;

import com.heima.zuoye.lei.Student;

public class Hashtest {
    public static void main (String[] args) {
        Student s1 = new Student ("张三",18,"男");
        Student s2 = new Student ("张三",18,"男");
        Student s3 = new Student ();
        Student s4 = new Student ();

        System.out.println (s1.hashCode ());
        System.out.println (s2.hashCode ());

        System.out.println (s1 == s2);

        System.out.println (s3.hashCode ());
        System.out.println (s4.hashCode ());

        System.out.println (s3 == s4);

        new Hashtest ().method(1);
        new Hashtest ().method(1,3);
        new Hashtest ().method(1,3,5);
    }

    public void method(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println ("和：" + sum);
    }
}
