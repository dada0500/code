package com.heima.web;

import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;

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
        // 设置编码
        request.setCharacterEncoding ("utf-8");
        // 获取请求参数
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");
        String code = request.getParameter ("code");

        // 获取正确的验证码
        HttpSession session = request.getSession ();
        String checkcode_server = (String) session.getAttribute ("CHECKCODE_SERVER");
        // 删除session中的验证码
        session.removeAttribute ("CHECKCODE_SERVER");
        // 判断验证码是否输入正确
        if(code == null || !code.equalsIgnoreCase (checkcode_server)){
            session.setAttribute ("login_msg","验证码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
            return;
        }

        // 判断用户名密码是否正确
        UserService userService = new UserServiceImpl ();
        User user = userService.findByNameAndPassword(username,password);

        // 登录结果
        if(user != null){
            request.getSession ().setAttribute ("user",user);
            response.sendRedirect (request.getContextPath () + "/index.jsp");
        }else {
            session.setAttribute ("login_msg","用户名或密码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
