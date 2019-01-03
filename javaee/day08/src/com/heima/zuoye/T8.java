package com.heima.zuoye;

import java.io.File;

public class T8 {

    public static void main (String[] args) {
        File dir = new File ("D:\\test");
        File[] files = dir.listFiles ();
        System.out.println (files);
        System.out.println ("==========");

        for (File file : files) {
            System.out.println ("==========");
            System.out.println (file);
            System.out.println (file.getName());
            System.out.println ("==========");

        }
    }
}
