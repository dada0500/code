package com.heima.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/setSession")
public class Demo_SetSesseion01 extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = "abcd";

        HttpSession session = request.getSession ();
        System.out.println ("设置session: " + session);
        session.setAttribute ("checkcode",code);
/*        Cookie sId = new Cookie ("JSESSIONID",session.getId ());
        sId.setMaxAge (60 * 60);  // 1小时
        response.addCookie (sId);*/
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
