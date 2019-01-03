package cn.itcast.travel.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class Filter implements javax.servlet.Filter {
    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        if(request.getMethod ().equalsIgnoreCase ("post")){
            request.setCharacterEncoding ("utf-8");
        }
        HttpServletResponse response = (HttpServletResponse)resp;
        response.setContentType ("application/json;charset=utf-8");
        chain.doFilter (request, response);
    }

    public void destroy () {
    }

    public void init (FilterConfig config) throws ServletException {

    }

}
