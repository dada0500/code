package com.heima.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(value = "/*",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class DispacherTest implements Filter {
    public void destroy () {
    }

    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println ("放行前filter执行");
        chain.doFilter (req, resp);
        System.out.println ("放行后filter执行");
    }

    public void init (FilterConfig config) throws ServletException {

    }

}
