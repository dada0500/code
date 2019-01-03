package cn.itcast.zuoye.T2;

public class Laptop{

    public void start() {
        System.out.println("开机");
        useUSB(new Mouse());
        useUSB(new Keyboard());
    }

    public void end() {
        System.out.println("关机");
    }

    public void useUSB(USB u){
        u.open();
        u.close();
    }
}
