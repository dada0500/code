package com.heima.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiConsumer;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap ();
        map.forEach (new BiConsumer<String, String[]> () {
            @Override
            public void accept (String s, String[] strings) {
                System.out.print (s + " : " + Arrays.toString (strings));
            }
        });


        request.setCharacterEncoding ("utf-8");

        response.setContentType ("text/html;charset=utf-8");

        request.setAttribute ("TS","测试request域");
        request.getSession ().setAttribute ("Tss","TsessionT");
        request.getRequestDispatcher (request.getContextPath () +"/index.jsp").forward (request,response);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
