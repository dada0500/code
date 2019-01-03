package com.heima.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demoGetCookie")
public class demoGetCookie extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3.获取Cookie
        Cookie[] cookies = request.getCookies ();
        if(cookies != null){
            System.out.println ("==============");
            for (Cookie cookie : cookies) {
                String name = cookie.getName ();
                String value = cookie.getValue ();
                String comment = cookie.getComment ();
                String path = cookie.getPath ();
                String domain = cookie.getDomain ();
                int maxAge = cookie.getMaxAge ();
                boolean secure = cookie.getSecure ();
                int version = cookie.getVersion ();

                System.out.println ("name: " + name );  // JSESSIONID
                System.out.println ("value: "+ value);   // 715FF13556EDA7B74726FD8F43AB071D
                System.out.println ("comment: " + comment); // null
                System.out.println ("path: " + path); // null
                System.out.println ("domain: " + domain); // null
                System.out.println ("maxAge: " + maxAge); // -1
                System.out.println ("secure: " + secure); // false
                System.out.println ("version: " + version); // 0
                System.out.println ("------");
            }
        }else {
            System.out.println ("cookie null");
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
