package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.dao.SellerDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.dao.impl.RouteImgDaoImpl;
import cn.itcast.travel.dao.impl.SellerDaoImpl;
import cn.itcast.travel.domain.*;
import cn.itcast.travel.service.RouteService;

import java.util.List;
import java.util.Map;

public class RouteServiceImpl implements RouteService {
    private RouteDao routeDao = new RouteDaoImpl ();
    private CategoryDao categoryDao = new CategoryDaoImpl ();
    private SellerDao sellerDao = new SellerDaoImpl ();
    private RouteImgDao routeImgDao = new RouteImgDaoImpl ();

    @Override
    public PageBean<Route> getRouteList (Map<String, String[]> reqData) {
        // 获取各个提交数据的字符串形式
        // 线路分类cid
        String cidStr = "";
        // 线路的部分名称

        String route = "";
        // 每页显示的条数
        String pageSizeStr = "";
        // 当前页
        String currentPageStr ="";
        try {
            cidStr = reqData.get ("cid")[0];} catch (Exception e) {

        }
        try{
            route = reqData.get ("route")[0];
            route = new String(route.getBytes ("iso-8859-1"),"utf-8");
        } catch (Exception e) {

        }
        try{
            pageSizeStr = reqData.get ("pageSize")[0];} catch (Exception e) {

        }
        try{
            currentPageStr = reqData.get ("currentPage")[0];
        } catch (Exception e) {

        }
        int cid = 0;
        if (cidStr != null && !"null".equals (cidStr) && !"".equals (cidStr)) {
            cid = Integer.parseInt (cidStr);
        }

        // pageBean.totalCount
        // 根据 线路的部分名称、分类cid 查询符合条件线路数据总数
        int totalCount = routeDao.getRouteCount (cid, route);

        // pageBean.pageSize
        // 每页显示的记录数pageSize / 也是分页end条件
        int pageSize = 5;
        if (pageSizeStr != null && !pageSizeStr.equals ("")) {
            pageSize = Integer.parseInt (pageSizeStr);
        }
        if (pageSize < 0 || pageSize > 50) {
            pageSize = 5;
        }

        // pageBean.totalPage
        int totalPage = (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;

        // pageBean.currentPage
        // 当前页currentPage
        int currentPage = 1;
        if (currentPageStr != null && !currentPageStr.equals ("")) {
            currentPage = Integer.parseInt (currentPageStr);
        }

        if (currentPage > totalPage && totalPage > 0) {
            currentPage = totalPage;
        }

        if (currentPage <= 0) {
            currentPage = 1;
        }

        // 计算出分页查询的start条件
        int start = (currentPage - 1) * pageSize;
        // pageBean.list<Route>
        // 根据 线路的部分名称、分类cid 及分页start,end(pageSize) 信息查询符合条件的一页线路数据记录
        List<Route> list = routeDao.getRoute(cid, route, start ,pageSize);


        // 创建PageBean并返回
        PageBean<Route> pageBean = new PageBean<> (totalPage,totalCount,currentPage,pageSize,list);
        return pageBean;
    }

    @Override
    public Route getRouteDetail (int rid) {
/*        private int rid;//线路id，必输
        private String rname;//线路名称，必输
        private double price;//价格，必输
        private String routeIntroduce;//线路介绍
        private String rflag;   //是否上架，必输，0代表没有上架，1代表是上架
        private String rdate;   //上架时间
        private String isThemeTour;//是否主题旅游，必输，0代表不是，1代表是
        private int count;//收藏数量
        private int cid;//所属分类，必输
        private String rimage;//缩略图
        private int sid;//所属商家
        private String sourceId;//抓取数据的来源id

        private Category category;//所属分类
        private Seller seller;//所属商家
        private List<RouteImg> routeImgList;//商品详情图片列表*/


/*
    private int rgid;//商品图片id
    private int rid;//旅游商品id
    private String bigPic;//详情商品大图
    private String smallPic;//详情商品小图*/

        // 根据 rid 获取 route信息、分类信息、卖家信息
        Route route = routeDao.getRoute (rid);

        // 根据 rid 获取 routeImg ，存进list集合,设置RouteBean的List<RouteImg>的值
        List<RouteImg> routeImglist = routeImgDao.getRouteImgList(rid);
        // 设置RouteBean的List<RouteImg>的值
        route.setRouteImgList (routeImglist);

        // 根据 rid 获取 category ，存进route
        Category category = categoryDao.getCategory(route.getCid ());
        route.setCategory (category);

        // 根据 rid 获取 category ，存进route
        Seller seller = sellerDao.getSeller(route.getSid ());
        route.setSeller (seller);

        // 返回最终查询到route
        return route;
    }
}
