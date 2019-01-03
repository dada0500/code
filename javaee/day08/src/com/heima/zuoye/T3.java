package com.heima.zuoye;
/*
练习三:单级文件夹的创建
        描述:在D盘下创建一个名为bbb的文件夹。
*/

import java.io.File;

public class T3 {
    public static void main (String[] args) {
        File dir = new File ("D:\\test\\aa");
//        if (dir.mkdir ()) {
        //使用mkdirs,能创建不存在的父目录
        if (dir.mkdirs ()) {
            System.out.println ("创建" + dir + "成功");
        }else {
            System.out.println ("创建" + dir + "失败");
        }
    }
}
