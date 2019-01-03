package com.heima.demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class Jte {
    public static void main (String[] args) {

        JdbcTemplate jdbctemplate = new JdbcTemplate (JdbcUtils.getDataSource ());
        int i = jdbctemplate.update ("UPDATE emp SET salary= ? where id=?",8000,1001);
        System.out.println ("影响了" + i + "行");
    }
}
