package com.heima.web;

import com.heima.domain.User;
import com.heima.service.UserService;
import com.heima.service.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/userDelServlet")
public class UserDelServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码格式
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");

        // 获取 表单提交的用户id
//        String uid = request.getParameter ("uid");
//        String[] uids = request.getParameterValues ("uid");
        String uidstr = request.getParameter("uid");
        String[] uids = uidstr.split (",");
        // 如果uid为空,则不进行删除操作
        if( uids == null || uids.length < 1) {
//            request.setAttribute ("result", "删除null失败");
//            request.getRequestDispatcher ("/userListServlet").forward (request, response);
            request.getSession ().setAttribute ("result", "删除null失败");
            response.sendRedirect ("/userListServlet");
            return;
        }


        // 获取 操作用户信息的 UserService 实现类对象
        UserService userService = new UserServiceImpl ();

        // 遍历 uids ，删除用户信息
        int uid1 = 0;
        for (String uid : uids) {
            // 转为int类型
            try {
                uid1 = Integer.parseInt (uid);
                // 删除用户信息
                userService.del (uid1);
            } catch (NumberFormatException e) {
                request.setAttribute ("result", "删除失败");
                request.getRequestDispatcher ("/userListServlet").forward (request, response);
                return;
            }
        }

        request.setAttribute ("result","删除成功");
        request.getRequestDispatcher ("/userListServlet").forward(request,response);

/*        // 通过request域 共享 操作结果
        if(flag){
            request.setAttribute ("result","删除成功");
        }else {
            request.setAttribute ("result","删除失败");
        }
        request.getRequestDispatcher ("/userListServlet").forward(request,response);*/


    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
