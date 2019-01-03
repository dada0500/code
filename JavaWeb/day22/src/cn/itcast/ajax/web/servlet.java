package cn.itcast.ajax.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ajax")
public class servlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter ("username");
        String password = req.getParameter ("password");



        System.out.println (username + " - " + password);

//        resp.setContentType ("text/html;charset=utf-8");
//        resp.getWriter ().write ("hello: " + username);
        resp.getOutputStream ().print ("hello: " + username);


    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost (req, resp);
    }
}
