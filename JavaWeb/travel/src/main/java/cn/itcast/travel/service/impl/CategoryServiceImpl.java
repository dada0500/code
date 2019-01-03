package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {
    CategoryDao categoryDao = new CategoryDaoImpl ();

    @Override
    public List<Category> getCategory () {
        Jedis jedis = JedisUtil.getJedis ();
        Set<Tuple> category_zset = jedis.zrangeWithScores ("category_zset", 0, -1);
        System.out.println ("category_zset: "+category_zset);
        List<Category> categoryList = new ArrayList<> ();
        if(category_zset == null || category_zset.size () == 0){
            // 从数据库查询
            categoryList = categoryDao.getCategory ();
            for (Category category : categoryList) {
                jedis.zadd ("category_zset",category.getCid (),category.getCname ());
            }
            System.out.println ("从数据库中查询分类");
            category_zset = jedis.zrangeWithScores ("category_zset", 0, -1);
        }

        for (Tuple tuple : category_zset) {
            Category category = new Category ();
            category.setCid ((int)tuple.getScore ());
            category.setCname (tuple.getElement ());
            categoryList.add (category);
        }

        return categoryList;
    }
}
