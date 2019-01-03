package com.heima.view;

import com.heima.dao.UserDao;

import java.util.Scanner;

public class LoginTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("请输入用户名：");
        String user = sc.nextLine ();
        System.out.println ("请输入密码：");
        String password = sc.nextLine ();
        boolean flag = new UserDao ().login (user, password);
        if(flag){
            System.out.println ("登录成功");
        }else {
            System.out.println ("登录失败");
        }
    }
}
