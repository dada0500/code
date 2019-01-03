package com.heima.domain;

import java.util.List;

public class Page<T> {
    private Integer currentPage;
    private Integer totalPage;
    private Integer totalCount;
    private List<T> list;
    private Integer rows;

    @Override
    public String toString () {
        return "Page{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                ", list=" + list +
                ", rows=" + rows +
                '}';
    }

    public Page () {
    }

    public Page (Integer currentPage, Integer totalPage, Integer totalCount, List<T> list, Integer rows) {
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.list = list;
        this.rows = rows;
    }

    public Integer getCurrentPage () {
        return currentPage;
    }

    public void setCurrentPage (Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage () {
        return totalPage;
    }

    public void setTotalPage (Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount () {
        return totalCount;
    }

    public void setTotalCount (Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList () {
        return list;
    }

    public void setList (List<T> list) {
        this.list = list;
    }

    public Integer getRows () {
        return rows;
    }

    public void setRows (Integer rows) {
        this.rows = rows;
    }
}
