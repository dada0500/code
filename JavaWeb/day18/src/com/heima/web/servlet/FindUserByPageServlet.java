package com.heima.web.servlet;

import com.heima.domain.Page;
import com.heima.domain.User;
import com.heima.service.Service;
import com.heima.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding ("utf-8");

        // 获取提交数据
        Map<String, String[]> condition = request.getParameterMap ();

        // 获取 page
        String currentPage = request.getParameter ("currentPage");
        String rows = request.getParameter ("rows");

        // 执行查询
        Service service = new ServiceImpl ();
        Page<User> pb = service.findUsersByPage(currentPage,rows,condition);

//         跳转，返回查询结果
        request.getSession ().setAttribute ("pb",pb);
        request.getSession ().setAttribute ("condition",condition);
        response.sendRedirect (request.getContextPath () + "/list.jsp");

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
