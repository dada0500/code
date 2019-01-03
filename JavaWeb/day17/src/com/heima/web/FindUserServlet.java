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

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");
        // 获取 表单提交的用户id
        String uid = request.getParameter ("uid");

        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();


        // 根据id查询用户信息
        User user = userService.findUserById(Integer.parseInt (uid));

        // 通过request域 共享 操作结果
        if(user != null){
            request.setAttribute ("user",user);
            request.getRequestDispatcher ("/update.jsp").forward (request,response);

        }else {
            request.setAttribute ("result","查找用户失败");
            request.getRequestDispatcher ("/update.jsp").forward (request,response);
        }
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
