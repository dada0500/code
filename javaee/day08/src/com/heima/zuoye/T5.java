package com.heima.zuoye;

import java.io.File;

public class T5 {
    public static void main (String[] args) {
        File dir = new File ("D:\\test\\aa");
        File f = new File ("D:\\test\\aa\\a.txt");

        boolean deleteDir = dir.delete ();
        System.out.println (deleteDir);
        boolean deleteF = f.delete ();
        System.out.println (deleteF);
    }
}
