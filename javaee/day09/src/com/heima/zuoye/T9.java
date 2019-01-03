package com.heima.zuoye;

import java.io.File;
import java.io.FileInputStream;

public class T9 {
    public static void main (String[] args) {
        getNum (new File ("day09/score.txt"), 'a');
    }

    public static void getNum (File f, char ch) {
        try (FileInputStream fis = new FileInputStream (f);) {
            int len = -1;
            int count = 0;
            while ((len = fis.read ()) != -1) {
                if (ch == len) {
                    count++;
                }
            }
            System.out.println (ch + "在" + f.getName () + "文件中出现了" + count + "次。");
        } catch (java.io.IOException e) {
            e.printStackTrace ();
        }
    }
}
