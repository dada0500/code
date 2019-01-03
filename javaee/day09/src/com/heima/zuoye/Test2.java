package com.heima.zuoye;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/*
练习二:字节输出流写出数据
        描述:
        从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
        将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
        当用户输入end时停止输入。
*/

public class Test2 {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream ("day09\\stu.txt");

        while (true){
            System.out.println ("请输入学生信息：");
            String strIn = new Scanner(System.in).nextLine ();

            if("end".equals (strIn)){
                break;
            }
            fos.write ( strIn.getBytes ());
            fos.write ("\r\n".getBytes ());
        }
        fos.close ();
    }
}
