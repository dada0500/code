package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

//@WebServlet("/registerUserServlet")
public class RegisterUserServlet extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户提交的验证码
        String check = request.getParameter ("check");
        // 获取生成的验证码
        String checkcode_server = (String) request.getSession ().getAttribute ("CHECKCODE_SERVER");
        // 删除生成的验证码
        request.getSession ().removeAttribute ("CHECKCODE_SERVER");

        // 返回JSON格式的信息
        ResultInfo info = new ResultInfo ();
        ObjectMapper mapper = new ObjectMapper ();
        // 校验验证码是否正确
        if(checkcode_server == null || !checkcode_server.equalsIgnoreCase (check)){
            // 验证码错误，直接返回错误信息
            info.setFlag (false);
            info.setErrorMsg ("验证码错误");
            mapper.writeValue (response.getWriter (),info);
            return;
        }

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
        UserService service = new UserServiceImpl ();
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
        mapper.writeValue (response.getWriter (), info);

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
