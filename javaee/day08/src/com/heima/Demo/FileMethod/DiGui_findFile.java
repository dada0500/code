package com.heima.Demo.FileMethod;

import java.io.File;

public class DiGui_findFile {
    public static void main (String[] args) {
        File dir = Demo03_FileMethod.getDir ();
        findJava (dir);
    }

    public static void findJava(File dir){
        File[] files = dir.listFiles ();
        for (File file : files) {
            if(file.isFile () && file.getName ().toLowerCase ().endsWith ("java")){
                System.out.println (file);
            }else if(file.isDirectory ()){
                findJava (file);
            }
        }
    }
}