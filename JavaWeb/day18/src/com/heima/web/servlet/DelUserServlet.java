package com.heima.web.servlet;

import com.heima.service.Service;
import com.heima.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delUserServlet")
public class DelUserServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取 uid
        String id = request.getParameter ("id");

        // 获取service对象
        Service service = new ServiceImpl ();
        service.deleltUser(Integer.parseInt (id));

        // 跳转到userListServlet
        response.sendRedirect (request.getContextPath () + "/userListServlet");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
