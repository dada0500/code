package com.heima.demo_login.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successFial")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter ("username");
        resp.setContentType ("text/html;charset=utf-8");
        resp.getWriter ().write ("登录成功！" + username + "，欢迎您<br />");
//        System.out.println ("登录成功！" + username + "，欢迎您");
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println ("SuccessServlet  ..  doGet();");
        this.doPost (req, resp);
    }
}
