package cn.itcast.web.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.Service;
import cn.itcast.service.impl.ServiceImpl;

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

        // 获取提交的验证码/用户名/密码
        String verifycode = request.getParameter ("verifycode");
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");

        // 生成的验证码
        HttpSession session = request.getSession ();
        String checkcode_server = (String) session.getAttribute ("CHECKCODE_SERVER");
        // 清除session中的旧验证码
        session.removeAttribute ("CHECKCODE_SERVER");
        // 判断验证码是否正确
        if("".equals (checkcode_server) || !checkcode_server.equalsIgnoreCase (verifycode)){
            session.setAttribute ("login_msg","验证码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
            return;
        }

        //判断用户名密码
        Service service = new ServiceImpl ();
        User user = service.login (username, password);

        if(user == null){
            session.setAttribute ("login_msg","用户名或密码错误");
            response.sendRedirect (request.getContextPath () + "/login.jsp");
        }else {
            session.setAttribute ("user",user);
            response.sendRedirect (request.getContextPath () + "/index.jsp");
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
