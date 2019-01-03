package com.heima.Demo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4_Lambda {
    public static void main (String[] args) {
        Person[] arr = {
                new Person ("张三", 18),
                new Person ("李四", 19),
                new Person ("王五", 16),
        };

/*        Arrays.sort (arr, new Comparator<Person> () {
            @Override
            public int compare (Person o1, Person o2) {
                return o2.getAge () - o1.getAge ();
            }
        });*/

//        Arrays.sort (arr, (Person o1,Person o2) -> {return o2.getAge () - o1.getAge ();});
        Arrays.sort (arr, (o1,o2) -> o1.getAge () - o2.getAge () );

        for (Person p : arr) {
            System.out.println (p);
        }
    }
}

class Person {

    private String name;
    private int age;

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

    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}