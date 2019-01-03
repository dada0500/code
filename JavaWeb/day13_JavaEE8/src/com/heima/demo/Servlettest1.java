package com.heima.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlettest1")
public class Servlettest1 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet (request,response);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext ();
        String realPath = context.getRealPath ("Login.html");
        System.out.println (realPath);
//        response.getWriter ().println (realPath);
        String serverName = request.getServerName ();
        System.out.println ("serverName: " + serverName);
//        response.setStatus (200);
        response.setStatus (302);
        response.setHeader ("location","Login.html");
    }
}
