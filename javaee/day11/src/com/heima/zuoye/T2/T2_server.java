package com.heima.zuoye.T2;
/*
练习二:TCP上传案例
需求说明：我们来做一个“文件上传案例”，有以下要求：
将项目中的一个图片,通过客户端上传至服务器
*/

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class T2_server {
    public static void main (String[] args) throws IOException {
        ServerSocket server = new ServerSocket (8002);
        Socket socket = server.accept ();

        //建立 服务端 本地输出流
        BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("day11\\1.jpg"));

        //通过 socket 获取输入流
        InputStream is = socket.getInputStream ();

        int len;
        byte[] bys = new byte[8192];
        while ((len = is.read (bys)) != -1){
            bos.write (bys);
        }

        bos.close ();
        socket.close ();
        server.close ();
    }
}
