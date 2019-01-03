package com.heima.demo_login.View;

import com.heima.demo_login.Dao.UserDao;
import com.heima.demo_login.Domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/login")
public class CheckLogin extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
      /*  BufferedReader reader = req.getReader ();
        String line;
        while((line = reader.readLine ()) != null){
            line..
        }*/
        //1.设置request编码
        req.setCharacterEncoding ("utf-8");
        resp.setContentType ("text/html;charset=utf-8");

        HttpSession session = req.getSession ();
        String checkCode = (String)session.getAttribute ("checkCode");

        session.removeAttribute ("checkCode");

        String inCode = req.getParameter ("checkCode");

        if(checkCode == null || !checkCode.equalsIgnoreCase (inCode)){
            session.setAttribute ("error","验证码错误");
//            resp.getWriter ().println ("验证码错误");
//            System.out.println ("checkCode !=");
            resp.sendRedirect (req.getHeader ("Referer"));
//            resp.sendRedirect (req.getContextPath () + "/Login.html");
//            System.out.println ("checkCode: " + checkCode);
//            System.out.println ("inCode: " + inCode);
            return;
        }else {
            System.out.println ("checkCode: " + checkCode);
            System.out.println ("inCode: " + inCode);


            Map<String, String[]> parameterMap = req.getParameterMap ();
            User loginuser = new User ();
            try {
                BeanUtils.populate (loginuser,parameterMap);
            } catch (IllegalAccessException e) {
                e.printStackTrace ();
            } catch (InvocationTargetException e) {
                e.printStackTrace ();
            }

            System.out.println ("JavaBean user:" + loginuser);


            String username = req.getParameter ("username");
            String password = req.getParameter ("password");

            resp.getWriter ().write ("登录的用户名：" + username + "密码：" + password + "<br />");
    //        System.out.println ("登录的用户名：" + username + "密码：" + password);
            User user = new UserDao ().checkLogin (username, password);
            if(user != null){
//                req.getRequestDispatcher ("/successFial").forward (req,resp);
                session.setAttribute ("error","登录成功");
                resp.sendRedirect (req.getHeader ("Referer"));
            }else {
//                req.getRequestDispatcher ("/loginFial").forward (req,resp);
                session.setAttribute ("error","登录失败");
                resp.sendRedirect (req.getHeader ("Referer"));
            }
        }
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost (req, resp);
    }
}
