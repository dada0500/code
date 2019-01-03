package com.heima.demo;

import java.util.List;

public class PageBean<T> {
    private int currentPage;
    private int rows;
    private int totalCount;
    private int totalPage;
    private List<T> list;

    @Override
    public String toString () {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", rows=" + rows +
                ", totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                '}';
    }

    public PageBean () {
    }

    public PageBean (int currentPage, int rows, int totalCount, int totalPage, List<T> list) {
        this.currentPage = currentPage;
        this.rows = rows;
        this.totalCount = totalCount;
        this.totalPage = totalPage;
        this.list = list;
    }

    public int getCurrentPage () {
        return currentPage;
    }

    public void setCurrentPage (int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows () {
        return rows;
    }

    public void setRows (int rows) {
        this.rows = rows;
    }

    public int getTotalCount () {
        return totalCount;
    }

    public void setTotalCount (int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage () {
        return totalPage;
    }

    public void setTotalPage (int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList () {
        return list;
    }

    public void setList (List<T> list) {
        this.list = list;
    }
}
