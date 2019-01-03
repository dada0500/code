package com.itheima.util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 事务管理 ,设置自动提交事务,设置手动提交事务,提交事务,回滚事务
 */
public class TransactionManager {
    static ConnectionUtil connectionUtil;

    public TransactionManager (ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    /**
     * 设置自动提交事务
     */
    public static void setAutoCommit(){
        try {
            connectionUtil.getConnection ().setAutoCommit (true);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    /**
     * 设置手动提交事务
     */
    public static void setNotAutoCommit(){
        try {
            connectionUtil.getConnection ().setAutoCommit (false);
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    /**
     * 提交事务
     */
    public static void commit(){
        try {
            connectionUtil.getConnection ().commit ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    /**
     * 回滚事务
     */
    public static void rollback(){
        try {
            connectionUtil.getConnection ().rollback ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
    /**
     * 释放连接
     */
    public static void release(){
        try {
            connectionUtil.getConnection ().close ();
            connectionUtil.remove ();
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
