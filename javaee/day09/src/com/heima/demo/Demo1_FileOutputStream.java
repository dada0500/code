package com.heima.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo1_FileOutputStream {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos  = new FileOutputStream ("day09/src/com/heima/demo/a.txt",true);

/*        while (true){
            System.out.println ("请输入：");

            String line = new Scanner (System.in).nextLine ();

            if("quit".equals (line)){
                break;
            }
            fos.write ((line + "\r\n").getBytes ());
        }*/
//        fos.write ('a');
        fos.write ('a');
        fos.write (98);
//        System.out.println (Byte.valueOf ("j"));

        fos.close ();
    }
}
