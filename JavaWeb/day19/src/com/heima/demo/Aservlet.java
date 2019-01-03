package com.heima.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aservlet")
public class Aservlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println ("aservlet");
//        request.getRequestDispatcher ("/filter.jsp").f-orward (request,response);
        response.sendRedirect (request.getContextPath () + "/login.jsp");
        System.out.println ("after_redirect_aservlet");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
