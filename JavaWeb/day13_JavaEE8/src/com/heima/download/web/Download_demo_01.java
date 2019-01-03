package com.heima.download.web;

import com.heima.download.utils.DownloadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download_demo_01")
public class Download_demo_01 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 1. 获取 ServletContext对象
    ServletContext context = this.getServletContext ();
    // 2. 通过请求参数，获取文件名
    String filename = request.getParameter ("filename");

    // 3. 获取文件真实路径
    String realPath = context.getRealPath ("img/" + filename);

    // 4. 创建字节输入流，加载文件进内存
    FileInputStream fis = new FileInputStream (realPath);

    // 5. 设置响应MIME类型，设置编码格式
    String mimeType = context.getMimeType (filename);
//    response.setContentType (mimeType);
    response.setContentType ("image/png");
    // 5.1 使用工具编码文件，解决中文乱码
    filename = DownloadUtils.getFileName (request.getHeader ("user-agent"),filename);

    // 6. 设置响应头 content-disposition:attachment;filename= ?，设置浏览器打开资源方式
    response.setHeader ("content-disposition","attachment;filename="+filename);

    // 7. 获取response输出流
    ServletOutputStream sos = response.getOutputStream ();

    // 8. 写出文件到response输出流
    int len;
    byte[] bys = new byte[8192];
    while ((len = fis.read (bys)) != -1){
        sos.write (bys,0,len);
    }

    // 9. 关闭输入流
    fis.close ();
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
