package com.heima.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update2")
public class Update2 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println ("UpdateServlet2");
        request.getRequestDispatcher ("/login.jsp").forward (request,response);
//        response.sendRedirect (request.getContextPath () + "/login.jsp");
        System.out.println ("update2");

        System.out.println ("request2: " + request);
        System.out.println ("response2: " + response);
        System.out.println ("---2---");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
