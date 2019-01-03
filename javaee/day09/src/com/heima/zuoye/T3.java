package com.heima.zuoye;

import java.io.FileOutputStream;
import java.io.IOException;

public class T3 {
    public static void main (String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream ("day09\\where.txt",true);
        for (int i = 0; i < 5; i++) {
            fos.write ("\r\n".getBytes ());
            fos.write ("I Love Java".getBytes ());
        }
//        fos.write ("\r\n".getBytes ());
        fos.close ();
    }
}
