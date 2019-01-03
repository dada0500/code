package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.Page;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.RouteService;
import cn.itcast.travel.service.impl.RouteServletImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/route/*")
public class RouteServlet extends BeanServlet {
    RouteService routeService = new RouteServletImpl ();
    public void getRoutes (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cid = request.getParameter ("cid");
        String currentPage = request.getParameter ("currentPage");
        String pageSize = request.getParameter ("pageSize");
        String rname = request.getParameter ("rname");

        Page<Route> page = routeService.getRoutes(cid,currentPage,pageSize,rname);

        writeValue(response,page);
    }
}
