package com.heima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class append {
    public static void main (String[] args) throws IOException {

//    FileOutputStream fos = new FileOutputStream ("D:\\c.txt", true);
        FileWriter fos = new FileWriter ("day09\\where.txt");
//        fos.write ("ABC".toCharArray ());
        fos.append ("efg");
/*        for (int i = 0; i < 5; i++) {
            fos.write ("\r\nI Love Java".toCharArray ());
        }
        fos.write ("\r\n".toCharArray ());*/
        fos.close ();
    }
}
