package com.heima.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Properties;

public class reflact {

    /*  需求: 写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法

* 实现：
    1. 配置文件
    2. 反射
* 步骤：
    1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
    2. 在程序中加载读取配置文件
    3. 使用反射技术来加载类文件进内存
    4. 创建对象
    5. 执行方法
    */
    public static void main (String[] args) {
//        new BufferedReader (new FileReader ("jdbc01\\reflact.properties"))
  /*      Emp emp = new Emp();
        emp.setEname ("小肚子");
        System.out.println (emp.getEname ());*/
        try {
            Properties pro = new Properties ();
            pro.load (new FileReader ("jdbc01\\src\\reflact.properties"));
            String className = pro.getProperty ("className");
            String methodName = pro.getProperty ("methodName");
            Class clazz = Class.forName (className);

            Constructor claCon = clazz.getDeclaredConstructor ();
            claCon.setAccessible (false);
            Object o1 = claCon.newInstance ();

//            Method setEname = clazz.getDeclaredMethod ("setEname");
//            setEname.setAccessible (false);
//            Object seto = setEname.invoke (o1, "胖大海");
//            System.out.println ("set:" + seto);

            Method dms = clazz.getDeclaredMethod (methodName,int.class,int.class);
            dms.setAccessible (true);
//            Object o = clazz.newInstance ();
//            Object getResult = dms.invoke (o1);
//            Object getResult = dms.invoke (o1, "磊");
//            System.out.println ("get:" + getResult);
            dms.invoke (o1, 3,5);

            Class<?>[] parameterTypes = dms.getParameterTypes ();
            System.out.println (dms.getParameterTypes ());
            System.out.println ("--------for-----parameterType------");
            for (Class<?> parameterType : parameterTypes) {
                System.out.println (parameterType);
            }
            System.out.println ("--------for----parameterAnnotations-------");
            Annotation[][] parameterAnnotations = dms.getParameterAnnotations ();
            System.out.println (parameterAnnotations);
            for (Annotation[] parameterAnnotation : parameterAnnotations) {
                for (Annotation annotation : parameterAnnotation) {
                    System.out.println (annotation);
                }
            }

            System.out.println (dms.getParameterCount ());
            TypeVariable<Method>[] typeParameters = dms.getTypeParameters ();
            System.out.println (typeParameters);
            for (TypeVariable<Method> typeParameter : typeParameters) {
                System.out.println (typeParameter);
                System.out.println (typeParameter.getName ());
            }

            Field ename = clazz.getDeclaredField ("ename");
            ename.setAccessible(true);
            System.out.println (ename);


        } catch (Exception e) {
            e.printStackTrace ();
        }
    }


}
