package com.heima.zuoye;
/*
练习八:IO对象Properties结合使用,设置properties文件
        描述:
        我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
        请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
        score.txt文件内容如下：
zhangsan = 90
lisi = 80
wangwu = 85

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class T8 {
    public static void main (String[] args) throws IOException {
        Properties ps = new Properties ();
        ps.load (new FileInputStream ("day09/score.txt"));
        System.out.println (ps);
        System.out.println ("------");
        Set<String> strings = ps.stringPropertyNames ();
        for (String string : strings) {
            if("lisi".equals (string)){
                ps.setProperty (string,"100");
            }
            String value = ps.getProperty (string);
            System.out.println (string + " = " + value);
        }

//        ps.store (new FileOutputStream ("day09/score.txt"),"注释中文乱码");
//        ps.store (new FileWriter ("day09/score.txt"),"注释中文乱码");

    }
}
