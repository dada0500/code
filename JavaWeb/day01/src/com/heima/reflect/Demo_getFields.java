package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo_getFields {
    public static void main (String[] args) throws Exception {
//        Class personClass=Student.class;
        Class personClass=ttt.class;
        Field[]  fields=personClass.getFields();
        for (Field field : fields) {//iter
            System.out.println("getFileds(): "+field);
        }
//
        Field field=personClass.getField("name");
        System.out.println("getField(): "+field);

        Object o = field.get (personClass);
        System.out.println(o);
        System.out.println("=====================================================");


        Field a=personClass.getField("name");
//        Constructor declaredConstructor = personClass.getDeclaredConstructor ();
//        declaredConstructor.setAccessible (true);
//        Object p = declaredConstructor.newInstance ();
//        Student p=new Student();
//        Object value=a.get(p);
//        System.out.println(p);
//        a.set(p,1);
//        System.out.println(p);


        System.out.println("=====================================================");

        Field[] fiels2=personClass.getDeclaredFields();
        for (Field field2 : fiels2) {
            System.out.println("getDeclaredFields(): "+field2);
        }

        Field field3=personClass.getDeclaredField("name");
        System.out.println("getDeclaredField(): "+field3);

        System.out.println("=====================================================");

        System.out.println (field3.getName ());
        System.out.println (field3.getType ());
    }
}
