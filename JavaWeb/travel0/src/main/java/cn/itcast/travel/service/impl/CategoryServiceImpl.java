package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JacksonUtils;
import cn.itcast.travel.util.JedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.OrderedBidiMap;
import redis.clients.jedis.Jedis;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao cateGoryDao = new CategoryDaoImpl ();
    @Override
    public List<Category> getCategory () {
        Jedis jedis = JedisUtil.getJedis ();
        String category_json = jedis.get ("category_json");
        List<Category> category_list;

        if(category_json == null || category_json.equals ("")){
            System.out.println ("从数据库查询");

            category_list = cateGoryDao.getCategory ();
            category_json = JacksonUtils.getJson (category_list);
            jedis.set ("category_json",category_json);
        }else {
            category_list = JacksonUtils.jsonToList (category_json, Category.class);
            System.out.println ("从redis查询");
        }

        return category_list;
    }
}
