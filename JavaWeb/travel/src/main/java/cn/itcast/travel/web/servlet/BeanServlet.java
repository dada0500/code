package cn.itcast.travel.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // 获取uri中的方法名
            String uri = request.getRequestURI ();
            String methodName = uri.substring (uri.lastIndexOf ("/")+1);
            // 获取方法，调用方法
            Method method = this.getClass ().getMethod (methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke (this,request,response);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    protected void writeValue (HttpServletResponse response,Object o) throws IOException {
        ObjectMapper mapper = new ObjectMapper ();
        mapper.writeValue (response.getWriter (),o);
    }

    protected String writeValueAsString (Object o) throws IOException {
        ObjectMapper mapper = new ObjectMapper ();
        return mapper.writeValueAsString (o);
    }
}
