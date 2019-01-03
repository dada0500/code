package com.heima.demo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class Demo01_c3p0 {
    public static void main (String[] args) {
        ComboPooledDataSource ds = new ComboPooledDataSource ();
        DataSource ds2 = new ComboPooledDataSource ();

    }
}
