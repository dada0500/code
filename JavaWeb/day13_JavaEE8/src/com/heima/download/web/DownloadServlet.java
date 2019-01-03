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

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost (req,resp);
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取文件名
        String filename = req.getParameter ("filename");
        // 2. 使用字节输入流加载文件进内存
        // 2.1 获取文件真实路径
        ServletContext context = req.getServletContext ();
        String realPath = context.getRealPath ("/img/" + filename);
        // 2.2 字节流关联文件
//        FileInputStream fis = new FileInputStream (new File (realPath));
        FileInputStream fis = new FileInputStream (realPath);

        //  3. 设置响应头，以下载文件
        // 3.1.1 获取文件MIME类型
        String mimeType = context.getMimeType (filename);
        // 3.1.2 设置响应头类型
        resp.setContentType (mimeType);
        // 3.2 设置响应头打开方式： content-disposition
        // 3.2.1 使用工具类编码文件名，解决中文名乱码
        filename = DownloadUtils.getFileName (req.getHeader ("user-agent"),filename);
        resp.setHeader ("content-disposition","attachment;filename=" + filename);

        // 4. 获取响应输出流，将输入流的数据写出
        ServletOutputStream sos = resp.getOutputStream ();

        int len;
        byte[] bys= new byte[8192];
        while ((len = fis.read (bys)) != -1){
            sos.write (bys,0,len);
        }

        fis.close ();

    }
}
