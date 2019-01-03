package com.heima.demo;

import java.io.*;

public class Demo_GBKtoUFT8 {
    public static void main (String[] args) throws IOException {
        // 1. 创建转换流对象，以GBK的形式读取文件
        BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream ("day10\\gbk.txt"),"GBK"));

        // 2. 将数据安全的保存到内存当中
        String line = br.readLine ();
/*        while ((line = br.readLine ()) != null){

        }*/
        // 3. 将内容以UTF-8的形式写出
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (new FileOutputStream ("day10\\gbk.txt"),"UTF-8"));
        // FileWriter fw = new FileWriter("day10\\gbk.txt");
        bw.write (line);

        bw.close ();
        br.close ();
    }
}
