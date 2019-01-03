package com.heima.Demo.FileMethod;

import java.io.File;

public class Del_file {
    public static void main (String[] args) {
//        File dir = Demo03_FileMethod.getDir ();
        File dir = new File ("d:/test");
        del (dir);
    }

    public static void del(File dir){
        // 1. 获取当前文件夹下所有的文件和文件夹对象
        File[] files = dir.listFiles ();
        // 2. 遍历数组，获取每一个
        for (File file: files){
            // 3. 判断当前file对象是否是文件
            if(file.isFile ()){
                // 3.1 是文件，直接删除
                file.delete ();
            }else {
                // 3.2 是文件夹，进入文件夹继续删除
                if(file.listFiles () != null){
                    del (file);
                }
            }
        }
        // 删除空文件夹
        dir.delete ();
    }
}
