package cn.itcast.web.servlet;

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
import java.util.Map;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置请求编码
        request.setCharacterEncoding ("utf-8");
        // 获取请求参数
        Map<String, String[]> map = request.getParameterMap ();

        // 封装为JavaBean对象
        User user = new User();

        try {
            BeanUtils.populate (user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        };

        // 查询所有用户
        Service service = new ServiceImpl ();
        service.addUser (user);

        // 显示用户
        response.sendRedirect (request.getContextPath() + "/findUserByPageServlet");
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
