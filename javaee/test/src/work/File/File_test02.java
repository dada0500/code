package work.File;

import java.io.File;
import java.io.FileFilter;

public class File_test02 {
    public static void main(String[] args) {

//        File dir = FileUtil.getDir();
        File dir = new File ("h:\\test");
        del3(dir);

    }
    private static void del2 (File dir) {
        File[] files = dir.listFiles ();
        for (File file : files) {
            if(file.isFile ()){
                file.delete ();
            }else {
                del2(file);
            }
        }
        dir.delete ();
    }
    private static void del3(File dir) {
        File[] files = dir.listFiles ();
        for (File file : files) {
            if(file.isFile ()){
                System.out.println (1);
                file.delete ();
            }else {
                System.out.println (1);
                del2(file);
                dir.delete ();
            }
        }
    }

    private static void del (File dir) {
        File[] files = dir.listFiles ( f -> {
            if (f.isFile ()) {
                return true;
            }else{
                return false;
            }
        });

        File[] dirs = dir.listFiles (f -> {
            if (f.isDirectory ()) {
                return true;
            } else {
                return false;
            }
        });

        for (File file : files) {
            file.delete ();
        }

        for (File d : dirs) {
            if(d.listFiles ().length != 0){
                System.out.println ("dir!=0.. " + d);
                del(d);
            }
                System.out.println ("dir==0.. " + d);
                d.delete ();

        }

    }

}