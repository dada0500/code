package com.heima.test;

import java.io.*;

public class copy {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("D:/test/1.jpg");
        FileOutputStream fos = new FileOutputStream ("d:/test/copy2.jpg");

/*        int read;
        while ((read = fis.read ()) != -1){
            fos.write (read);
        }*/

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read (bytes)) != -1){
            fos.write (bytes,0,len);
        }
        fos.close ();
        fis.close ();
    }
}
