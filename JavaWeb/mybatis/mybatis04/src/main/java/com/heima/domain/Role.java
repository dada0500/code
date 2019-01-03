package com.heima.domain;

import java.util.List;

public class Role {
    private Integer id;
    private String name;
    private String desc;

    private List<User> users;

    public List<User> getUser () {
        return users;
    }

    public void setUser (List<User> users) {
        this.users = users;
    }

    @Override
    public String toString () {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDesc () {
        return desc;
    }

    public void setDesc (String desc) {
        this.desc = desc;
    }
}
