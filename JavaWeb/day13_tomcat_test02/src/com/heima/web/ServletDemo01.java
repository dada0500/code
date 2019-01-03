package com.heima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/sdemo",loadOnStartup = -1,name = "s_name",displayName = "s_disname")
public class ServletDemo01 implements Servlet{
    @Override
    public void init (ServletConfig servletConfig) throws ServletException {
        System.out.println ("s Demo01..init...");
    }

    @Override
    public ServletConfig getServletConfig () {
        System.out.println ("s Demo01..getServletConfig...");

        return null;
    }

    @Override
    public void service (ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println (servletRequest);
        System.out.println (servletResponse);

/*
        org.apache.catalina.connector.RequestFacade@8fc132f
        org.apache.catalina.connector.ResponseFacade@63bfc40

                */

        System.out.println ("s Demo01..hello Servlet..");
    }

    @Override
    public String getServletInfo () {
        System.out.println ("s Demo01..getServeletInfo...");

        return null;
    }

    @Override
    public void destroy () {
        System.out.println ("s Demo01..destroy...");

    }
}
