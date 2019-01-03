package com.heima.zuoye;
/*
练习一:相对路径和绝对路径的使用
        描述:创建两个文件对象，分别使用相对路径和绝对路径创建。

        绝对路径 : 从盘符的根目录开始, 一直指向到具体的文件  D:\\ccc\\info.txt

        相对路径 : 相对于当前项目(project)下的xxx文件.
*/

import java.io.File;
import java.io.IOException;

public class T1 {
    public static void main (String[] args) throws IOException {

//        File f = new File ( "D:/c/info.txt");
        File f = new File ("info.txt");
        System.out.println (f.getAbsolutePath ());
//        f.createNewFile ();
        System.out.println (f);


    }

}
