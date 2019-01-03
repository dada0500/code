package cn.itcast.travel.service;

import cn.itcast.travel.domain.Page;
import cn.itcast.travel.domain.Route;

public interface RouteService {
    Page<Route> getRoutes (String cid, String currentPage, String pageSize, String rname);
}
