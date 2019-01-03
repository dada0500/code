package com.heima.FileUtils;

import java.io.File;
import java.util.Scanner;

public class FileUtils {

    // 判断键盘输入的是不是文件夹路径，并返回。
    public static File getDir(){
        System.out.println ("请输入文件夹路径：");

        while (true){
            // 1. 将键盘录入的字符串封闭成file对象，方便判断
            File f = new File (new Scanner (System.in).nextLine ());
            // 2. 判断是否是合法的文件或文件夹
            if(!f.exists()){
                System.out.println ("您输入的路径有误，请重新输入一个文件夹路径：");
            }else if(f.isFile ()){
                // 3. 判断是否是文件
                System.out.println ("您输入的是一个文件路径，请重新输入一个文件夹路径：");
            }else{
                // 4. 说明存在，且不是文件，就只能是文件夹
                return f;
            }
        }
    }
}
