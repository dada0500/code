package com.heima.ttt1;

import java.util.HashSet;
import java.util.Set;

/*
编写程序，判断字符串，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表。
 */
public class Demo02 {

    public static void main(String[] args) {
        String str = "abcdeafblmbnopawc";
        System.out.println("原字符串："+str);
        /*
        它不允许集合中出现重复元素。此类允许使用null元素。 底层其实就是HashMap
        虽说时Set是对于重复的元素不放入，倒不如直接说是底层的Map直接把原值替代了（这个Set的put方法的返回值真有意思）
        HashSet没有提供get()方法，愿意是同HashMap一样，Set内部是无序的，只能通过迭代的方式获得
         */
        Set<Character> set1 = new HashSet<Character>();//消除重复后的字符
        Set<Character> set2 = new HashSet<Character>();//重复的字符
        Set<Character> set3 = new HashSet<Character>();//不重复的字符

        //把字符串转为字符数组
        char[] cs = str.toCharArray();
        //遍历字符数组
        for (char c : cs) {
            //如果返回true，添加成功，否则添加失败
            boolean b = set1.add(c);
            //返回false，证明是重复的字符串
            if(!b){
                set2.add(c);
            }
        }
        System.out.println("set1:{}"+set1);
        System.out.println("set2:{}"+set2);
        /*
        做法1：遍历字符数组，判断set2集合中包含不包含字符，如果不包含就将值存到set3集合中
         */
        /*
        做法2：就是下面的
         */
        //把消除重复后的字符赋给set3
        set3.addAll(set1);
        //把消除重复后的字符 - 重复的字符 = 不重复的字符
        set3.removeAll(set2);
        System.out.println("====消除重复后的字符========");
        for (char c : set1) {
            System.out.print(c+" ");
        }

        System.out.println("\n====重复的字符========");
        for (char c : set2) {
            System.out.print(c+" ");
        }

        System.out.println("\n====不重复的字符========");
        for (char c : set3) {
            System.out.print(c+" ");
        }


    }
}
