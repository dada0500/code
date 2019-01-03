package cn.itcast.ajax.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisUtils2 {
    private JedisUtils2(){}

    private static JedisPool jedisPool;

    static{
        // 读取配置文件
        InputStream is = JedisUtils2.class.getClassLoader ().getResourceAsStream ("jedis.properties");
        Properties pro = new Properties ();
        // 加载配置文件
        try {
            pro.load (is);
        } catch (IOException e) {
            e.printStackTrace ();
        }

        // 读取数据，设置到JedisPoolConfig中
        JedisPoolConfig config = new JedisPoolConfig ();
        config.setMaxTotal (Integer.parseInt (pro.getProperty ("maxTotal")));
        config.setMaxIdle (Integer.parseInt (pro.getProperty ("maxIdle")));

        // 初始化JedisPool连接池
        jedisPool = new JedisPool (config,pro.getProperty ("host"),Integer.parseInt ("port"));
    }

    // 获取连接的方法
    public static Jedis getJedis(){
        return jedisPool.getResource ();
    }
}
