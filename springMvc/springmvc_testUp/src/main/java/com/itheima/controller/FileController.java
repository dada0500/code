package com.itheima.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/test")
    public @ResponseBody String test(){
        return "测试OK";
    }

    @RequestMapping("/upload")
    public @ResponseBody String fileUpload(HttpSession session, MultipartFile uploadFile) throws IOException {
        // 文件存放目录
        String realPath = session.getServletContext ().getRealPath ("/uploads/");
        File path = new File (realPath);
        if(!path.exists ()){
            path.mkdirs ();
        }

        // 文件名
        String filename = uploadFile.getOriginalFilename ();
        String uuid = UUID.randomUUID ().toString ();
        filename = uuid + filename;
        uploadFile.transferTo (new File (path,filename));
        return "上传成功";
    }

    @RequestMapping("/uploado")
    public @ResponseBody String fileUploado(HttpSession session, MultipartFile uploadFile) throws IOException {
        // 文件存放目录
        String realPath = "http://localhost:8081/uploads/";

        // 文件名
        String filename = uploadFile.getOriginalFilename ();
        String uuid = UUID.randomUUID ().toString ();
        filename = uuid + filename;
        Client client = Client.create ();
        WebResource resource = client.resource (realPath+filename);
        resource.put (uploadFile);
        return "上传成功";
    }

    @RequestMapping("/uploads")
    public @ResponseBody String fileUploads(HttpSession session, MultipartFile[] uploadFiles) throws IOException {
        // 文件存放目录
        String realPath = session.getServletContext ().getRealPath ("/uploads/");
        File path = new File (realPath);
        if(!path.exists ()){
            path.mkdirs ();
        }

        for (MultipartFile uploadFile : uploadFiles) {
            // 文件名
            String filename = uploadFile.getOriginalFilename ();
            String uuid = UUID.randomUUID ().toString ();
            filename = uuid + filename;
            // 上传
            uploadFile.transferTo (new File (path,filename));
        }
        return "上传成功";
    }
}
