package test;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个Float：");
        float f = sc.nextFloat();
        System.out.println("输入的Float数字是：" + f);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        System.out.println("输入的数字是：" + n);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);


    }
}
