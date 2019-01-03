package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BeanServlet {
    private UserService service = new UserServiceImpl ();
    private ResultInfo info = new ResultInfo ();
    public void regist (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 校验验证码
        if(!checkCode (request, response)){
            return;
        };

        // 获取提交数据
        Map<String, String[]> map = request.getParameterMap ();

        // 封装提交数据为User
        User user = new User ();
        try {
            BeanUtils.populate (user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (InvocationTargetException e) {
            e.printStackTrace ();
        }

        // 注册用户
        boolean flag = service.registerUser(user);
        // 返回注册结果
        if(flag){
            // 注册成功
            info.setFlag (true);
        }else {
            // 注册失败
            info.setFlag (false);
            info.setErrorMsg ("注册失败");
        }
        // 将返回消息info转为JSON格式并返回
//        mapper.writeValue (response.getWriter (), info);
        writeValue (response, info);

    }

    private boolean checkCode (HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取用户提交的验证码
        String check = request.getParameter ("check");
        // 获取生成的验证码
        String checkcode_server = (String) request.getSession ().getAttribute ("CHECKCODE_SERVER");
        // 删除生成的验证码
        request.getSession ().removeAttribute ("CHECKCODE_SERVER");

        // 返回JSON格式的信息
//        ResultInfo info = new ResultInfo ();
//        ObjectMapper mapper = new ObjectMapper ();
        // 校验验证码是否正确
        if(checkcode_server == null || !checkcode_server.equalsIgnoreCase (check)){
            // 验证码错误，直接返回错误信息
            info.setFlag (false);
            info.setErrorMsg ("验证码错误");
//            mapper.writeValue (response.getWriter (),info);
            writeValue (response,info);
            return false;
        }
        return true;
    }

    public void active (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取激活码
        String code = request.getParameter ("code");
        response.setContentType ("text/html;charset=utf-8");
        if(code == null || "".equalsIgnoreCase (code)){
            response.getWriter ().write ("激活失败");
            return;
        }

        // 激活
        boolean flag = service.activeUser(code);
        if(flag){
            //激活成功
            response.getWriter ().write ("激活成功，请<a href='login.html'>登录</a>");
        }else {
            //激活失败
            response.getWriter ().write ("激活失败");
        }
    }

    public void login (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // 校验验证码
        if(!checkCode (request, response)){
            return;
        };
        // 获取提交的用户名、密码
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");

        // 登录检测
        User user = service.login(username,password);
        // 登录结果
        // 登录失败
        if(user == null){
            info.setFlag (false);
            info.setErrorMsg ("用户名或密码错误");
        }

        // 用户名、密码正确，但未激活
        if(user != null && !"Y".equals (user.getStatus ())) {
            info.setFlag (false);
            info.setErrorMsg ("您尚未激活，请激活");
        }

        // 用户名、密码正确，且已激活
        if(user != null && "Y".equals (user.getStatus ())) {
            // 登录成功
            info.setFlag (true);
            // 登录成功标记
            request.getSession ().setAttribute ("loginUser",user);
        }

        // 响应数据
        writeValue (response,info);
    }

    public void logout (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getSession ().invalidate ();
        response.sendRedirect (request.getContextPath () + "/login.html");
    }
    public void findLoginUser (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // 响应回 用户信息
        info.setData (request.getSession ().getAttribute ("loginUser"));
        writeValue (response,info);
    }
}
