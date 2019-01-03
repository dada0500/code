package com.heima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demoCookie")
public class Demo_cookie01 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 1. 创建Cookie对象
        Cookie cookie3 = new Cookie ("msg3", "hello3");
        Cookie cookie4 = new Cookie ("msg4", "hello4");
        Cookie cookie1 = new Cookie ("msg", "hello5");
        Cookie cookie2 = new Cookie ("msg", "hello6");

    // 2. 发送Cookie
        response.addCookie (cookie3);
        response.addCookie (cookie4);
        response.addCookie (cookie1);
        response.addCookie (cookie2);

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
