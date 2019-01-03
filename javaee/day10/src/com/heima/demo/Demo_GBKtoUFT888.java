package com.heima.demo;

import java.io.*;

public class Demo_GBKtoUFT888 {
    public static void main (String[] args) throws IOException {
        // 1. 创建转换流对象，以GBK的形式读取文件
        BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream ("day10\\gbk.txt"),"GBK"));
        // 1. 创建转换流对象，以UTF-8的形式写出文件
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (new FileOutputStream ("day10\\gbkcopytoutf8.txt"),"UTF-8"));
//         File fw = new File("day10\\gbk.txt");
        // 2. 将数据安全的保存到内存当中
        String line;
        while ((line = br.readLine ()) != null){
            // 3. 将内容以UTF-8的形式写出
            bw.write (line);
            bw.newLine ();
        }

        bw.close ();
        br.close ();
    }
}
