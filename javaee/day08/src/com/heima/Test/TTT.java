package com.heima.Test;

import java.io.File;

public class TTT {
    public static void main (String[] args) {
        File file = new File ("d:/wfefa.txt");
//        File file = new File ("C:/MSOCache");
        System.out.println (file.isFile ());
            System.out.println (file.getAbsolutePath ());
            System.out.println (file.getAbsoluteFile ());
        System.out.println ("--------");
        printJavaFile (file);
    }
    public static void printJavaFile(File dir){
        // 1. 获取文件夹下所有的文件和文件夹对象
        File[] files = dir.listFiles ();
        System.out.println (files);
        // 2. 遍历数组, 获取每一个文件和文件夹对象
        for (File file : files) {
            // 3. 判断当前对象是否是文件, 并且后缀名是.java
            if(file.isFile() && file.getName().toLowerCase().endsWith(".java")){
                System.out.println(file);
                // 4. 如果获取到了一个文件夹
            }/*else if(file.isDirectory()){
                if(file.listFiles() != null){
                    printJavaFile(file);
                }
            }*/
        }
    }
}
