package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;

import java.util.List;

public interface RouteDao {
    int getRouteCount (int cid, String rname);

    List<Route> getRoute (int cid, String rname, int start, int end);

    Route getRoute (int rid);
}
