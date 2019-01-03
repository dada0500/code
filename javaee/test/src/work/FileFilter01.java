package work;

import java.io.File;


import utils.FileUtils;

import java.io.File;

public class FileFilter01 {
    /*
        需求 : 找出一个文件夹下所有的.java文件(包含子目录)
     */
    public static void main(String[] args) {
        File dir = FileUtils.getDir();

        printJava2(dir);

    }


    public static void printJava2(File dir) {
        File[] files = dir.listFiles(FileFilter01::accept2);

        for (File file : files) {
            if (file.isDirectory()) {
                printJava2(file);
            } else {
                System.out.println(file);
            }
        }

    }


    public static void printJava(File dir) {


        File[] files = dir.listFiles(FileFilter01::accept);


        for (File file : files) {
            if (file.isDirectory()) {
                printJava(file);
            } else {
                System.out.println(file);
            }
        }

    }

    private static boolean accept (File pathname) {
        return pathname.getName ().toLowerCase ().endsWith (".java") || pathname.isDirectory ();
    }

    private static boolean accept2 (File dir1, String name) {
        return new File (dir1, name).isDirectory () || name.toLowerCase ().endsWith (".java");
    }
}
