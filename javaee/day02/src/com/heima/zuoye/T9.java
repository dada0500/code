package com.heima.zuoye;

import com.heima.zuoye.lei.Student;

import java.util.ArrayList;

public class T9 {
    public static void main (String[] args) {
    /*    练习九：Collection集合练习
        九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
        A：遍历集合遍历输出。
        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。*/

        ArrayList<Student> slist = new ArrayList<> ();
        slist.add (new Student ("张三",18,"男"));
        slist.add (new Student ("李四",19,"男"));
        slist.add (new Student ("王五",20,"男"));
        slist.add (new Student ("王六",20,"女"));
        int max = slist.get (0).getAge ();
        int index = 0;

        /*
        *   年龄重复！！！！
        * */

        for (Student student : slist) {
            System.out.println (student.toString ());
            if(student.getAge () > max){
                index = slist.indexOf (student);
                max = student.getAge ();
                student.setName ("小猪佩奇");
            }
        }

        System.out.println ("年龄最大的学生是：" + slist.get (index) );

    }
}
