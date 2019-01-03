package cn.itcast.ajax.dao;

import cn.itcast.ajax.domain.City;
import cn.itcast.ajax.domain.County;
import cn.itcast.ajax.domain.Province;

import java.util.List;

public interface UserDao {
    boolean findUserByName (String name);

    List<Province> getProvinces ();

    List<City> getCitys (int provId);

    List<County> getCountys (int cityId);
}
