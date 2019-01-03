package com.heima.zuoye;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class T6 {

   /* 练习六：HashSet存储自定义类型
    六、定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储
*/
    public static void main (String[] args) {
        Person p1 = new Person ("张一",22);
//        Person p2 = new Person ("张一",22);
        Person p3 = new Person ("张三",20);
        Person p4 = new Person ("张四",18);
        Person p2 = new Person ("张四",18);

        HashSet<Person> set = new HashSet<> ();
        Collections.addAll (set,p1,p2,p3,p4);

        System.out.println (set);

        for (Person p : set) {
            System.out.println (p);
            System.out.println (p.hashCode ());
        }


    }
}

class Person{
    private String name;
    private int age;

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals (name, person.name);
    }

    @Override
    public int hashCode () {

        return Objects.hash (name, age);
    }

    public Person () {
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
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
}
