package cn.itcast.ajax.service;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Map;

public class JedisTest {

    @Test
    public void testHash(){
        // 1. 创建jedis连接
        Jedis jedis = new Jedis ();

        // 2. 操作
        // 存储 hash
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");
        // 获取
        String name = jedis.hget ("user", "name");
        System.out.println ("user name:" + name);
        // 获取所有
        Map<String, String> users = jedis.hgetAll ("user");
        // 遍历 users
        for (String key : users.keySet ()) {
            System.out.println (key + " : " + users.get(key));
        }

        // 关闭连接
        jedis.close();
    }

    @Test
    public void testString(){
        // 1. 创建连接
        Jedis jedis = new Jedis();
        // 2. 操作
        // 添加 String
        String set = jedis.set ("jkey1", "jvalue1");
        System.out.println (set);

        // 3. 关闭连接
        jedis.close();
    }
    @Test
    public void testList(){
        JedisPoolConfig config = new JedisPoolConfig ();

        // 1. 创建连接
        Jedis jedis = new Jedis();
        // 2. 操作
        // 添加 String
        jedis.set ("list", "lValue1");
       jedis.zadd ("sorted", 01,"b");

        // 3. 关闭连接
        jedis.close();
    }
}
