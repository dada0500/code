package com.heima.ceshi5;

import java.io.File;
import java.util.Scanner;

/*
    描述:从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
 */
public class Test3 {
    public static void main (String[] args) {
        File dir = getDir ();
        System.out.println (getSize(dir));
    }

    private static int getSize (File dir) {
        File[] files = dir.listFiles ();
        int size = 0;
        for (File file : files) {
            if(file.isFile ()){
                size += file.length ();
            }else if(file.listFiles () != null){
                size += getSize (file);
            }
        }
        return size;
    }

    public static File getDir(){
        System.out.println ("输入一路径：");
        Scanner sc = new Scanner ((System.in));
        File file = new File (sc.nextLine ());

        while(true){
            if(!file.exists ()){
                System.out.println ("路径不存在");
            }else if(file.isFile ()){
                System.out.println ("这是文件，需要输入文件夹");
            }else{
                return file;
            }
        }
    }
}
