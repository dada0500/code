package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

public interface CategoryDao {

    /**
     *  获取所有类别
      * @return
     */
    List<Category> getCategory ();

    /**
     * 根据rid获取一个分类
     * @param rid
     * @return
     */
    Category getCategory (int cid);
}
