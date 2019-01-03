package com.itheima.demo;

import com.itheima.domain.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("exception")
    public String testException () {
        int a = 3 / 0;
        return "success";
    }

    @RequestMapping("/up")
    public String testUP (HttpServletRequest req) throws Exception {
        System.out.println ("文件上传...");
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = req.getSession ().getServletContext ().getRealPath ("/uploads/");
        // 判断,上传位置路径是否存在
        File file = new File (path);
        if (!file.exists ()) {
            // 不存在则创建文件夹
            file.mkdirs ();
        }

        // 解析request对象,获取上传文件项
        // DiskFileItemFactory磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory ();
        ServletFileUpload upload = new ServletFileUpload (factory);
        // 解析request ,获取文件项集合
        List<FileItem> items = upload.parseRequest (req);
        // 遍历
        for (FileItem item : items) {
            // 进行判断,判断当前item对象 是否是上传文件项 还是普通表单项
            if (item.isFormField ()) {
                // 普通表单项
            } else {
                // 上传文件项
                // 获取上传文件的名称
                String filename = item.getName ();
                // 把文件的名称设置唯一值,使用uuid
                String uuid = UUID.randomUUID ().toString ().replace ("-", "");
                filename = filename + "_" + uuid;
                // 完成文件上传
                item.write (new File (path, filename));
                // 删除临时文件 ,上传会产生临时文件,上传文件大于10kb会存有临时文件,小于10kb会在内存中生产缓存,这个缓存不用处理
                item.delete ();
            }
        }
        return "success";
    }

    @RequestMapping("/upmvc")
    public String testUpmvc (HttpServletRequest req, User user, MultipartFile mvcup) throws Exception {
        System.out.println ("文件上传...");
        System.out.println (user);
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = req.getSession ().getServletContext ().getRealPath ("/uploads/");
        // 判断,上传位置路径是否存在
        File file = new File (path);
        if (!file.exists ()) {
            // 不存在则创建文件夹
            file.mkdirs ();
        }


        // 上传文件项
        // 获取上传文件的名称
        String filename = mvcup.getOriginalFilename ();
        // 把文件的名称设置唯一值,使用uuid
        String uuid = UUID.randomUUID ().toString ().replace ("-", "");
        filename = filename + "_" + uuid;
        // 完成文件上传
        mvcup.transferTo (new File (path, filename));
        return "success";
    }

    @RequestMapping("/upmvc2")
    public String testUpmvc2 (HttpServletRequest req, MultipartFile mvcup) throws Exception {
        System.out.println ("文件上传2...");
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = "http://localhost:8081/uploads/";

        // 上传文件项
        // 获取上传文件的名称
        String filename = mvcup.getOriginalFilename ();

        // 把文件的名称设置唯一值,使用uuid
        String uuid = UUID.randomUUID ().toString ().replace ("-", "");
        filename = uuid + "_" + filename;
        // 完成文件上传
        Client client = Client.create ();
        WebResource resource = client.resource (path + filename);
        resource.put (mvcup.getBytes ());
        return "success";
    }

    @RequestMapping("/ajax")
    public String testAjax (@RequestBody String ajax) {
        System.out.println ("ajax:" + ajax);
        return "success";
    }

    @RequestMapping("/ajaxUser")
    public void testAjaxUser (@RequestBody User user) {
        System.out.println ("ajaxUser:" + user);

    }

    @RequestMapping("/rUser")
    public @ResponseBody
    User testrUser (@RequestBody User user) {
        System.out.println ("rUser:" + user);
        user.setBirthday (new Date ());
        return user;

    }

    @RequestMapping("/hello")
    public String testHello () {
        System.out.println ("执行了hello...");
        return "success";
    }

    @RequestMapping("/date")
    public String testUser (User user) {
        System.out.println ("执行了date...");
        System.out.println (user);
        return "success";
    }

    @RequestMapping("/void")
    public void testV (User user) {
        System.out.println ("执行了void...");
        System.out.println (user);
    }

    @RequestMapping("/testVoid")
    public String testVoid (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println ("执行了testVoid...");
        req.getRequestDispatcher ("/WEB-INF/pages/success.jsp").forward (req, resp);
        return null; // 转发后有return "xxx"; 500
    }

    @RequestMapping("/testVoid2")
    public String testVoid2 (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println ("执行了testVoid...");
        resp.sendRedirect (req.getContextPath () + "/index.jsp");
        return "jsp1"; //重定向后有return "xxx"; 500
    }

    @RequestMapping("/testVoid3")
    public String testVoid3 (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println ("执行了testVoid...");
        resp.sendRedirect (req.getContextPath () + "/index.jsp");
        return null; // 重定向后有return "xxx"; 500
    }

    @RequestMapping("/servlet")
    public void testServlet (HttpServletRequest req, HttpServletResponse resp) {
        System.out.println (req);
        System.out.println (resp);
        return;
    }

    @RequestMapping("/mv")
    public ModelAndView testMv () {
        ModelAndView mv = new ModelAndView ();
        mv.setViewName ("success");
        User user = new User ();
        user.setName ("M名");
        user.setAge (18);
        mv.addObject ("user", user);
        return mv;
    }

    @RequestMapping("/mvr")
    public ModelAndView testMvRedirect () {
        ModelAndView mv = new ModelAndView ();
        mv.setViewName ("redirect:/img/girl8.jpg");
        User user = new User ();
        user.setName ("M名");
        user.setAge (18);
        mv.addObject ("user", user);
        return mv;
    }

    @RequestMapping("/mv2")
    public ModelAndView testMv2 () {
        ModelAndView mv = new ModelAndView ();
        User user = new User ();
        user.setName ("M2名");
        user.setAge (28);
        mv.addObject ("user", user);
        mv.setViewName ("success");
        return mv;
    }

    /**
     * 使用关键字的方式进行请求转发
     */
    @RequestMapping("/forward")
    public String testForward () {
        System.out.println ("forward关键字方式转发");
        return "forward:/web-inf/pages/jsp1.jsp";
    }

    /**
     * 使用关键字的方式进行请求转发2
     */
    @RequestMapping("/forward2")
    public String testForward2 () {
        System.out.println ("forward2关键字方式转发");
        return "forward:/WEB-INF/pages/jsp1.jsp";
    }

    /**
     * 使用关键字redirect的方式进行请求转发
     */
    @RequestMapping("/redirectw")
    public String testRedirectw () {
        System.out.println ("redirectw关键字方式转发");
        return "redirect:/web-info/pages/jsp1.jsp";
    }

    /**
     * 使用关键字forward的方式进行请求转发
     */
    @RequestMapping("/redirect")
    public String testRedirect () {
        System.out.println ("redirect关键字方式转发");
        return "redirect:/index.jsp";
    }
}
