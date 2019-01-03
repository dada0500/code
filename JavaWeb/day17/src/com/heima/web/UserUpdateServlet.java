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
import java.util.Map;

@WebServlet("/userUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
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


        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();


        // 增加用户信息
        boolean flag = userService.update (user);

        // 通过request域 共享 操作结果
        if(flag){
            request.getRequestDispatcher ("/userListServlet").forward (request,response);

        }else {
            request.setAttribute ("result","修改失败");
            request.getRequestDispatcher ("/update.jsp").forward (request,response);
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
