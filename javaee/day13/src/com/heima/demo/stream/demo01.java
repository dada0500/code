package com.heima.demo.stream;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class demo01 {
/*    需求:

    现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）
    依次进行以下若干操作步骤：

            1. 第一个队伍只要名字为3个字的成员姓名；
            2. 第一个队伍筛选之后只要前3个人；
            3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前2个人；
            5. 将两个队伍合并为一个队伍；
            6. 根据姓名创建Person对象；
            7. 打印整个队伍的Person对象信息。
    */
    public static void main (String[] args) {
        List<String> list1 = List.of("迪丽热巴", "宋远桥", "苏星河", "石破天", "石中玉", "老子", "庄子", "洪七公");
        List<String> list2 = List.of("古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯广坤", "张天爱", "张二狗");

        Stream<String> s1 = list1.stream ().filter (s -> s.length () == 3).limit (3);
        Stream<String> s2 = list2.stream ().filter (s -> s.contains ("张")).skip (2);


        Stream<String> s3 = Stream.concat (s1, s2);
        s3.map (s -> new Person (s)).forEach (System.out::println);
    }
}

class Person{
    private String name;

    public Person () {
    }

    public Person (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}