package cn.itcast.ajax.web;

import cn.itcast.ajax.service.Service;
import cn.itcast.ajax.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUser")
public class FindUser extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType ("application/json;charset=utf-8");
        String name = request.getParameter ("name");

        // 返回 JSON
        Map<String,Object> map = new HashMap<> ();
        // 创建 Jackson的核心对象 ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper ();

        Service service = new ServiceImpl ();
        boolean flag = service.findUserByName(name);
//        if("tom".equals (name)){
        if(flag){
            map.put ("msg","此用户名太受欢迎，请换一个");
            map.put ("userExist",true);
        }else {
            map.put ("msg","用户名可用");
            map.put ("userExist",false);
        }

        objectMapper.writeValue (response.getOutputStream (),map);
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
