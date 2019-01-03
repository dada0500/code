package com.heima.annotation.useAnnotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseMethodAnno_properties {
    public static void main (String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //获取本类的字节码对象
//        Class<UseAnno_properties> clazz1 = UseAnno_properties.class;
        Class clazz1 = UseMethodAnno_properties.class;

        //反射获取本类的方法getPro1
        Method getPro1M = clazz1.getMethod ("getPro1");
        Pro proImpl = getPro1M.getAnnotation (Pro.class);
        String n = proImpl.className ();
        String m = proImpl.methodName ();


        //解析注解
//        Pro annotation = clazz1.getAnnotation (Pro.class);
//        Annotation annotation = clazz1.getAnnotation (Pro.class);
//
//        Pro pro = (Pro)annotation;
//        String n = pro.className ();
//        String m = pro.methodName ();

        //根据全类名、方法名 执行方法
        //根据全类名获取字节码对象
        Class lastClass = Class.forName (n);

        // 创建对象
        Object o = lastClass.newInstance ();

        // 根据方法名，使用字节码对象反射获取方法
        Method method = lastClass.getMethod (m);

        //调用方法
        method.invoke (o);
//@com.heima.annotation.useAnnotation.Pro(className="com.heima.annotation.useAnnotation.Demo1", methodName="show")



    }

    @Pro (className = "com.heima.annotation.useAnnotation.Demo1",methodName = "show")
    public static void getPro1(){

    }

}
