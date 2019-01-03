package cn.itcast.ajax.service;

import cn.itcast.ajax.domain.City;
import cn.itcast.ajax.domain.County;
import cn.itcast.ajax.domain.Province;

import java.util.List;

public interface Service {
    boolean findUserByName (String name);

    List<Province> getProvinces ();

    String rgetProvinces ();

    List<City> getCity (String provId);

    String rgetCity (String provIdStr);

    List<County> getCounty (String provId);

    String rgetCounty (String cityIdStr);
}
