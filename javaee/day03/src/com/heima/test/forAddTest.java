package com.heima.test;

import java.util.Iterator;
import java.util.LinkedList;

public class forAddTest{
        public static void main(String[] args) {
            // 1.定义QQ号码数组String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
            String[] strs = { "12345", "67891", "2347809933", "98765432102", "67891", "12347809933" };

            // 2.创建LinkedList
            LinkedList<String> qqList = new LinkedList<> ();

            // 3.遍历strs获取每个qq号码
            for (String qq : strs) {
                // 4.判断LinkedList是否已经存在这个qq号码
                if (!qqList.contains(qq)) {
                    // 5.不存在这个qq号码则添加到LinkedList中
                    qqList.add(qq);
                }
            }

            // 6.增强for遍历
            for (String qq : qqList) {
                System.out.println(qq);
            }
            System.out.println("------------------");

            // 7.迭代器遍历
            Iterator<String> iterator = qqList.iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                System.out.println(string);
            }
        }
}

