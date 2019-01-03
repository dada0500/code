package com.heima.filter.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(value = "/filter.jsp",dispatcherTypes = {DispatcherType.REQUEST})
public class Filter2 implements Filter {
    public void destroy () {
        System.out.println ("filter2... destroy");
    }

    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println ("filter2... doFilter");
        chain.doFilter (req, resp);
        System.out.println ("filter2... after。doFilter");
    }

    public void init (FilterConfig config) throws ServletException {
        System.out.println ("filter2... init");

    }

}
