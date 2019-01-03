package com.heima.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dispatcher01")
public class Demo14_httpServlet_requestDispatcher extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet (req, resp);
        System.out.println ("dispatcher01 get:");
        System.out.println (req);
        System.out.println (resp);

        req.setAttribute ("attr1","context/张三");
//        req.getRequestDispatcher("ntlias-stu.boxuegu.com/#/login").forward (req,resp);
//        req.getRequestDispatcher("./dispatcher02").forward (req,resp);

        req.getRequestDispatcher("./redireckt02").forward (req,resp);  ///day13_javaee8/redireckt02
//        req.getRequestDispatcher("redireckt02").forward (req,resp);  ///day13_javaee8/redireckt02
//        req.getRequestDispatcher("Login.html").forward (req,resp);
//        req.getRequestDispatcher("/dispatcher02").forward (req,resp);
//        req.getRequestDispatcher(req.getContextPath () + "./dispatcher02").forward (req,resp);
//        req.getRequestDispatcher(req.getContextPath () + "/dispatcher02").forward (req,resp); // 404  /day13_javaee8/day13_javaee8/dispatcher02
        System.out.println ("------");
    }

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost (req, resp);
        System.out.println ("dispatcher01 post:");
        System.out.println (req);
        System.out.println (resp);
//        req.getRequestDispatcher("/WEB-INF/class/com/heima/demo/dispatcher02").forward (req,resp);  // 错
        System.out.println ("------");
    }
}
