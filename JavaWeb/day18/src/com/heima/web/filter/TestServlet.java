package com.heima.web.filter;

import com.heima.domain.Cuser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter ("name");
        String msg = request.getParameter ("msg");

        String change = request.getParameter ("change");

        System.out.println (name +  " :  " + msg);
        System.out.println ("change:" + change);


        Cuser cuser = new Cuser ();
        String testCuser = cuser.getParameter ("testCuser");
        System.out.println ("testCuser: "+testCuser);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
