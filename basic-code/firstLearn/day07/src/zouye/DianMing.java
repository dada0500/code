package zouye;

import java.util.Random;
import java.util.Scanner;

public class DianMing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int count = sc.nextInt();
        String[] studentsName = new String[count];
        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学姓名：");
            studentsName[i] = sc.next();
        }
        System.out.println("姓名录入完成。");
        Random r = new Random();
        int n = r.nextInt(count);
        System.out.println("随机点名：");
        System.out.println(studentsName[n]);
    }
}

///*
//
//
//		public class Test1_Random {
//	    /**
//	     * 需求:
//	     *      键盘录入班级学生姓名, 然后完成随机点名的效果
//	     *
//	     *  1. 创建Scanner对象, 用于键盘录入
//	     *  2. 提示用户输入班级人数, 根据用户输入的整数, 动态的创建数组容器
//	     *  3. 将键盘录入的姓名, 存储到容器当中
//	     *
//	     *  4. 创建Random随机数对象
//	     *
//	     *          String[] sArr = new String[3];
//	     *
//	     *          0  1  2
//	     *
//	     *          r.nextInt(3);   // 0  1  2
//	     *  5. 根据数组的长度产生随机数, 根据产生的随机数当做索引去数组中获取元素
//	     *  6. 将获取到的元素打印在控制台
//	     */
//public static void main(String[] args) {
//        // 1. 创建Scanner对象, 用于键盘录入
//        Scanner sc = new Scanner(System.in);
//        // 2. 提示用户输入班级人数, 根据用户输入的整数, 动态的创建数组容器
//        System.out.println("请输入班级的人数:");
//        int length = sc.nextInt();
//        String[] sArr = new String[length];
//
//        // 3. 将键盘录入的姓名, 存储到容器当中
//        for (int i = 0; i < sArr.length; i++) {
//        System.out.println("请输入第" + (i+1) + "个学生的姓名:");
//        // 将键盘录入的姓名, 循环的存储到容器的对应位置
//        sArr[i] = sc.next();
//        }
//
//        System.out.println("数据录入完成:");
//        System.out.println(Arrays.toString(sArr));
//
//        // 4. 创建Random随机数对象
//        Random r = new Random();
//
//        // 5. 根据数组的长度产生随机数, 根据产生的随机数当做索引去数组中获取元素
//        int index = r.nextInt(sArr.length);     // 3    -> 0 1 2
//
//        // 6. 将获取到的元素打印在控制台
//        System.out.println(sArr[index]);
//        }
//        }
//
//
// */
