package com.heima.test.InputStreamReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class isr00 {
    public static void main (String[] args) throws IOException {
        // 1. 创建转换流(输出流对象)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream ("day10\\aaaa.txt"),"GBK");

        osw.write("看看我乱码了吗?");

        osw.close();
    }
}
