package com01.itheima.domain;

import java.util.List;
import java.util.Map;

public class Account {
    private String name;
    private User zs;
    private List<User> lie;
    private Map<String ,User> kv;

    @Override
    public String toString () {
        return "Account{" +
                "name='" + name + '\'' +
                ", zs=" + zs +
                ", lie=" + lie +
                ", kv=" + kv +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public User getZs () {
        return zs;
    }

    public void setZs (User zs) {
        this.zs = zs;
    }

    public List<User> getLie () {
        return lie;
    }

    public void setLie (List<User> lie) {
        this.lie = lie;
    }

    public Map<String, User> getKv () {
        return kv;
    }

    public void setKv (Map<String, User> kv) {
        this.kv = kv;
    }
}
