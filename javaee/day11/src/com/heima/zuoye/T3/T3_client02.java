package com.heima.zuoye.T3;

import java.io.*;
import java.net.Socket;

public class T3_client02 {
    public static void main (String[] args) throws IOException {
        Socket socket = new Socket ("127.0.0.1", 8002);

        File file = new File ("D:\\test\\fdish.jpg");
//        File file = new File ("D:\\test\\04_文件上传案例的阻塞问题.jpg");
        boolean b = file.exists () && file.getName ().toLowerCase ().endsWith (".jpg") && (file.length () < 1024*1024*2);
        if(!b){
            System.out.println ("图片不符合要求");
            socket.close ();
            return;
        }

        //建立本地流InputStream
        BufferedInputStream is = new BufferedInputStream (new FileInputStream (file));
//        FileInputStream is = new FileInputStream (file);

        //通过socket获取输出流，使用BufferedOutputStream包装
        BufferedOutputStream os = new BufferedOutputStream (socket.getOutputStream ());
//        OutputStream os = socket.getOutputStream ();
//
        int len;
        byte[] bys = new byte[1024];
        while ((len = is.read (bys)) != -1){
            os.write (bys,0,len);
        }
        os.flush ();

        is.close ();


        socket.shutdownOutput ();

        //通过socket获取输入流
        InputStream sis = socket.getInputStream ();
        System.out.println (new String (sis.readAllBytes ()));

        socket.close ();
    }
}
