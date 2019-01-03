package com.itheima.util;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtil {
    ThreadLocal<Connection> t =  new ThreadLocal<Connection>();

    DataSource ds;

    public ConnectionUtil (DataSource ds) {
        this.ds = ds;
    }

    // 获取连接
    public Connection getConnection(){
        try {
            // 1.先从ThreadLocal上获取
            Connection conn = t.get ();
            // 2.如果获取不到
            if(conn == null){
                // 3.从连接池获取,并存入ThreadLocal
                 conn = ds.getConnection ();
                t.set (conn);
            }
            // 4.返回当前线程上的连接
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把连接和线程解绑
     */
    public void remove(){
        t.remove ();
    }
}
