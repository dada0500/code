package stringmethod;

import java.util.Scanner;

public class Demo5_StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：格式为 张三，23");

        //录入学生信息
        String info = sc.next();

        //根据逗号切割字符串
        String[] sArr = info.split("，");

        String name = sArr[0];
        String age = sArr[1];

        System.out.println("输入的信息是：姓名：" + name + "年龄：" + age);
    }
}
