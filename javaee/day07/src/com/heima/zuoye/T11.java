package com.heima.zuoye;
/*
	练习十一：Lambda（省略格式）练习
        问题：对Java基础班学生的考试成绩进行排序
        1.	定义一个学生类，有两个属性。姓名，考试成绩
        2.	在测试类中定义一个学生数组，存储学生信息。
        3.	使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
*/

import java.util.Arrays;

public class T11 {
    public static void main (String[] args) {
        Student[] strArr = {
                new Student ("黄磊", 98),
                new Student ("黄渤", 88),
                new Student ("孙红雷", 96),
                new Student ("张艺兴", 80),
                new Student ("王迅", 86),
                new Student ("罗志祥", 82)
        };
        Arrays.sort (strArr, (o1, o2) -> o2.getScore () - o1.getScore ());

//        System.out.println (Arrays.toString (strArr));
        for (Student stu : strArr) {
            System.out.println (stu);
        }
    }
}

class Student {
    private String name;
    private int score;

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student () {
    }

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
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
