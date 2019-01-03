package cn.itcast.ajax.web;

import cn.itcast.ajax.domain.City;
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

@WebServlet("/getCity")
public class GetCity extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取当前省份id
        String provId = request.getParameter ("provId");

        // 响应体编码格式
        response.setContentType ("application/json;charset=utf-8");
        // 根据省id查询市
        Service service = new ServiceImpl ();
        response.getWriter ().write (service.rgetCity (provId));

/*        List<City> citys =  service.getCity(provId);

        // 转换为json格式
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.writeValue (response.getOutputStream (),citys);*/
        //  [{"id":1,"name":"郑州市","prov_id":0}]
//        System.out.println ("getCity: " + objectMapper.writeValueAsString (citys));
    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
