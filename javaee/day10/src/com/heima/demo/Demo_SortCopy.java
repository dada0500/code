package com.heima.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo_SortCopy {
    public static void main (String[] args) throws IOException {
        // 1. 创建字符高效输入流，为了调用readLine方法，一次读取一行
        BufferedReader br = new BufferedReader (new FileReader ("day10\\csb0.txt"));
        // 2. 使用集合来存储读取到的每一行数据
        ArrayList<String> list = new ArrayList<> ();
        String line;
        while ((line = br.readLine ()) != null){
            list.add (line);
        }
        // 3. 排序
        Collections.sort (list);

        br.close ();
        // 4. 创建输出流，关联文件
        BufferedWriter bw = new BufferedWriter (new FileWriter ("day10\\csb1.txt"));
        // 5. 遍历集合获取到每一个数据
        for (String s : list) {
            bw.write (s);
            bw.newLine ();
        }

        bw.close ();

    }
}
