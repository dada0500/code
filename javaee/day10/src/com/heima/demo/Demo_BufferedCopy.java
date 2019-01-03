package com.heima.demo;

import java.io.*;

public class Demo_BufferedCopy {
    public static void main (String[] args) throws IOException {
        long start = System.currentTimeMillis ();
        BufferedInputStream bis = new BufferedInputStream (new FileInputStream ("E:\\javaheima\\test.zip"));
        BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("E:\\javaheima\\testCopy.zip"));
        byte[] bytes = new byte[2048];
        int len;
        while ((len = bis.read (bytes)) != -1){
            bos.write (bytes,0,len);
        }

        bos.close ();
        bis.close ();
        long end = System.currentTimeMillis ();
        System.out.println (end - start);
    }
}
