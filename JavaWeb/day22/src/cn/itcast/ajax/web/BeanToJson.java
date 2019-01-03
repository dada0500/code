package cn.itcast.ajax.web;

import cn.itcast.ajax.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/beanToJson")
public class BeanToJson extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user1 = new User ("张三",23,"男",new Date (1111));
        User user2 = new User ("张三",23,"男",new Date (1111));
        User user3 = new User ("张三",23,"男",new Date (1111));
        User user4 = new User ("张三",23,"男",new Date (1111));


        // 创建Jacson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper ();
        String string = objectMapper.writeValueAsString (user1);
        objectMapper.writeValue (response.getWriter (),user1);
        objectMapper.writeValue (response.getOutputStream (),user1);
        System.out.println (string);


    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
