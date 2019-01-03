package com.heima.demolist.view;

import com.heima.demoLogin.dao.UserDao;
import com.heima.demoLogin.domain.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
    public static void main (String[] args) {
        showMyUser();
    }

    private static void showMyUser () {
        UserDao dao = new UserDao ();
        List<User> list = dao.findMyUser ();
        for (User user : list) {
            System.out.println ("编号：" + user.getId () + " 姓名：" + user.getUsername () + " 联系：" + user.getPassword () + " EMAIL：" + user.getEmail ());
        }
    }
}
