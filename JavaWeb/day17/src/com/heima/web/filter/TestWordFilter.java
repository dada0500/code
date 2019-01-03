package com.heima.web.filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/testWordFilter")
public class TestWordFilter extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter ("name");
        String msg = request.getParameter ("msg");

        System.out.println ("name:" + name);
        System.out.println ("msg:" + msg);


        String value = "张太阳大";
        List<String> list = new ArrayList<> ();
        list.add ("太阳");
        value.replaceAll (list.get (0),"***");
        System.out.println (value);

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
