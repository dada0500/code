package com.heima.demo.Throw12;

public class Throw_test {
    public static void main (String[] args) {
        Person p = new Person ("张三",211);
        try {
            p.setAge (222);
        } catch (Exception e) {
            e.printStackTrace ();
        }
        System.out.println (p);
    }
}
