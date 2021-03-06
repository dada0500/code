package com.heima.zuoye.T1;

import java.io.*;
import java.net.Socket;

public class T1_client {
    public static void main (String[] args) throws IOException {
        // 1. 创建客户端Socket对象
        Socket socket = new Socket ("127.0.0.1", 8002);

        // 4. 获取客户端InputStream
        InputStream is = socket.getInputStream ();
        // 4.1 使用bufferedReader包装获取到的InputStream，以方便读取字符串
        BufferedReader br = new BufferedReader (new InputStreamReader (is));
        String s = br.readLine ();
        System.out.println ("服务器端的回复：" + s);
/*        int len;
        byte[] bys = new byte[1024];
        while ((len = is.read (bys)) != -1){
            System.out.println (new String (bys,0,len));
        }*/
        // 5. 关闭socket，关闭流，释放资源
        socket.close ();

    }
}
