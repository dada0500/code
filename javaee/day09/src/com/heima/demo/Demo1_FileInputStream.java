package com.heima.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_FileInputStream {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("d:/test/a.txt");

        int i;
        while ((i = fis.read ()) != -1){
            System.out.println ( (char)i );
        }

        fis.close ();
    }
}
