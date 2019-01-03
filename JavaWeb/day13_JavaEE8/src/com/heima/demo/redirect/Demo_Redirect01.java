package com.heima.demo.redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect01")
public class Demo_Redirect01 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter ().println ("准备出发.>.");
        System.out.println ("准备出发rr");
//        response.sendRedirect ("dispatcher02");  //  成功重定向至http://localhost:8080/day13_javaee8/dispatcher02
//        response.sendRedirect ("/redirect02");  //  http://localhost:8080/redirect02
        response.sendRedirect ("redirect02");  //  成功重定向至http://localhost:8080/day13_javaee8/redirect02
//        response.sendRedirect ("./redirect02");  // 成功重定向至http://localhost:8080/day13_javaee8/redirect02
//        response.sendRedirect (request.getContextPath () + "./redirect02");  // http://localhost:8080/day13_javaee8./redirect02
//        response.sendRedirect (request.getContextPath () + "/redirect02");  // 成功重定向至http://localhost:8080/day13_javaee8/redirect02
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
