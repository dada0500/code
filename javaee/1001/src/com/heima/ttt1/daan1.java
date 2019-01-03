package com.heima.ttt1;

import java.util.Scanner;
public class daan1 {

    /*
    创建一个Person类，有一个run方法 键盘录入石头 剪刀 布，判断 录入如果是石头，并将其打印，返回 1。如果是剪刀，返回2，如果是布，返回3 ，否则输出不符合要求，并继续循环，
    创建一个电脑类，里面也有一个run方法，方法自动生成一个1-3的数字，并打印如果是1，电脑出的：石头，如果是2，电脑出的：剪刀，如果是3：电脑出的是布
        在main方法中，分别调用两个方法，比较是人胜，还是电脑胜，还是平局

     */
        public static void main(String[] args) {
            int num = Person.run();
            int run = Computers.run();
            int rel = num - run;   //因为是人减电脑

            if (rel == -1 || rel == 2) {
                System.out.println("人赢");
            }else if (rel == -2 || rel == 1) {
                System.out.println("电脑赢");
            }else {
                System.out.println("平局");
            }
        }

    }
    class Person {

        public static int run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入 剪刀 或 石头 或 布");
                String str = scanner.nextLine();
                switch (str) {
                    case "石头":
                        System.out.println("人出：石头");
                        return 1;
                    case "剪刀":
                        System.out.println("人出：剪刀");
                        return 2;
                    case "布":
                        System.out.println("人出：布");
                        return 3;

                    default:
                        System.out.println("输入不合法。请重新输入");
                        break;


                }
            }
        }
    }

    class Computers {
        public static int run() {
            int num = (int)(Math.random()*(3)+1);
//            System.out.println(num);
            switch (num) {
                case 1:
                    System.out.println("电脑出:石头");
                    break;
                case 2:
                    System.out.println("电脑出:剪刀");
                    break;
                case 3:
                    System.out.println("电脑出:布");
                    break;
                default:
                    break;
            }
            return num;
        }
    }
