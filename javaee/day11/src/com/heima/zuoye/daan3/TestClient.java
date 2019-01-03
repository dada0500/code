package com.heima.zuoye.daan3;

import java.io.*;
import java.net.Socket;

public class TestClient {
    /*
        客户端需求：把一个图片文件发送到服务端并读取回馈信息。要求判断文件是否存在及格式是否为jpg并要求文件小于2M。
     */
    public static void main(String[] args) throws IOException {
        // 1. 将需要上传的文件封装成File对象
        File file = new File("D:\\1.jpg");

        // 2. 进行条件筛选
        if(!file.exists()){
            return;
        }

        if(!file.getName().toLowerCase().endsWith(".jpg")){
            return;
        }

        if(file.length() > 1024 * 1024 * 2){
           return;
        }


        // 3. 创建本地流读取文件
        FileInputStream fis = new FileInputStream(file);
        Socket socket = new Socket("127.0.0.1",10086);
        OutputStream os = socket.getOutputStream();

        byte[] bys = new byte[8192];
        int len;
        while((len = fis.read(bys)) != -1){
            os.write(bys,0,len);
        }

        // 4. 读写完毕, 给服务端一个结束标记
        socket.shutdownOutput();
        fis.close();

        // 5. 读取回馈信息
        String s = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
        System.out.println(s);

        socket.close();

    }
}
