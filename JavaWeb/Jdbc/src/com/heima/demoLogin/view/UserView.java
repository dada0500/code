package com.heima.demoLogin.view;

import com.heima.demoLogin.dao.UserDao;
import com.heima.demoLogin.domain.User;

import java.util.Scanner;

public class UserView {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入用户名：");
        String name = sc.nextLine ();
        System.out.println ("请输入密码：");
        String password = sc.nextLine ();

        UserDao dao = new UserDao ();
        User user = dao.login (name, password);

        if(user != null){
            System.out.println ("欢迎您" + user.getUsername ());
        }else {
            System.out.println ("登录失败");
        }
    }
}
