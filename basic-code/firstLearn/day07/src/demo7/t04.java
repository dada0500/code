package demo7;

import java.util.ArrayList;

public class t04 {
    public static void main(String[] args) {
//        Student stu1 = new Student("李一",18);
//        Student stu2 = new Student("李二",19);
//        Student stu3 = new Student("李三",20);
//        Student stu4 = new Student("李四",21);

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("李一",18));
        list.add(new Student("李二",19));
        list.add(new Student("李三",20));
        list.add(new Student("李四",21));

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "  " + list.get(i).getAge());
        }
    }

}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}