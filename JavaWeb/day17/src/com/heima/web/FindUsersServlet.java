package com.heima.web;

import com.heima.domain.Page;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/findUsersServlet")
public class FindUsersServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");

        // 获取提交信息，提取用户信息
//        Map<String, String[]> map = request.getParameterMap ();
        Map<String, String[]> condition = request.getParameterMap ();


//        System.out.println ("condition"+condition);
        HashMap<String, String[]> map2 = new HashMap<> ();
        map2.putAll (condition);
//        System.out.println ("map2"+map2);

        // 执行查询
        UserService service = new UserServiceImpl ();
        Page page = service.findUsersToPage (condition);

        // 返回查询结果
        request.getSession ().setAttribute ("map", condition);
        request.getSession ().setAttribute ("condition", map2);
        request.getSession ().setAttribute ("page", page);
        response.sendRedirect (request.getContextPath () + "/list.jsp");
//       response.sendRedirect (request.getContextPath () + "/index.jsp");

/*        request.setAttribute("page", page);
        request.setAttribute("map", map);
        request.getRequestDispatcher ("/list.jsp").forward (request,response);*/
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
