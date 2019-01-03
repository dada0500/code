package com.heima.demo.ClientServer;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) throws IOException {
        // 1. 创建服务端 ServerSocket对象
        ServerSocket serverSocket = new ServerSocket (8888);
        System.out.println ("服务端启动");
        // 2. 响应客户端请求，获取客户端Socket
        Socket socket = serverSocket.accept ();
        // 3. 获取客户端InputStream
        InputStream is = socket.getInputStream ();
        // 3.1 使用bufferedReader包装获取到的InputStream，以方便读取字符串
        BufferedReader br = new BufferedReader (new InputStreamReader (is));
        String s = br.readLine ();
        System.out.println ("客户端的请求：" + s);

/*        int len;
        byte[] bys = new byte[1024];
        while ((len = is.read (bys)) != -1){
            System.out.println (new String (bys,0,len));
        }*/

        // 4. 获取客户端OutputStream
        OutputStream os = socket.getOutputStream ();
        // 5. 写出数据给客户端
        // 5.1 使用PrintStream包装获取到的OutputSream
        PrintStream ps = new PrintStream (os);
        ps.println ("服务器我在。");

        socket.close ();

//        serverSocket.close ();    //服务端ServerSocket一般不关
    }
}
