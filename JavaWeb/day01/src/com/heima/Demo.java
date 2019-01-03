package com.heima;

public class Demo {
    public static void main(String[] args){
        Week mon = Week.MON;
        mon.method();
    }
}
enum Week{
    MON,TUE,WED;
    public static void method(){
        System.out.println("aaa");
    }
}