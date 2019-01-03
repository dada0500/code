package cn.itcast.ajax.test;

import cn.itcast.ajax.util.JedisUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class otest {

    @Test
    public void ot() throws JsonProcessingException {
        Jedis jedis = JedisUtil.getJedis ();
        Map<String, String> city = jedis.hgetAll ("city");
        System.out.println (city);
        ObjectMapper mapper = new ObjectMapper ();
        String string = mapper.writeValueAsString (city);
        System.out.println (string);
    }
}


