package com.heima.zuoye;

/*
练习十三：Comparable和Comparator两个接口的使用
        十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
        姓名（String）	年龄（int）	分数（float）
        liusan	20	90.0F
        lisi	22	90.0F
        wangwu	20	99.0F
        sunliu	22	100.0F
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class T13 {
    public static void main (String[] args) {
        ArrayList<Student> list = new ArrayList<> ();
        Student stu5 = new Student ("liusi",24,90.2F);
        Student stu1 = new Student ("liusan",25,90.1F);
        Student stu2 = new Student ("liusi",24,90.1F);
        Student stu3 = new Student ("wangwu",25,99.0F);
        Student stu4 = new Student ("sunliu",26,100.0F);

        Collections.addAll (list,stu1,stu2,stu3,stu4,stu5);

        System.out.println ("排序前：");
        System.out.println (list);

        //Comparable方式：
//        Collections.sort (list);

        //Comparator方式排序
        list.sort (new Comparator<Student> () {
            @Override
            public int compare (Student o1, Student o2) {
                if(o2.getScore () != o1.getScore ()){
                    if( o2.getScore () - o1.getScore () > 0){
                        return 1;
                    }else {
                        return -1;
                    }
                }else {
                    if(o2.getAge () != o1.getAge ()){
                        if( o2.getAge () - o1.getAge () > 0){
                            return 1;
                        }else {
                            return -1;
                        }
                    }else {
                        return 0;
                    }
                }
            }
        });

        System.out.println ("排序后：");
        System.out.println (list);
    }
}

//class Student implements Comparable<Student>{
class Student{
    private String name;
    private int age;
    private float score;

/*    @Override
    public int compareTo (Student o) {
        if(  this.score - o.score > 0 ){
            return -1;
        }else if( this.score - o.score < 0){
            return 1;
        }else{
            if( this.age - o.age > 0){
                return -1;
            }else if(  this.age - o.age < 0 ){
                return 1;
            }else {
                return 0;
            }
        }
    }*/

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare (student.score, score) == 0 &&
                Objects.equals (name, student.name);
    }

    @Override
    public int hashCode () {

        return Objects.hash (name, age, score);
    }

    public Student () {
    }

    public Student (String name, int age, float score) {
        this.name = name;

        this.age = age;
        this.score = score;
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

    public float getScore () {
        return score;
    }

    public void setScore (float score) {
        this.score = score;
    }

}
