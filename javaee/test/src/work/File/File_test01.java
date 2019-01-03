package work.File;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class File_test01 {
    /*
        需求 : 统计一个文件夹下, 所有文件类型出现的个数

                    并将, 没有后缀名的文件删除.

                例如 :
                        D:\\abc
                        txt : 2个
                        jpg : 1个
                        java : 2个
     */
    public static void main (String[] args) {
        HashMap<String,Integer> hm = new HashMap<> ();

        File file = new File ("D:\\test");
        getCount(file,hm);
        System.out.println ("文件类型数量：" + hm.size ());
        System.out.println (hm);
    }

    public static void getCount (File dir, HashMap<String,Integer> hm) {
        File[] files = dir.listFiles ();
        for (File file : files) {
            if(file.isFile ()){
                if(file.getName ().contains (".")){
                    String[] nameArr = file.getName ().toLowerCase ().split ("\\.");
                    String name = nameArr[nameArr.length - 1];
                    if(hm.containsKey (name)){
                        hm.put (name,hm.get (name) + 1);
                    }else{
                        hm.put (name,1);
                    }
                }else {
                    System.out.println ("空：" + file.getName ());
                }
            }else{
                getCount (file,hm);
            }
        }
    }
}
