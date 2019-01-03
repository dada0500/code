package com.heima.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/getSession")
public class Demo_GetSesseion01 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession ();
        System.out.println ("getSession: " + session);

        String id = session.getId ();
        System.out.println ("sessionid: "+id);

        String checkcode = (String)session.getAttribute ("checkcode");
        System.out.println ("getcheckcode： " + checkcode);

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
