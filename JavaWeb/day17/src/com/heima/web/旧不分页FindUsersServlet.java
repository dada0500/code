package com.heima.web;

import com.heima.domain.Page;
import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/旧不分页findUsersServlet")
public class 旧不分页FindUsersServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding ("utf-8");

        // 获取提交信息，提取用户信息
        Map<String, String[]> map = request.getParameterMap ();

/*
        // 封装成user对象
        User user = new User ();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }
*/

        // 执行查询
        UserService service = new UserServiceImpl ();
        List<User> users = service.findUsers(map);

        // 返回查询结果
        request.getSession ().setAttribute ("users", users);

        response.sendRedirect (request.getContextPath () + "/list.jsp");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
