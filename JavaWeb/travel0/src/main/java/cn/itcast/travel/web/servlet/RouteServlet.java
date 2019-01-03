package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.RouteServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/route/*")
public class RouteServlet extends BeanServlet {
    private RouteService service = new RouteServiceImpl ();

    public void getRouteList(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 获取请求参数
        Map<String, String[]> reqMap = req.getParameterMap ();

        // 查询线路
        PageBean<Route> pageBean = service.getRouteList(reqMap);

        // 响应查询到的线路数据
        writeValue (resp,pageBean);

    }

    public void getRouteDetail(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 获取route ：rid
        String ridStr = req.getParameter ("rid");
        int rid = 9;
        if(ridStr == null || "null".equals (ridStr)  || "".equals (rid)){
            rid = 1;
        }else {
            rid = Integer.parseInt (ridStr);
        }

        // 调用service执行查询
        Route route = service.getRouteDetail (rid);
        // 响应为json
        writeValue (resp,route);


    }
}
