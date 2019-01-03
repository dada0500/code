package cn.itcast.travel.service.impl;

import cn.itcast.travel.domain.Page;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.RouteService;

public class RouteServletImpl implements RouteService {
    RouteDao routeDao = new RouteDaoImpl();

    @Override
    public Page<Route> getRoutes (String cidStr, String currentPageStr, String pageSizeStr, String rname) {
        if(cidStr != null && !"".equals (cidStr)){

        }
        int cid = Integer.parseInt (cidStr);
        int currentPage = Integer.parseInt (currentPageStr);
        int pageSize= Integer.parseInt (pageSizeStr);


        routeDao.getRoutes();
        return null;
    }
}
