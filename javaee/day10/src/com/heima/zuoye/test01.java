package com.heima.zuoye;

import java.io.*;

public class test01 {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
//        Student stu = new Student ("张三", 18, "男");
//        oos (stu);
        ois();
    }

    private static void ois () throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("day10/src/com/heima/zuoye/stu.txt"));
        Object obj = ois.readObject ();
        System.out.println (obj);
        ois.close ();
    }

    public static void oos (Student stu) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream ("day10/src/com/heima/zuoye/stu.txt"));
        oos.writeObject (stu);
        oos.close ();
    }
}
    //    扩展题
//    练习一:对象的序列化
/*
    描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
*/
// objectOutputStream

/*
练习二:对象的反序列化
        描述:将上一题保存到stu.txt文件中的学生对象读取出来。
*/


class Student implements Serializable{
    private String name;
    private int age;
//    private String sex;

    private static final long serialVersionUID = 9L;

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", sex='" + sex + '\'' +
                '}';
    }

    public Student () {
    }

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    public Student (String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }*/

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
/*
    public String getSex () {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }*/
}
