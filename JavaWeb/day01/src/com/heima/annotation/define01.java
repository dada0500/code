package com.heima.annotation;

public class define01 {
}

@interface MyAnno {

    int value ();

//    Person per ();
//
//    MyAnno2 anno2 ();
//
//    String[] strs ();
    String name() default "张三";
}

//@MyAnno(value=12,per = Person.P1,anno2 = @MyAnno2,strs="bbb")
@MyAnno(12)
class Worker {

    public String name = "aaa";

    public void show(){


    }
}

@interface MyAnno2{

}


enum Person {
    P1,P2;
}
