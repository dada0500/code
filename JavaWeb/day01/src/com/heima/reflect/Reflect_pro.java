package com.heima.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflect_pro {
    public static void main (String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Properties pro = new Properties ();
        Class<?> class1 = Class.forName ("com.heima.reflect.Student");
        Class<Student> class2 = Student.class;

        Student stu = new Student ("张三",18);
        Class<? extends Student> class3 = stu.getClass ();


        //通过类加载器加载配置文件
        InputStream is = Reflect_pro.class.getClassLoader ().getResourceAsStream ("pro.properties");

        pro.load (is);
        System.out.println (pro);

        //获取 全类名className,methodName
        String className = pro.getProperty ("className");
        String methodName = pro.getProperty ("methodName");

        //根据className获取 字节码对象
        Class clazz = Class.forName (className);
        //根据methodName用字节码对象获取方法
        Method method = clazz.getDeclaredMethod (methodName);
        method.setAccessible (true);
        //根据字节码对象 创建 对象，并调用方法

        Constructor declaredConstructor = clazz.getDeclaredConstructor ();
        declaredConstructor.setAccessible (true);
        method.invoke (declaredConstructor.newInstance ());
//        Object invoke = method.invoke (clazz.newInstance ());

//        method.invoke (o);

    }
}
