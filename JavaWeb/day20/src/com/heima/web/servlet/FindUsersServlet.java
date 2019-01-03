package com.heima.web.servlet;

import com.heima.demo.PageBean;
import com.heima.domain.User;
import com.heima.service.Service;
import com.heima.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/findUsersServlet")
public class FindUsersServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*        // 获取 当前页
        String currentPage = request.getParameter ("currentPage");
        // 获取 每页显示记录数
        String rows = request.getParameter ("rows");*/
        // 获取 全部请求参数，包括page信息与查询条件
        Map<String, String[]> condition = request.getParameterMap ();

        // 查询
        Service service = new ServiceImpl ();
        PageBean<User> pb = service.findUsersByPage(condition);

        // 返回结果
        request.setAttribute ("pb", pb);
        request.setAttribute ("condition", condition);
        request.getRequestDispatcher ("/list.jsp").forward (request,response);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
