package com.heima.web.servlet;

import com.heima.domain.User;
import com.heima.service.Service;
import com.heima.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求编码
        request.setCharacterEncoding ("utf-8");

        // 获取请求参数：验证码
        String verifycode = request.getParameter ("verifycode");

        // 获取checkCode生成的验证码
        HttpSession session = request.getSession ();
        String checkcode = (String) session.getAttribute ("CHECKCODE_SERVER");
        // 删除本次验证码
        session.removeAttribute ("CHECKCODE_SERVER");

        // 校验验证码
        if(verifycode == null || checkcode == null || "".equals (checkcode) || !checkcode.equalsIgnoreCase (verifycode)){
            session.setAttribute ("log_msg","验证码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
            return;
        }

        // 如果验证码正确，则根据用户名密码查询用户是否存在
        // 获取请求参数：用户名密码
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");

        // 查询
        Service service = new ServiceImpl ();
        User user = service.checkLogin(username,password);

        // 用户名密码错误，返回错误消息
        if(user == null){
            session.setAttribute ("log_msg","用户名密码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
        }else {
            session.setAttribute ("loginUser",user);
            response.sendRedirect (request.getContextPath () + "/index.jsp");
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
