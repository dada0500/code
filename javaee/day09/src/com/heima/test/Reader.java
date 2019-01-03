package com.heima.test;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day09\\a.txt");
//        FileReader fr = new FileReader("day09\\b.txt");

        int len;

        while((len = fr.read()) != -1){
            System.out.println((char)len);
        }
        System.out.println ("---");
        char[] chs = new char[1024];

        fr = new FileReader("day09\\a.txt");

        while((len = fr.read(chs)) != -1){
            System.out.println(new String(chs,0,len));
        }

        fr.close();

    }
}
