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

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码方式
//        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;utf-8");

        // 每页显示15条
        int rows = 10;
        // 转换页码为数字类型
        // 获取 当前页
        int currentPage = 1;
        String pageNum = request.getParameter ("pageNum");
        // 转换页码为数字类型
        if(pageNum == null || pageNum == ""){
            currentPage = 1;
        }else {
            currentPage = Integer.parseInt (pageNum);
        }
        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();
        // 总记录数
        int userCount = userService.getUserCount ();
        // 总页数
        int pageCount = userCount / rows;

        if(currentPage >= pageCount ){
            currentPage = pageCount;
        }

        if(currentPage <= 0 ){
            currentPage = 1;
        }
        // 分页查询条件：start
        int start = (currentPage - 1) * rows;
        // 执行查询
//        List<User> users = userService.findAll ();
        List<User> users = userService.findAllLimitOnePage (start,rows);
        // 封装为Bean对象：Page
        if(userCount % rows != 0){
            pageCount++;
        }
        Page page = new Page(userCount,pageCount,currentPage,users,rows);

        // 通过request域 共享 获取到的用户信息
//        request.setAttribute ("page",page);
//        request.getRequestDispatcher ("/list.jsp").forward(request,response);
        request.getSession ().setAttribute ("page",page);
        response.sendRedirect (request.getContextPath () + "/list.jsp");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
