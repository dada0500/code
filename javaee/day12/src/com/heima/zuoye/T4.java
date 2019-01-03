package com.heima.zuoye;

//练习四：成员方法引用、可变参数

import java.util.Arrays;
import java.util.Random;
public class T4 {
    public static void main (String[] args) {
        int num = 10;
        int test = 11;
        RandomUtil ru = new RandomUtil ();

//        System.out.println (ru.nextInt ());

        System.out.println ("随机数: ");
        System.out.println ("1 - " + num + " : ");
//        getRandomNumFromOneToNum (num, (n) -> ru.nextInt (n));
        getRandomNumFromOneToNum (num, ru::nextInt);

        int a = 5;
        int b = 9;
        System.out.println (a + " - " + b + " : ");
        getRandomNumFromAToB (a, b , (n) -> ru.nextInt (n));
        getRandomNumFromAToB (a, b ,ru::nextInt);

        int[] arr = {11,22,33};
        System.out.println (Arrays.toString (arr) + "中随机: ");
//        getRandomNumFromArray (arr,(n) -> ru.nextInt (n));
        getRandomNumFromArray (arr,ru::nextInt);

    }

    // 3.	在测试类中定义static void getRandomNumFromOneToNum(int num , NumberSupplier ns)
    static void getRandomNumFromOneToNum(int num, NumberSupplier ns){
        System.out.println (ns.getNum (1,num));
    }

    // 4.	在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns)
    static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
        System.out.println (ns.getNum (a, b));
    }

    // 5.	在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns)
    static void getRandomNumFromArray(int[] nums, NumberSupplier ns){
        System.out.println (ns.getNum (nums));
    }
}

//2.	定义一个函数式接口NumberSupplier
@FunctionalInterface
interface NumberSupplier{
    int getNum(int...nums);
}


// 1. 已知有随机数工具类如下：
class RandomUtil {
    private Random random = new Random ();

    public int nextInt(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("pls认真一点！");
        }
        //生成1到nums[0](包含1和nums[0])之间的随机数
        if (nums.length == 1) return random.nextInt(nums[0]) + 1;

        //生成nums[0]到nums[1](包含nums[0]和nums[1])之间的随机数
        // 10, 20
        // 21 – 10 -> 11		-> 0 – 10
        // num + 10;
        if (nums.length == 2) return random.nextInt(nums[1] + 1 - nums[0]) + nums[0];

        //从数组nums中取出一个随机元素
        return nums[random.nextInt(nums.length)];
    }
}