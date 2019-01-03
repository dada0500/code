package com.heima.test;

import java.io.FileInputStream;
import java.io.IOException;

public class Input {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("day09/src/com/heima/demo/a.txt");

//        System.out.println (fis.read ());
        fis = new FileInputStream ("day09/a.txt");
        int len;
        String s = "";
      //  输入，读取 UTF8格式中文
        while ((len = fis.read ()) != -1){
            s += len;
//            s += (char)len;
//            s += len;
            System.out.println (s);
        }

        System.out.println ();
        System.out.println ("----------");
        fis = new FileInputStream ("day09/src/com/heima/demo/a.txt");
      //  输入，读取 UTF8格式中文
        while ((len = fis.read ()) != -1){
            System.out.print (len);
        }

/**
*        System.out.println ();
*        System.out.println ("----------");
        fis = new FileInputStream ("day09/T7.txt");
        */




      //  输入，读取 UTF8格式中文
/*        byte[] by2 = new byte[3];
        while ((len = fis.read (by2)) != -1){
            System.out.println (new String (by2,0,len));
        }
        System.out.println ();
        System.out.println ("----------");
        fis = new FileInputStream ("day09/T7.txt");

        int index = 0;
        byte[] by3 = new byte[3];*/

/*      by3[0] = (byte)fis.read ();
        by3[1] = (byte)fis.read ();
        by3[2] = (byte)fis.read ();
        System.out.println (new String (by3));*/

/*        while ((len = fis.read ()) != -1){
            by3[index] = (byte) len;
            index++;
            if (index == 3){
                System.out.println (new String (by3));
                index = 0;
            }
        }*/

        fis.close ();
    }
}
