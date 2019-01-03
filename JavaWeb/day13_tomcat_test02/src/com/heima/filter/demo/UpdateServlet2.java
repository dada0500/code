package com.heima.filter.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet2")
public class UpdateServlet2 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println ("UpdateServlet2");
        request.getRequestDispatcher ("/filter2.jsp").forward (request,response);
//        response.sendRedirect (request.getContextPath () + "/filter.jsp");
        System.out.println ("update2");

        System.out.println ("request: " + request);
        System.out.println ("response: " + response);
        System.out.println ("------");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
