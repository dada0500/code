package com.heima.ceshi5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
     需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
        输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。

 */
public class Test4 {
    public static void main (String[] args) throws IOException {
        HashSet<Student> hs = new HashSet<> ();

        Scanner sc = new Scanner (System.in);
        System.out.println ("输入学员信息：");
        while (hs.size () < 3){
            String[] scArr = sc.nextLine ().split (" ");
            hs.add (new Student (scArr[0],Integer.parseInt (scArr[1])));
        }

        FileWriter fr = new FileWriter ("day12\\Student.txt");

        for (Student stu : hs) {
            fr.write (stu.getName () + " " + stu.getAge () + "，");
        }

        fr.close ();
    }
}

class Student{
    private String name;
    private int age;

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals (name, student.name);
    }

    @Override
    public int hashCode () {

        return Objects.hash (name, age);
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public Student () {
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
