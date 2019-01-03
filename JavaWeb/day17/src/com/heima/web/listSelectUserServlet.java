package com.heima.web;

import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listSelectUserServlet")
public class listSelectUserServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码方式
//        response.setContentType ("text/html;charset=utf-8");

        // 获取 操作用户信息的 UserService 实现类对象
//        UserService userService = new UserServiceImpl ();


    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
