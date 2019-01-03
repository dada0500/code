package com.heima.zuoye;
//练习八：数组构造器引用

/*
    1.	定义一个函数式接口ArrayBuilder<T>,提供带泛型的抽象方法T[] buildArray(int length)，使用注解@FunctionalInterface
    2.	在测试类中定义static void getIntegerArray(int length , ArrayBuilder<Integer> builder), 该方法的预期行为是使用builder创建一个长度为length的Integer数组并打印其内存地址
    3.	测试getIntegerArray (),使用方法引用完成需求
*/

import java.util.Arrays;

public class T8 {
    public static void main (String[] args) {
        getIntegerArray (5, Integer[]::new);
    }

    // 2.	在测试类中定义
    static void getIntegerArray(int length , ArrayBuilder<Integer> builder){
        Integer[] integers = builder.buildArray (length);
        System.out.println (integers);
        System.out.println (Arrays.toString (integers));
    }
}


//1.	定义一个函数式接口ArrayBuilder<T>
@FunctionalInterface
interface  ArrayBuilder<T>{
    T[] buildArray(int length);
}




