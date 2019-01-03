package work.File;

import java.io.File;
import java.util.Scanner;

public class FileUtil {
    public static File getDir(){
        System.out.println ("请输入文件夹地址：");
        Scanner sc = new Scanner (System.in);

        while(true){
            File f = new File (sc.nextLine ());
            if(!f.exists ()){
                System.out.println ("不存在的路径");
            }else if(f.isFile ()){
                System.out.println ("是文件，请输入文件夹");
            }else {
                return f;
            }
        }
    }
}
