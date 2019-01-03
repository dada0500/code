package com.heima.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ref_stu {
    public static void main (String[] args) {

//        Emp emp = new Emp ();
//        Class clazz = emp.getClass ();


/*
        // 1. 获取要操作的字节码对象
        Class<?> clazz = Class.forName ("com.heima.demo.Emp");
        // 2. 获取构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor (); //有参需要传入 参数类型.class
        Constructor declaredConstructor2 = clazz.getDeclaredConstructor (String.class,int.class);
        declaredConstructor.setAccessible (true);
        Object obj = declaredConstructor.newInstance ("张三",23);   // 无参构造创建对象不需要传入参数，可以不获取构造方法，简写为：Class.newInstance ()
        // 3. 获取成员方法
        Method method = clazz.getDeclaredMethod ("methodName", String.class);  //有参方法，传入: 参数类型.class
        method.setAccessible (true);  // 暴力反射-擦除私有权限
        Object 返回值 = method.invoke (obj, "参数内容");
        // 4. 获取成员变量
        Field 变量 = clazz.getDeclaredField ("变量名");
        变量.setAccessible (true);  // 暴力反射-擦除私有权限
        变量.set (obj,objValue);
*/

    }

}


