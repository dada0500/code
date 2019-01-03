package com.heima.jsp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserBirthday {
    private int id;
    private String username;
    private Date birthday;

    /**
     * 逻辑视图
     * @return 返回格式化后的日期
     */
    @Override
    public String toString () {
        return "UserBirthday{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    public String getBirthdayStr(){
        if(birthday != null){
            // 转换日期格式为中文格式
            SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
            return sdf.format (birthday);
        }else{
            return "";
        }
    }

    public UserBirthday () {
    }

    public UserBirthday (int id, String username, Date birthday) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
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
}
