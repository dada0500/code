package com.heima.zuoye.T1;
/*
练习一:TCP程序
        需求说明：使用TCP编写一个网络程序,设置服务器程序监听端口为8002,当于客户端建立后,向客户端发送”hello world”,客户端将信息输出
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class T1_server {
    public static void main (String[] args) throws IOException {
        // 1. 创建服务端 ServerSocket对象
        ServerSocket serverSocket = new ServerSocket (8002);
        System.out.println ("服务端启动");

        // 2. 响应客户端请求，获取客户端Socket
        Socket socket = serverSocket.accept ();

        // 4. 获取客户端OutputStream
        OutputStream os = socket.getOutputStream ();
        // 5. 写出数据给客户端
        // 5.1 使用PrintStream包装获取到的OutputSream
        PrintStream ps = new PrintStream (os);
        ps.println ("hello world");

        socket.close ();

//        serverSocket.close ();    //服务端ServerSocket一般不关
    }
}
