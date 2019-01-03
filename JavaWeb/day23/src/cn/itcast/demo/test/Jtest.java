package cn.itcast.demo.test;

import cn.itcast.demo.util.JedisUtil;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Jtest {
    @Test
    public void test(){
        Jedis jedis = new Jedis ();
        String string = jedis.get ("myString");
        System.out.println("0:" + string);

        Jedis jedis1 = JedisUtil.getJedis ();
        jedis1.echo("myHash");
    }
}
