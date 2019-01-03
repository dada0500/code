package com.heima.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_ShiYongCiShu {
    public static void main (String[] args) throws IOException {
        FileReader fr = new FileReader ("day09\\src\\com\\heima\\demo\\config.txt");

        int i = Integer.parseInt (((char) fr.read ()) + "");

        if (i > 3) {
            System.out.println ("试用机会已用完，请购买正版。");
        } else {
            System.out.println ("还有" + (3 - i) + "次试用次数");
            i++;
            FileWriter fw = new FileWriter ("day09\\src\\com\\heima\\demo\\config.txt");
            fw.write (i + "");
            fw.close ();
            fr.close ();
        }
    }
}
