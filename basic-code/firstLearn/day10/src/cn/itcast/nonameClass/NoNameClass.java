package cn.itcast.nonameClass;

public class NoNameClass {
    public static void main (String[] args) {
        new Inter () {
            @Override
            public void method () {
                System.out.println ("111");
            }
        }.method ();
    }
}

interface Inter {
    void method ();
}

class InterImp implements Inter {
    @Override
    public void method () {
        System.out.println ("我是Inter接口实现类，重写了Method方法");
    }
}