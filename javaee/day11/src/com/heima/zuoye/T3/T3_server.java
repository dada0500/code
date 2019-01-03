package com.heima.zuoye.T3;
/*
练习三:上传图片文件
客户端需求：把一个图片文件发送到服务端并读取回馈信息。
要求判断文件是否存在及格式是否为jpg并要求文件小于2M。
服务端需求：接收客户端发送过来的图片数据。进行存储后，回馈一个“上传成功”字样。支持多用户的并发访问。

*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class T3_server {
    public static void main (String[] args) throws IOException {
        ServerSocket server = new ServerSocket (8002);
        System.out.println ("服务端启动");

        while (true){

            Socket socket = server.accept ();

            new Thread (() -> {
                try {
                    String name = "itcast" + System.currentTimeMillis () + "_" + new Random ().nextInt (99) + ".jpg";
                    //建立 服务端 本地输出流
                    BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("day11\\"+ name));

                    //通过 socket 获取输入流
                    BufferedInputStream bis = new BufferedInputStream (socket.getInputStream ());

                    int len;
                    byte[] bys = new byte[1024];
                    while ((len = bis.read (bys)) != -1){
                        bos.write (bys,0,len);
                    }

                    bos.close ();


                    //通过 socket 获取输出流
                    OutputStream os = socket.getOutputStream ();
                    os.write ("上传成功".getBytes ());

                    socket.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }).start ();


        }

//        server.close ();
    }
}
