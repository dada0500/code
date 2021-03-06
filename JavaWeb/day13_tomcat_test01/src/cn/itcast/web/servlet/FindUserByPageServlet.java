package cn.itcast.web.servlet;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.Service;
import cn.itcast.service.impl.ServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/findUserByPageServlet")
public class FindUserByPageServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求编码
        request.setCharacterEncoding ("utf-8");
        // 获取请求参数
        Map<String, String[]> condition = request.getParameterMap ();

        String currentPage = request.getParameter ("currentPage");
        String rows = request.getParameter ("rows");


        // 查询所有用户
        Service service = new ServiceImpl ();
        PageBean<User> pb = service.findUsersByPage (currentPage,rows,condition);

        // 返回结果
        request.getSession ().setAttribute ("pb", pb);
        request.getSession ().setAttribute ("condition", condition);
        response.sendRedirect (request.getContextPath() + "/list.jsp");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
