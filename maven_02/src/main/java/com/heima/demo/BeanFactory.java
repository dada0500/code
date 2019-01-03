package com.heima.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    public static Object getBean(String name){
        try {
            // 加载配置文件
            InputStream is = BeanFactory.class.getClassLoader ().getResourceAsStream ("factory.properties");
            Properties pro = new Properties ();
            pro.load (is);
            // 根据配置文件中的全类名使用反射创建对象
            String className = pro.getProperty (name);
            Class<?> clazz = Class.forName (className);
            Object obj = clazz.newInstance ();
            return obj;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }

    public static void main (String[] args) {

    }
}
