package com.heima.zuoye;
/*
练习六:文件获取方法,递归的使用
        描述:从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
*/

import com.heima.FileUtils.FileUtils;

import java.io.File;

public class Test6 {
    public static void main (String[] args) {

        //FileUtils 自己写的类，获取键盘录入的文件夹路径
//        File dir = FileUtils.getDir ();
        File dir = new File("D:/test");
        getLen(dir);
//        System.out.println (getLen(dir));
    }
//    private static void long (File dir) {

    private static void getLen (File dir) {
        long len = 0;
        File[] files = dir.listFiles ();
        for (File file : files) {
            System.out.println (file);
            if(file.isFile ()){
                len += file.length ();
            }else {
//                len += getLen (file);
                long temp = len;
                getLen (file);
                len += temp;
                System.out.println ("len:" + len);
            }
        }

        System.out.println (dir + " 大小：" + len);
//        return len;
    }
}

/*
d:/test
d:\test\aa\bb 大小：780
d:\test\aa 大小：857
d:\test\gg 大小：1374
d:\test\tt 大小：0
d:\test 大小：1330
4341


d:/test
        d:\test\aa\bb 大小：2817
        d:\test\aa 大小：857
        d:\test\gg 大小：1374
        d:\test\tt 大小：0
        d:\test\新建文件夹 大小：38
        d:\test 大小：15998*/

/*

d:/test
        d:\test\aa\bb 大小：2817
        d:\test\aa 大小：3674
        d:\test\gg 大小：5048
        d:\test\tt 大小：9038
        d:\test\新建文件夹 大小：9076
        d:\test 大小：9114*/
