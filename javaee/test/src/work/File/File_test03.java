package work.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_test03 {
    /*
        需求 : 文件夹的拷贝

            注意 : 输入流不能直接关联文件夹去读取
     */
    public static void main (String[] args) throws IOException {
        File src = FileUtil.getDir ();
        File dsn = FileUtil.getDir ();
//        if(src.equals (dsn))
        copyDir(src,dsn);
    }

    private static void copyDir (File src, File dsn) throws IOException {
        File dsnDir = new File (dsn,src.getName ());
//        if(!dsnDir.exists ()){
            dsnDir.mkdirs();
//        }

        File[] files = src.listFiles ();
        for (File srcFile : files) {
            if(srcFile.isFile ()){
                FileInputStream fis = new FileInputStream (srcFile);
                FileOutputStream fos = new FileOutputStream (new File (dsnDir,srcFile.getName ()));

                int len;
                byte[] bys = new byte[1024];
                while ((len = fis.read (bys)) != -1){
                    fos.write (bys,0,len);
                }

                fos.close ();
                fis.close ();
            }else {
                copyDir (srcFile,dsnDir);
            }
        }
    }


}