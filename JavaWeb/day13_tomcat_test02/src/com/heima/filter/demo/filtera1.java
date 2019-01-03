package com.heima.filter.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(value = "/*",dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class filtera1 implements javax.servlet.Filter {
    @Override
    public void init (FilterConfig filterConfig) throws ServletException {
        System.out.println ("filter1...init...");
    }

    @Override
    public void doFilter (ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println ("filter1执行。。");

//        servletRequest.getRequestDispatcher ("/filter.jsp").forward (servletRequest,servletResponse);
        filterChain.doFilter (servletRequest, servletResponse);


        System.out.println ("放行后filter1。。");
        System.out.println ("----filter1----");
    }

    @Override
    public void destroy () {
        System.out.println ("filter...destroy...");

    }
}
