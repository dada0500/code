package com.heima.zuoye;

import java.io.File;

public class T6 {
    public static void main (String[] args) {

        File f = new File ("D:\\test\\aa\\a.txt");

        String fname = f.getName ();
        System.out.println (f.getName ());
        long flength = f.length ();
        System.out.println (f.length ());
        String fabsolutePath = f.getAbsolutePath ();
        System.out.println (f.getAbsolutePath ());
        File fabsoluteFile = f.getAbsoluteFile ();
        System.out.println (f.getAbsoluteFile ());

        /*f.isFile ()
        f.isDirectory ()*/

        File f1 = new File ("D:\\test\\aa\\noexists.txt");

        String f1name = f1.getName ();
        System.out.println (f1.getName ());
        long f1length = f1.length ();
        System.out.println (f1.length ());
        String f1absolutePath = f1.getAbsolutePath ();
        System.out.println (f1.getAbsolutePath ());
        File f1absoluteFile = f1.getAbsoluteFile ();
        System.out.println (f1.getAbsoluteFile ());
        String f1parent = f1.getParent ();
        System.out.println (f1parent);
        File f1parentFile = f1.getParentFile ();
        System.out.println (f1parentFile);
    }
}
