package com.heima.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy () {
    }

    public void doFilter (ServletRequest sreq, ServletResponse sresp, FilterChain chain) throws ServletException, IOException {
        // 强转req
        HttpServletRequest req = (HttpServletRequest) sreq;

        // 获取session中的user
        Object user = req.getSession ().getAttribute ("user");

        // 获取uri 判断uri ，放行 login相关
        String uri = req.getRequestURI ();
        StringBuffer url = req.getRequestURL ();
        // 判断 user
        if(user != null || uri.contains ("/login") || uri.contains ("/Login")  || uri.contains ("/css") || uri.contains ("/js") || uri.contains ("/findUsersByPage") || uri.contains ("/checkCode")){
            // 已登录，放行
            chain.doFilter (sreq, sresp);
        }else {
//            req.getRequestDispatcher("/login.jsp").forward (sreq,sresp);
            HttpServletResponse resp = (HttpServletResponse) sresp;
            resp.sendRedirect (req.getContextPath () + "/login.jsp");
        }


      /*  if(uri.contains ("/login") || uri.contains ("/Login")  ){

        }*/

    }

    public void init (FilterConfig config) throws ServletException {

    }

}
