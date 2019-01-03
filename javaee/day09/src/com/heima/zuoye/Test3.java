package com.heima.zuoye;
/*
练习三:字符输出流写出字符数据并存到集合中
        需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main (String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream ("day09\\Test3_stu.txt");
        FileWriter fw = new FileWriter ("day09\\Test3_stu.txt");
        Scanner sc = new Scanner (System.in);
        ArrayList<Student> list = new ArrayList<> ();

        for (int i = 1; i <= 3; i++) {
            System.out.println ("请输入学生" + i + "的信息：");
            String strIn = sc.nextLine ();
            String[] split = strIn.split ("-");
            list.add (new Student (split[0], split[1]));
            fw.write (list.get (i - 1).getId () + "," + list.get (i - 1).getName () + "\r\n");

        }
        System.out.println (list);
//        p.store (fo,"StudentInfo");    //\u718A\u5927
        fw.close ();
    }
}

class Student {
    private String name;
    private String id;

    public Student (String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }
}
