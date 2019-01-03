package test;

public class TestPhone {
    public static void main(String[] args) {
        DemoPhone aPhone = new DemoPhone(); //定义 DemoPhone类的对象

        System.out.println(aPhone);
        System.out.println(aPhone.getBrand());
        System.out.println(aPhone.getPrice());

        DemoPhone bphone = new DemoPhone(); //定义 DemoPhone类的对象

        System.out.println(bphone);
        System.out.println(bphone.getBrand());
        System.out.println(bphone.getPrice());
    }
}
