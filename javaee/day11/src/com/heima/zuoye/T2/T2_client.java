package com.heima.zuoye.T2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class T2_client {
    public static void main (String[] args) throws IOException {
        Socket socket = new Socket ("127.0.0.1", 8002);

        //建立本地流InputStream
        BufferedInputStream bif = new BufferedInputStream (new FileInputStream ("D:\\test\\1.jpg"));

        //通过socket获取输出流
        OutputStream os = socket.getOutputStream ();

        int len;
        byte[] bys = new byte[8192];
        while ((len = bif.read (bys)) != -1){
            os.write (bys);
        }



        bif.close ();
        socket.close ();
    }
}
