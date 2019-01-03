package com.heima.demo;

import com.heima.JdbcUtil01.JdbcUtilDruid01;
import com.heima.domain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Demo01_JdbcTemplate01 {
/*    练习：
            * 需求：
            1. 修改1号数据的 salary 为 10000
            2. 添加一条记录
            3. 删除刚才添加的记录
            4. 查询id为1的记录，将其封装为Map集合
            5. 查询所有记录，将其封装为List
            6. 查询所有记录，将其封装为Emp对象的List集合
            7. 查询总记录数*/

JdbcTemplate jdbcTemplate = new JdbcTemplate (JdbcUtilDruid01.getDataSource ());
    @Test
    public void test1(){
        int update = jdbcTemplate.update ("UPDATE emp SET salary=? WHERE id=?",8000,1001);
        System.out.println (update);
    }

    @Test
    public void test2(){
        int i = jdbcTemplate.update ("INSERT INTO emp (ename,job_id) VALUES (?,?)", "赵子龙", 5);
        System.out.println (i);
    }

    @Test
    public void test3(){
        int update = jdbcTemplate.update ("DELETE FROM emp WHERE id=?",1015);
        System.out.println (update);
    }

//    4. 查询id为1的记录，将其封装为Map集合
    @Test
    public void test4(){
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap ("SELECT * FROM emp WHERE id = ?", 1);
        System.out.println (stringObjectMap);
    }

    // 5. 查询所有记录，将其封装为List
    @Test
    public void test5(){
        List<Map<String,Object>> maps = jdbcTemplate.queryForList ("SELECT * FROM emp");
        maps.forEach (System.out::println);
    }


    // 6. 查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void test6(){
        List<Emp> emps = jdbcTemplate.query ("SELECT * FROM emp", new BeanPropertyRowMapper<Emp> (Emp.class));
        emps.forEach (System.out::println);
    }

    // 7. 查询总记录数
    @Test
    public void test7(){
        Long i = jdbcTemplate.queryForObject ("SELECT Count(1) FROM emp", Long.class);
        System.out.println (i);
    }
}
