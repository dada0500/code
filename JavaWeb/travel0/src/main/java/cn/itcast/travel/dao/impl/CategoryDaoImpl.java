package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate (JDBCUtils.getDataSource ());
    /**
     * 获取 类别
     * @return
     */
    @Override
    public List<Category> getCategory (){
        String sql = "SELECT * FROM tab_category ORDER BY cid";
        List<cn.itcast.travel.domain.Category> list = null;
        try {
            list = jdbcTemplate.query (sql, new BeanPropertyRowMapper<Category> (Category.class));
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return list;
    }

    /**
     * 获取 类别
     * @return
     */
    @Override
    public Category getCategory (int cid){
        String sql = "SELECT * FROM tab_category WHERE cid = ?";
        Category category = null;
        try {
            category = jdbcTemplate.queryForObject (sql, new BeanPropertyRowMapper<Category> (Category.class),cid);
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return category;
    }
}
