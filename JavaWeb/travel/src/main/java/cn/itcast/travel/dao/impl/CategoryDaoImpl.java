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
    @Override
    public List<Category> getCategory () {
        try {
            return jdbcTemplate.query ("SELECT * FROM tab_category",new BeanPropertyRowMapper<> (Category.class));
        } catch (DataAccessException e) {
            e.printStackTrace ();
        }
        return null;
    }
}
