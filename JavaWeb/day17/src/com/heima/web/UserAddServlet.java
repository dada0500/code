package com.heima.web;

import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

@WebServlet("/userAddServlet")
public class UserAddServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");
        // 获取 表单提交的用户信息
        Map<String, String[]> parameterMap = request.getParameterMap ();
        // 封装信息为user对象
        User user = new User ();
        try {
            BeanUtils.populate (user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }

//        System.out.println ("addUser: " + user);
//        User{id=0, name='name', gender='null', age=0, address='null', qq='null', email='null'}

        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();


        // 增加用户信息
        boolean flag = userService.add (user);

        // 通过request域 共享 操作结果
        if(flag){
            request.setAttribute ("result","添加成功");
//            request.getRequestDispatcher ("/add.jsp").forward (request,response);
            response.sendRedirect (request.getContextPath () + "/add.jsp");
//            response.sendRedirect (request.getContextPath () + "/list.jsp");

        }else {
            request.setAttribute ("result","添加失败");
            request.getRequestDispatcher ("/add.jsp").forward (request,response);
//            response.sendRedirect (request.getContextPath () + "/list.jsp");
        }


        // 通过response重定向
//        response.sendRedirect ("/add.jsp");

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
