package com.heima.reflect;

import java.lang.reflect.Field;

public class Demo01_reflect {
    public static void main (String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Student s1 = new Student ("张三",18,"北京");

        Class class1 = Class.forName ("com.heima.reflect.Student");

        //获取公共的成员变量
//        Field nameFiled = class1.getField ("adress");
        //暴力获取
        Field nameFiled = class1.getDeclaredField ("adress");

        //忽略访问权限修饰符的安全检查
        nameFiled.setAccessible (true);

        //获取变量的值
        Object o = nameFiled.get (s1);
        System.out.println (o);

        //设置变量的值
        nameFiled.set (s1,"李四");
        Object o1 = nameFiled.get (s1);
        System.out.println (o1);
    }
}

