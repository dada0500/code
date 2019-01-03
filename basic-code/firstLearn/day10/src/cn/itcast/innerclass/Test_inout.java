package cn.itcast.innerclass;

public class Test_inout {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.abc);
        oi.method();
    }

}

class Outer{
    private int num = 10;

    class Inner{
        int abc = 20;

        public void method(){
            System.out.println("内部类");
        }
    }

    public void method(){
        System.out.println("外部类方法");
    }
}