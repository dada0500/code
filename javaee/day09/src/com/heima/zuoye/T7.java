package com.heima.zuoye;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class T7 {
    public static void main (String[] args) {
        String url = "day09/T7.txt";
        try(FileOutputStream fos = new FileOutputStream (url);) {
            while (true) {
                System.out.println ("请输入信息:");
                String txt = new Scanner (System.in).nextLine ();
                if ("886".equals (txt)) {
                    FileInputStream fis = new FileInputStream (url);
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = fis.read (bytes)) != -1){
                        System.out.println (new String (bytes,0,len));
                    }
                    break;
                }
                fos.write (txt.getBytes ());
                fos.write ("\r\n".getBytes ());
            }
        }catch (IOException e){
            System.out.println (e);
        }
    }
}
