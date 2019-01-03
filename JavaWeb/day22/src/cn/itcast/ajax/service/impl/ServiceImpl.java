package cn.itcast.ajax.service.impl;

import cn.itcast.ajax.dao.UserDao;
import cn.itcast.ajax.dao.impl.UserDaoImpl;
import cn.itcast.ajax.domain.City;
import cn.itcast.ajax.domain.County;
import cn.itcast.ajax.domain.Province;
import cn.itcast.ajax.service.Service;
import cn.itcast.ajax.util.JedisUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class ServiceImpl implements Service {
    UserDao userDao = new UserDaoImpl ();
    @Override
    public boolean findUserByName (String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public List<Province> getProvinces () {
        return userDao.getProvinces();
    }
    @Override
    public String rgetProvinces () {
        Jedis jedis = JedisUtil.getJedis ();
        String province = jedis.get ("province");
        if(province == null || province.length () == 0){
            System.out.println ("从mysql数据库查询Province");
            // 从mysql数据库查询
            List<Province> provinces = userDao.getProvinces ();
            // 转换为JSON格式
            ObjectMapper mapper = new ObjectMapper ();
            try {
                province = mapper.writeValueAsString (provinces);
                jedis.set ("province",province);
            } catch (JsonProcessingException e) {
                e.printStackTrace ();
            }finally {
                System.out.println ("closeProvinceJedis");
                jedis.close ();
            }
        }else {
            System.out.println ("从redis查询Province");
        }
        jedis.close ();
        return province;
    }

    @Override
    public List<City> getCity (String provIdStr) {
        int provId = Integer.parseInt (provIdStr);
        return userDao.getCitys(provId);
    }

    @Override
    public String rgetCity (String provIdStr) {
        Jedis jedis = JedisUtil.getJedis ();
        String city = jedis.hget ("city",provIdStr);
        if(city == null || city.length () == 0){
            System.out.println ("从mysql数据库查询City");
            // 从mysql数据库查询
            List<City> citys = getCity (provIdStr);
            // 转换为JSON格式
            ObjectMapper mapper = new ObjectMapper ();
            try {
                city = mapper.writeValueAsString (citys);
                jedis.hset ("city",provIdStr,city);
            } catch (JsonProcessingException e) {
                e.printStackTrace ();
            }finally {
                System.out.println ("closeCityJedis");
                jedis.close ();
            }
        }else {
            System.out.println ("从redis查询City");
        }
        jedis.close ();
        return city;

/*   jedis.hgetAll("city")
        {"1":"[{\"id\":1,\"name\":\"郑州市\",\"prov_id\":0},{\"id\":2,\"name\":\"开封市\",\"prov_id\":0}]","2":"[{\"id\":3,\"name\":\"石家庄市\",\"prov_id\":0},{\"id\":4,\"name\":\"石北市\",\"prov_id\":0}]","3":"[{\"id\":5,\"name\":\"长沙市\",\"prov_id\":0},{\"id\":6,\"name\":\"湘潭市\",\"prov_id\":0}]","4":"[{\"id\":7,\"name\":\"武汉市\",\"prov_id\":0},{\"id\":8,\"name\":\"武北市\",\"prov_id\":0}]"}
*/
    }
    @Override
    public List<County> getCounty (String cityIdStr) {
        int cityId = Integer.parseInt (cityIdStr);
        return userDao.getCountys(cityId);
    }
    @Override
    public String rgetCounty (String cityIdStr) {
        // 创建连接
        Jedis jedis = JedisUtil.getJedis ();
        String county = jedis.hget ("county",cityIdStr);
        // 如果redis中不存在county，则查询mysql数据库
        if(county == null || county.length () == 0){
            System.out.println ("从mysql数据库查询County");
            List<County> countys = getCounty (cityIdStr);
            // 转换为JSON格式
            ObjectMapper mapper = new ObjectMapper ();
            try {
                county = mapper.writeValueAsString (countys);
                jedis.hset ("county",cityIdStr,county);
            } catch (JsonProcessingException e) {
                e.printStackTrace ();
            }finally {
                System.out.println ("closeCountyJedis");
                jedis.close ();
            }
        }else {
            System.out.println ("从redis查询County");
        }
        jedis.close ();
        return county;
    }
}
