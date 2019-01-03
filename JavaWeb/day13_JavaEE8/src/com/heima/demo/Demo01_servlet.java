package com.heima.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet({"/demo01/serv","/demo02"})
public class Demo01_servlet implements Servlet {
    @Override
    public void init (ServletConfig servletConfig) throws ServletException {
        System.out.println ("初始化。。。");
    }

    @Override
    public ServletConfig getServletConfig () {
        return null;
    }

    @Override
    public void service (ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println ("sev。。。");

    }

    @Override
    public String getServletInfo () {
        return null;
    }

    @Override
    public void destroy () {

    }
}
