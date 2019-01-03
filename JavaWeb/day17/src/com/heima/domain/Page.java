package com.heima.domain;

import java.util.List;

public class Page {
    private int userCount;
    private int pageCount;
    private int pageNum;
    private List<User> list;
    private int rows;

    @Override
    public String toString () {
        return "Page{" +
                "userCount=" + userCount +
                ", pageCount=" + pageCount +
                ", pageNum=" + pageNum +
                ", list=" + list +
                ", rows=" + rows +
                '}';
    }

    public Page (int userCount, int pageCount, int pageNum, List<User> list, int rows) {
        this.userCount = userCount;
        this.pageCount = pageCount;
        this.pageNum = pageNum;
        this.list = list;
        this.rows = rows;
    }

    public int getPageCount () {
        return pageCount;
    }

    public Page () {
    }

    public int getRows () {
        return rows;
    }

    public void setRows (int rows) {
        this.rows = rows;
    }

    public void setPageCount (int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageNum () {
        return pageNum;
    }

    public void setPageNum (int pageNum) {
        this.pageNum = pageNum;
    }

    public int getUserCount () {
        return userCount;
    }

    public void setUserCount (int userCount) {
        this.userCount = userCount;
    }

    public List<User> getList () {
        return list;
    }

    public void setList (List<User> list) {
        this.list = list;
    }
}
