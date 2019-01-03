package com.heima.zuoye;
/*
练习四:文件过滤器的使用
        描述:
        获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
*/

import com.heima.FileUtils.FileUtils;

import java.io.File;
import java.io.FileFilter;

public class Test4 {
    public static void main (String[] args) {
        File dir = new File ("D:/test");
        getJava(dir);
    }

    private static void getJava (File dir) {
    File[] files = dir.listFiles(f -> f.isFile() && f.getName ().toLowerCase ().endsWith ("java"));

        File[] files21 = dir.listFiles ((File pathname) ->{
                if(pathname.isFile () && pathname.getName ().toLowerCase ().endsWith ("java")){
                    return true;
                }else {
                    return false;
                }
            }
        );

        File[] files3 = dir.listFiles (pathname -> {
            if(pathname.isFile () && pathname.getName ().toLowerCase ().endsWith ("java")){
                return true;
            }else {
                return false;
            }
        });
        for (File file : files) {
            System.out.println (file);
        }
    }


}
