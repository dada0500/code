package cn.itcast.travel.web.servlet;

import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/active")
public class ActiveServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取激活码
        String code = request.getParameter ("code");
        response.setContentType ("text/html;charset=utf-8");
        if(code == null || "".equalsIgnoreCase (code)){
            response.getWriter ().write ("激活失败");
        }

        // 激活
        UserService service = new UserServiceImpl ();
        boolean flag = service.activeUser(code);
        if(flag){
            //激活成功
            response.getWriter ().write ("激活成功，请<a href='login.html'>登录</a>");
        }else {
            //激活失败
            response.getWriter ().write ("激活失败");
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
