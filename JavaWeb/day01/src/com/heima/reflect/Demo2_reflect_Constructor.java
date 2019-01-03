package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo2_reflect_Constructor {
    public static void main (String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class stuClass = Student.class;

        Constructor stuCon = stuClass.getConstructor (String.class, int.class, String.class);

//        Object o = stuCon.newInstance ("张三", 18, "北京");
        Student o = (Student)stuCon.newInstance ("张三", 18, "北京");

        System.out.println (o);
        o.prin ();
    }
}
