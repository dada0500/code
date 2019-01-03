package com.heima.domain;

import java.util.Date;
import java.util.List;

public class User2 {
    private Integer id;
    private String username;
    private Date birthday;
    private Character sex;
    private String address;

    private List<Role> roles;

    public List<Role> getRoles () {
        return roles;
    }

    public void setRoles (List<Role> roles) {
        this.roles = roles;
    }

    private List<Account> accounts;

    public List<Account> getAccounts () {
        return accounts;
    }

    public void setAccounts (List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public Date getBirthday () {
        return birthday;
    }

    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    public Character getSex () {
        return sex;
    }

    public void setSex (Character sex) {
        this.sex = sex;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }
}
