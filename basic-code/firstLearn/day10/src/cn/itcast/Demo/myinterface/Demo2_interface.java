package cn.itcast.Demo.myinterface;

 class Demo2_interface {
    public static void main(String[] args) {
        InterImp ii = new InterImp();
        ii.method();
        int  nonum = Inter.num;

        Inter l = new Inter() {
            @Override
            public void method() {
                System.out.println("New Inter");
            }
        };

        l.method();

        System.out.println(l.toString());
    }
}

interface Inter{
    public static final int num = 10;
    public abstract void method();
}

class InterImp implements Inter {

    @Override
    public void method() {
        System.out.println("我是接口实现类");
    }
}