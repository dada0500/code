package com.heima.zuoye;
/*
练习五:文件和文件夹删除
        描述:
        键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
        要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
        提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
*/

import com.heima.FileUtils.FileUtils;

import java.io.File;

public class Test5 {
    public static void main (String[] args) {
        //FileUtils 自己写的类，获取键盘录入的文件夹路径
        File dir = FileUtils.getDir ();
        delDir (dir);
    }

    public static void delDir (File dir) {
        File[] files = dir.listFiles ();
        for (File file : files) {
            if (file.isFile ()) {
                file.delete ();
                System.out.println ("删除" + file + "完成");
            } else {
                delDir (file);
            }
        }
        boolean delete = dir.delete ();
        if (delete) {
            System.out.println ("删除" + dir + "完成");
        } else {
            System.out.println ("删除" + dir + "失败");
        }
    }
}
