package com.heima.zuoye;
/*
练习一:文件创建、判断功能、获取功能
        描述:
        键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
        如果是文件，则输出文件的大小
        如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
*/

import com.heima.FileUtils.FileUtils;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main (String[] args) {
        System.out.println ("请输入一个文件路径：");
        File dir = new File (new Scanner (System.in).nextLine ());

        //如果文件存在，判断是文件还是文件夹
        if (dir.exists ()) {
            if (dir.isFile ()) {
                long length = dir.length ();
                System.out.println ("文件【" + dir + "】大小：");
                System.out.println (length);
            } else {
                System.out.println ("文件夹【" + dir + "】下所有文件大小（不包含子文件夹）：");
                System.out.println (dirLength (dir));
            }
        }else {
            System.out.println ("路径不存在");
        }
    }

    public static long dirLength (File dir) {
        long length = 0;
        File[] files = dir.listFiles ();
        for (File file : files) {
            length += file.length ();
        }
        return length;
    }
}
