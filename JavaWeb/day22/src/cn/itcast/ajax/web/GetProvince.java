package cn.itcast.ajax.web;

import cn.itcast.ajax.domain.Province;
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

@WebServlet("/getProvince")
public class GetProvince extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 查询省份列表
        Service service = new ServiceImpl ();
        // 使用redis优化缓存查询
        String province = service.rgetProvinces ();
        // 设置响应体格式
        response.setContentType ("application/json;charset=utf-8");
        // 响应
        response.getWriter ().write (province);

        // 不使用redis优化缓存，查询省份列表
//        List<Province> list = service.getProvinces();
        // 创建Jackson的核心对象ObjectMapper
//        ObjectMapper objectMapper = new ObjectMapper ();

        // 转换list为JSON，并写出到响应头
//        objectMapper.writeValue (response.getWriter (),list);
        // [{"id":2,"name":"河北省"},{"id":1,"name":"河南省"},{"id":4,"name":"湖北省"},{"id":3,"name":"湖南省"}]
//        System.out.println ("getProvince: " + objectMapper.writeValueAsString (list));

    }

    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost (request, response);
    }
}
