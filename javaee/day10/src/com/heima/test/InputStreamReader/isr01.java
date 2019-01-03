package com.heima.test.InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class isr01 {
    public static void main (String[] args) throws IOException {
        read_gbk ();
    }

    private static void read_gbk() throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("10_IO\\gbk.txt"),"UTF-8");//???
        InputStreamReader isr = new InputStreamReader (new FileInputStream ("day10\\a.txt"),"GBK");//你好
//        InputStreamReader isr = new InputStreamReader (new FileInputStream ("day10\\a.txt"),"UTF-8");//你好

        //2.使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while((len = isr.read())!=-1){
//            System.out.println((char)len);
            System.out.println(len);
        }
        //3.释放资源
        isr.close();
    }

}
