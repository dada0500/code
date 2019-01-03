package com.heima.zuoye;

public class T8 {
    public static void main (String[] args) throws TheScoreCanNotBeNegative {
        Student stu = new Student ("张三","A01",-2);
        int num = -1;
        if(num < 0){
            throw new TheScoreCanNotBeNegative (String.valueOf (num));
        }
            stu.setScore (num);

        System.out.println (stu);
    }
}

class TheScoreCanNotBeNegative extends Exception{
    public TheScoreCanNotBeNegative () {
    }

    public TheScoreCanNotBeNegative (String s) {
        super (s);
    }
}

class Student{
    private String name;
    private String id;
    private int score;

    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
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

    public int getScore () {
        return score;
    }

    public void setScore (int score) {
        this.score = score;
    }

    public Student (String name, String id, int score) {

        this.name = name;
        this.id = id;
        this.score = score;
    }

    public Student () {

    }
}
