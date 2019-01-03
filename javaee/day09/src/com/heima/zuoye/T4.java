package com.heima.zuoye;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T4 {
    public static void main (String[] args) throws IOException {
        FileInputStream  fis = new FileInputStream ("D:\\test\\a.txt");

        int I;

        while((I = fis.read()) != -1){
//            System.out.println(I);  //65
            System.out.println((char)I);  //65
        }

        fis.close();

    }
}
