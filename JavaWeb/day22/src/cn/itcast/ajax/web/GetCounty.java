package cn.itcast.ajax.web;

import cn.itcast.ajax.domain.City;
import cn.itcast.ajax.domain.County;
import cn.itcast.ajax.service.Service;
import cn.itcast.ajax.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getCounty")
public class GetCounty extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 获取当前城市id
        String cityId = request.getParameter ("cityId");

        // 响应体编码格式
        response.setContentType ("application/json;charset=utf-8");
        // 根据省id查询市
        Service service = new ServiceImpl ();
        String county = service.rgetCounty (cityId);
        // 响应
        response.getWriter ().write (county);

/*        List<County> countys =  service.getCounty(provId);

        // 转换为json格式
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.writeValue (response.getOutputStream (),countys);*/
        // [{"id":2,"name":"封县","city_id":2}]
//        System.out.println ("getCounty: " + objectMapper.writeValueAsString (countys));
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
