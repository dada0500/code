package cn.itcast.ajax.dao.impl;

import cn.itcast.ajax.dao.UserDao;
import cn.itcast.ajax.domain.City;
import cn.itcast.ajax.domain.County;
import cn.itcast.ajax.domain.Province;
import cn.itcast.ajax.util.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
    @Override
    public boolean findUserByName (String name) {
        return jt.queryForObject ("SELECT count(1) FROM USER WHERE NAME = ?",Boolean.class,name);
    }

    @Override
    public List<Province> getProvinces () {
        return jt.query ("SELECT * FROM province",new BeanPropertyRowMapper<Province> (Province.class));
    }

    @Override
    public List<City> getCitys (int provId) {
        return jt.query ("SELECT * FROM city WHERE pro_id = ?",new BeanPropertyRowMapper<City> (City.class),provId);
    }

    @Override
    public List<County> getCountys (int cityId) {
        return jt.query ("SELECT * FROM county WHERE city_id = ?",new BeanPropertyRowMapper<County> (County.class),cityId);
    }
}
