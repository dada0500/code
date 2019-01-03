package com.heima.web.servlet;

import com.heima.domain.User;
import com.heima.service.Service;
import com.heima.service.impl.ServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //

        // 获取 验证码
        String checkcode_service = (String)request.getSession ().getAttribute ("CHECKCODE_SERVER");
        // 删除旧验证码
        request.getSession ().removeAttribute ("CHECKCODE_SERVER");
        request.removeAttribute ("CHECKCODE_SERVER");
        // 获取 用户输入的验证码
        String verifycode = request.getParameter ("verifycode");
        Map<String, String[]> map = request.getParameterMap ();
        User user = new User ();
        // 封装为user
        try {
            BeanUtils.populate (user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }

        if(!checkcode_service.equalsIgnoreCase (verifycode)){
            request.setAttribute ("login_msg", "验证码错误");
            request.getRequestDispatcher ("/login.jsp").forward (request,response);
            return;
        }

        Service service = new ServiceImpl ();
        User loginUser = service.login(user);
        System.out.println ("loginUser: " + loginUser);
        if(loginUser == null){
            request.setAttribute ("login_msg", "用户名或密码错误");
            request.getRequestDispatcher ("/login.jsp").forward (request,response);
            return;
        }else {
            request.getSession ().setAttribute ("user", loginUser);
            response.sendRedirect (request.getContextPath () + "/index.jsp");
            return;
        }


    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
