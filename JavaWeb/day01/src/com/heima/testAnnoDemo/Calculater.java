package com.heima.testAnnoDemo;

public class Calculater {

//    @TestRun
    public int add(int a, int b){
        return a+b;
    }

    @TestRun
    public void print1(){
        System.out.println ("1 / 0 = " + 1 / 0);
    }

    @TestRun

    public void print2(){
        String s = null;
        s.toLowerCase();
        System.out.println ("print2..");
    }

    @TestRun
    public void print3(){

        int[] arr = {};
        System.out.println (arr[0]);
        System.out.println ("print1..");
    }

    @TestRun

    public void print4(){
        System.out.println ("print2..");
    }

    public int sub (int a, int b){
        return a-b;
    }

}
