package com.heima.zuoye.daan3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    /*
        服务端需求：接收客户端发送过来的图片数据。进行存储后，回馈一个“上传成功”字样。支持多用户的并发访问。
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086);

        while(true){

            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        // 1. 获取输入流, 读取客户端发送过来的数据
                        InputStream is = socket.getInputStream();

                        // 2. 创建本地流, 关联本地资源文件
                        String fileName = "itcast" + System.currentTimeMillis() + ".jpg";
                        FileOutputStream fos = new FileOutputStream("F:\\" + fileName);

                        byte[] bys = new byte[8192];
                        int len;
                        while((len = is.read(bys)) != -1){
                            fos.write(bys,0,len);
                        }

                        fos.close();

                        // 3. 回写上传成功
                        socket.getOutputStream().write("上传成功".getBytes());
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


        }


    }
}
