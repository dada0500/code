package com.heima.zuoye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class T11 {
    public static void main (String[] args) {
/*        2.	学生信息与成绩如下：
        姓名	数学
        谢霆锋	85
        章子怡	63
        刘亦菲	77
        黄晓明	33
        岑小村	92*/
        Student stu1 = new Student ("谢霆锋", 85);
        Student stu2 = new Student ("章子怡", 63);
        Student stu3 = new Student ("刘亦菲", 77);
        Student stu4 = new Student ("黄晓明", 33);
        Student stu5 = new Student ("岑小村", 92);

/*        3.	在测试类中完成如下要求
        a)	将五名学生添加到ArrayList集合
        b)	使用Collections.sort(List<T> list, Comparator<? super T> c)方法将学生成绩从小到大进行排序（忽略非空判断）
        i.	使用匿名内部类
        ii.	使用Lambda表达式
        iii.	使用方法引用	//tips:借助Comparator接口中静态方法comparingInt()方法
        */
        ArrayList<Student> list = new ArrayList<> ();
        Collections.addAll (list, stu1, stu2, stu3, stu4, stu5);

       // System.out.println (list);
        // ii.	使用Lambda表达式
//        Collections.sort (list, (o1, o2) -> o1.getScore () - o2.getScore ());
      //  System.out.println (list);
        // i.	使用匿名内部类
/*        Collections.sort (list, new Comparator<Student> () {
            @Override
            public int compare (Student o1, Student o2) {
                return o1.getScore () - o2.getScore ();
            }
        });*/
        // iii.	使用方法引用	//tips:借助Comparator接口中静态方法comparingInt()方法
        Collections.sort (list,Comparator.comparingInt(Student::getScore));
        System.out.println (list);
    }
}


/*
练习十一：综合练习
        1.	定义学生类:
        a)	成员变量 姓名：String name;
        b)	成员变量 成绩：int score；
        c)	无参及全参构造
        d)	重写toString()*/
class Student {
    private String name;
    private int score;

    public Student () {
    }

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getScore () {
        return score;
    }

    public void setScore (int score) {
        this.score = score;
    }
}


