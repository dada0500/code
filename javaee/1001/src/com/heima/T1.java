package com.heima;
/*
1.	描述：（代码实现）
        创建一个Person类，有一个run方法 键盘录入石头或剪刀或布，判断 录入如果是石头，并将其打印，返回 1。如果是剪刀，返回2，如果是布，返回3 ，否则输出不符合要求，并继续循环，
        创建一个电脑类，里面也有一个run方法，方法自动生成一个1-3的数字，并打印如果是1，电脑出的：石头，如果是2，电脑出的：剪刀，如果是3：电脑出的是布
        在main方法中，分别调用两个方法，比较是人胜，还是电脑胜，还是平局
*/

import java.util.Random;
import java.util.Scanner;

public class T1 {
    public static void main (String[] args) {
        game ();
    }

    public static void game () {
        int p = new Person ().run ();

        System.out.println ("电脑出的是：");
        int c = new Computer ().run ();

        System.out.println ("结果：");
        if (p == c - 1 || (p == 3 && c == 1)) {
            System.out.println ("人胜");
        } else if (p == c) {
            System.out.println ("平局");
        } else {
            System.out.println ("电脑胜");
        }
    }

}

class Person {

    public static int run () {
        int n = 0;
        System.out.println ("“石头、剪刀、布”你出哪个：");

        out:
        while (true) {
            String s = new Scanner (System.in).nextLine ();
            switch (s) {
                case "石头":
                    n = 1;
                    break out;
                case "剪刀":
                    n = 2;
                    break out;
                case "布":
                    n = 3;
                    break out;
                default:
                    System.out.println ("输入错误，请重新输入：");
            }
        }
        return n;
    }
}

class Computer {
    int run () {
        String str;
        int r = new Random ().nextInt (3) + 1;
        switch (r) {
            case 1:
                str = "石头";
                break;
            case 2:
                str = "剪刀";
                break;
            case 3:
                str = "布";
                break;
            default:
                str = "程序出错";
        }
        System.out.println (str);
        return r;
    }
}
