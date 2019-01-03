package com.heima.Demo;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main (String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student ( "张三",18));
        ts.add(new Student ( "张三",18));
        ts.add(new Student ( "张三",18));
        System.out.println (ts);
    }
}

class Student {

    private String name;
    private int score;

    public Student (String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int Comparable(Student s){
        return this.score - s.score;
    }

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}