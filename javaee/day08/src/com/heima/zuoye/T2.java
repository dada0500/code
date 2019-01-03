package com.heima.zuoye;
/*
练习二:检查文件是否存在,文件的创建
        描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
*/

import java.io.File;
import java.io.IOException;

public class T2 {
    public static void main (String[] args) throws IOException {
//        File f = new File ("D:\\test\\a.txt");
        File f = new File ("D:\\test\\aa\\a.txt");
        if(f.exists()){
            System.out.println ("文件存在");
        }else {
            if(f.getParentFile ().exists ()){
                if( f.createNewFile () ){
                    System.out.println ("创建成功");
                }
            }else {
                System.out.println ("没有此目录");
            }
        }
    }
}
