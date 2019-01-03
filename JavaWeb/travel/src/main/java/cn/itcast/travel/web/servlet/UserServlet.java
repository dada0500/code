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
    private UserService service = new UserServiceImpl();

    private boolean checkCode (HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取提交的验证码
        String checkcode_form = request.getParameter ("check");
        // 获取生成的验证码
        String checkcode_server = (String) request.getSession ().getAttribute ("CHECKCODE_SERVER");
        // 删除生成的验证码
        request.getSession ().removeAttribute ("CHECKCODE_SERVER");

        // 响应信息
        ResultInfo info = new ResultInfo ();
        if (checkcode_form == null || checkcode_form.length () == 0 || !checkcode_form.equalsIgnoreCase (checkcode_server)) {
            // 验证码错误
            info.setFlag (false);
            info.setErrorMsg ("验证码错误");
            // 响应 转换为JSON格式的info
            writeValue (response,info);
            return true;
        }
        return false;
    }

    public void active (HttpServletRequest request, HttpServletResponse response) throws IOException {
        String status = request.getParameter ("status");
        String code = request.getParameter ("code");

        if(code == null || code.equalsIgnoreCase ("")){
            response.getWriter ().write ("激活失败");
            return;
        }
        // 激活
        boolean flag = service.active (status,code);

        // 响应
/*        ResultInfo info = new ResultInfo ();
        info.setFlag (flag);
        request.getSession ().setAttribute ("info",info);*/
        if(flag){

            response.getWriter ().write ("激活成功<a href='login.html'>登录</a>");
        }else {
            response.getWriter ().write ("激活失败");
        }

    }

    public void regist (HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 校验验证码
        if(checkCode (request,response)){
            return;
        }

        // 获取提交数据
        Map<String, String[]> map = request.getParameterMap ();

        /*
        // 获取提交的验证码
        String checkcode_form = request.getParameter ("check");
        // 获取生成的验证码
        String checkcode_server = (String) request.getSession ().getAttribute ("CHECKCODE_SERVER");
        // 删除生成的验证码
        request.getSession ().removeAttribute ("CHECKCODE_SERVER");

        // 响应信息
        ResultInfo info = new ResultInfo ();
        ObjectMapper mapper = new ObjectMapper ();
        if(checkcode_form == null  || checkcode_form.length () == 0  || !checkcode_form.equalsIgnoreCase (checkcode_server)){
            // 验证码错误
            info.setFlag (false);
            info.setErrorMsg ("验证码错误");
            // 响应 转换为JSON格式的info
//            mapper.writeValue (response.getWriter (),info);
            return;
        }*/

        // 创建User,封装提交数据为user
        User user = new User ();
        try {
            BeanUtils.populate (user,map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace ();
        }

        // 注册
        boolean flag = service.register(user);

        // 注册结果// 响应信息
        ResultInfo info = new ResultInfo ();
        if(flag){
            // 注册成功
            info.setFlag (true);

        }else {
            // 注册失败
            info.setFlag (false);
            info.setErrorMsg ("注册失败");
        }

        // 响应 转换为JSON格式的info
        writeValue (response,info);
    }

    public void login (HttpServletRequest request, HttpServletResponse response) throws IOException{
        // 校验验证码
        if(checkCode (request,response)){
            return;
        }

        // 获取用户输入用户名密码
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");
        // 校验用户输入用户名密码，查询用户
        User user = service.findUser(username,password);

        // 查询结果：用户存在,且已激活
        ResultInfo info = new ResultInfo ();
        if(user != null && user.getStatus ().equals ("Y")){
            info.setFlag (true);
            request.getSession ().setAttribute ("loginuser",user); //设置登录标记
        }

        // 查询结果：用户存在,但未激活;
        if(user != null && !user.getStatus ().equals ("Y")){
            info.setFlag (false);
            info.setErrorMsg ("此账号尚未激活，请激活");
        }

        // 查询结果：用户不存在
        if(user == null){
            info.setFlag (false);
            info.setErrorMsg ("用户名或密码错误");
        }

        // 响应：
        writeValue (response,info);
    }

    public void loginUser (HttpServletRequest request, HttpServletResponse response) throws IOException{
        // 从session中获取用户
        User loginUser = (User) request.getSession ().getAttribute ("loginUser");
        // 响应给浏览器端
        writeValue (response,loginUser);
    }

    public void logout (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 销毁session
        request.getSession ().invalidate();
        // 转页面
        request.getRequestDispatcher ("login.html").forward (request,response);
    }
}
