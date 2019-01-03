package cn.itcast.travel.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class AllFilter implements Filter {
    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
/*
        req.setCharacterEncoding ("utf-8");
        resp.setContentType ("application/json;charset=utf-8");
        chain.doFilter (req, resp);
*/

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String method = request.getMethod ();
        if(method.equalsIgnoreCase ("post")){
            request.setCharacterEncoding ("utf-8");
        }
        response.setContentType ("application/json;charset=utf-8");
        chain.doFilter (request, response);
    }

    public void destroy () {
    }

    public void init (FilterConfig config) throws ServletException {

    }

}
