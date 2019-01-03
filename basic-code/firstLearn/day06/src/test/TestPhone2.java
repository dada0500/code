package test;

public class TestPhone2 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println(p1);

        p1.brand = "Nokia";
        p1.price = 120;
        p1.color = "黑色";
        System.out.println(p1.brand + "..." + p1.price + "..." + p1.color);

        p1.sendMessage();
        p1.call("PEOPLE");

        Phone p2 = new Phone();
        System.out.println(p2);

        p2.brand = "Nokia";
        p2.price = 120;
        p2.color = "黑色";
        System.out.println(p2.brand + "..." + p2.price + "..." + p2.color);

        p2.sendMessage();
        p2.call("yyy");
    }
}

class Phone{
    //品牌 价格 颜色
    String brand;
    double price;
    String color;

    //打电话，发短信
    void call(String name){
        String x = name;
        System.out.println("x = " + x);
        System.out.println("给" + name + "打电话");
    }

    void sendMessage(){
        System.out.println("群发短信");
    }
}