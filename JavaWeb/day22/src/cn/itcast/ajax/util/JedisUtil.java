package cn.itcast.ajax.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.Properties;

public class JedisUtil {
    private JedisUtil(){}
    private static JedisPool pool;

    static{
        Properties pro = new Properties ();
        try {
            pro.load (JedisUtil.class.getClassLoader ().getResourceAsStream ("jedis.properties"));
        } catch (IOException e) {
            e.printStackTrace ();
        }

        JedisPoolConfig config = new JedisPoolConfig ();
        config.setMaxTotal (Integer.parseInt (pro.getProperty ("maxTotal")));
        config.setMaxIdle (Integer.parseInt (pro.getProperty ("maxIdle")));
        pool = new JedisPool (config,pro.getProperty ("host"),Integer.parseInt (pro.getProperty ("port")));

    }

    public static Jedis getJedis(){
        return pool.getResource ();
    }
}
