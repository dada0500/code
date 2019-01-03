package com.heima.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dispatcher02")
public class Demo14_requestDispatcher_09 extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet (req, resp);
        resp.setContentType ("text/html;charset=utf-8");
        resp.getWriter().println ("09 get:");
        System.out.println ("09 get:");
        System.out.println (req);
        System.out.println (resp);
        Object attr1 = req.getAttribute ("attr1");
        resp.getWriter ().println (attr1);
        System.out.println (attr1);
        System.out.println ("------");
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost (req, resp);
        System.out.println ("09 post:");
        System.out.println (req);
        System.out.println (resp);
        System.out.println ("------");
        this.doGet (req,resp);
    }
}
