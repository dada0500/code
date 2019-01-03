package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class RouteDaoImpl implements RouteDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (JDBCUtils.getDataSource ());
    //        rid | rname| price | routeIntroduce| rflag |  rdate | isThemeTour | count | cid | rimage | sid | sourceId

    @Override
    public int getRouteCount (int cid, String rname) {
        StringBuilder sql = new StringBuilder ("SELECT COUNT(1) FROM tab_route WHERE 1=1 ");
        List<Object> paras = new ArrayList<> ();
        if(cid > 0){
            sql.append (" AND cid = ? ");
            paras.add (cid);
        }
        if(rname != null && !"null".equals (rname) && !"".equals (rname)){
            sql.append (" AND rname LIKE ? ");
            paras.add ("%" + rname + "%");
        }

        int count = 0;
        try {
            count = jdbcTemplate.queryForObject (sql.toString (), Integer.class,paras.toArray ());
        } catch (DataAccessException e) {
            System.out.println ("----- 错误：int getRouteCount   start -----");
            e.printStackTrace ();
            System.out.println ("----- 错误：int getRouteCount   end -----");
        }
        return count;
    }

    @Override
    public List<Route> getRoute (int cid, String rname, int start, int end) {
        StringBuilder sql = new StringBuilder ("SELECT * FROM tab_route WHERE 1=1 ");
        List<Object> paras = new ArrayList<> ();
        if(cid > 0){
            sql.append (" AND cid = ? ");
            paras.add (cid);
        }
        if(rname != null && !"null".equals (rname) && !"".equals (rname)){
            sql.append (" AND rname LIKE ? ");
            paras.add ("%" + rname + "%");
        }
        sql.append (" LIMIT ?,?");
        paras.add (start);
        paras.add (end);

        List<Route> list = null;
        try {
            list = jdbcTemplate.query (sql.toString (), new BeanPropertyRowMapper<Route> (Route.class),paras.toArray ());
        } catch (DataAccessException e) {
            System.out.println ("----- 错误：List<Route> getRoute   start -----");
            e.printStackTrace ();
            System.out.println ("----- 错误：List<Route> getRoute   end -----");
        }

        return list;
    }

    @Override
    public Route getRoute (int rid) {
        String sql = "SELECT * FROM tab_route WHERE rid = ?";
        Route route = null;
        try {
            route = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<> (Route.class), rid);
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return route;
    }

}
