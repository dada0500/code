package com.heima.demo_login.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginFial")
public class FailServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter ("username");
        resp.setContentType ("text/html;charset=utf-8");
        resp.getWriter ().write ("登录失败，用户名或密码错误<br />");
//        System.out.println ("登录失败，用户名或密码错误");
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println ("SuccessServlet  ..  doGet();");
        this.doPost (req, resp);
    }
}
