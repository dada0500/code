package com.heima.logAndReg.View;

import com.heima.logAndReg.UserDao.UserDao;

import java.util.Scanner;

public class IndexView {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        lo:
        while (true){
            System.out.println ("请输入选项：");
            System.out.println ("1：登录  2：注册  3：退出");
            String select = sc.nextLine ();
            // 根据输入进行不同操作
            switch (select){
                case "1":
                    System.out.println ("请输入用户名：");
                    String username = sc.nextLine ();
                    System.out.println ("请输入密码：");
                    String password = sc.nextLine ();
                    // 根据返回值判断是否登录成功
                    boolean flag = UserDao.login(username,password);
                    if(flag){
                        System.out.println ("登录成功");
                    }else {
                        System.out.println ("登录失败");
                    }
                    break;
                case "2":
                    System.out.println ("请输入用户名：");
                    String reg_username = sc.nextLine ();
                    System.out.println ("请输入密码：");
                    String reg_password = sc.nextLine ();

                    // 根据返回值判断是否注册成功
                    boolean regflag = UserDao.register(reg_username,reg_password);
                    if(regflag){
                        System.out.println ("注册成功");
                    }else {
                        System.out.println ("注册失败");
                    }
                    break;
                case "3":
                default:
                    System.out.println ("退出");
                    break lo;
//                    System.exit (0);
            }
        }
    }
}
