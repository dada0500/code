package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;

import java.util.List;
import java.util.Map;

public interface RouteService {
    PageBean<Route> getRouteList (Map<String, String[]> reqData);

    Route getRouteDetail (int rid);
}
