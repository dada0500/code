package com.heima.servlet;

import java.io.IOException;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher ("/hello.jsp").forward (request,response);
    }

    protected void doGet (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost (request,response);
    }
}
