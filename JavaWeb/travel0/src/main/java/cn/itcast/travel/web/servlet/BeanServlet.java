package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanServlet extends HttpServlet {
    /**
     * 通过反射获取执行此方法的类的方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过反射获取执行此方法的类的方法
        // 1. 通过uri获取方法名
        String uri = req.getRequestURI ();
        String methodName = uri.substring (uri.lastIndexOf ('/')+1);

        try {
            // 2. 反射获取方法
            Method method = this.getClass ().getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            // 3. 调用 方法
            method.invoke (this,req,resp);
        } catch (Exception e) {
            System.out.println ("------ BeanServlet错误:service start -------");
            e.printStackTrace ();
            System.out.println ("------ BeanServlet错误:service end -------");
        }
    }

    /**
     * 将对象序列化为JSON格式并写出到客户端
     * @param resp
     * @param o
     * @throws IOException
     */
    public void writeValue(HttpServletResponse resp , Object o) throws IOException {
        ObjectMapper mapper = new ObjectMapper ();
        mapper.writeValue (resp.getWriter (),o);
    }

    /**
     * 返回将对象序列化为JSON格式的字符串
     * @param o
     * @return
     * @throws JsonProcessingException
     */
    public String writeValueAsString(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper ();
        return mapper.writeValueAsString (o);
    }

}
