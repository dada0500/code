package cn.itcast.test;

public class Test {
    public static void main(String args[]){
        ToStringTest toStringTest = new ToStringTest ();//love java
        System.out.println (toStringTest);
        System.out.println("love " + new ToStringTest());//love java
/*        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2*/
    }
}

class ToStringTest{
    static int i= 1;
    public static void main(String args[]){
        System.out.println("love " + new ToStringTest());//love java
        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}

