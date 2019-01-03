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

@WebServlet("/findUsersByPage")
public class FindUsersByPage extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码
        request.setCharacterEncoding ("utf-8");

        // 获取提交参数
        // 当前页
        String currentPage = request.getParameter ("currentPage");
        String rows = request.getParameter ("rows");

        // 查询条件
        Map<String, String[]> condition = request.getParameterMap ();


        // 判断提交是否有效
        if(currentPage == null || currentPage == ""){
            currentPage = "1";
        }
        if(rows == null || rows == ""){
            rows = "5";
        }

        // 执行查询
        Service service = new ServiceImpl ();
        Page<User> pb = service.findUsersByPage (currentPage, rows,condition);

        // 返回结果给页面
        request.setAttribute ("pb",pb);
        request.setAttribute ("condition",condition);
        request.getRequestDispatcher ("/list.jsp").forward (request,response);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
