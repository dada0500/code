package com.heima.domain;

import java.util.List;

public class PojoVo {

    private List<Integer> ids;
    private User user;

    @Override
    public String toString () {
        return "PojoVo{" +
                "ids=" + ids +
                ", user=" + user +
                '}';
    }

    public List<Integer> getIds () {
        return ids;
    }

    public void setIds (List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }
}
