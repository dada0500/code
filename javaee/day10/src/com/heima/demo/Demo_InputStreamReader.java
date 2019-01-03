package com.heima.demo;

import java.io.*;

public class Demo_InputStreamReader {
    public static void main (String[] args) throws IOException {
        BufferedReader bis = new BufferedReader (new InputStreamReader (new BufferedInputStream (new FileInputStream ("day10\\gbk.txt")), "gbk"));
//        BufferedReader bis = new BufferedReader (new InputStreamReader (new FileInputStream ("day10\\gbk.txt"), "gbk"));
        String i;
        while ((i = bis.readLine ()) != null){
            System.out.println ( i );
        }

        System.out.println ("------");
        bis = new BufferedReader (new InputStreamReader (new FileInputStream ("day10\\utf8.txt"), "gbk"));

        while ((i = bis.readLine ()) != null){
            System.out.println ( i );
        }

        bis.close ();
    }
}
