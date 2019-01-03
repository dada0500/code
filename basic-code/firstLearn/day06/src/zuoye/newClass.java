package zuoye;

public class newClass {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 998);

        System.out.println(p1);
        System.out.println(p1.getBrand());
        System.out.println(p1.getPrice());

        p1.call();
        p1.sendMessage();
        p1.playGame();

        System.out.println("================");

        Manager m1 = new Manager("",123,15000,6000);
        m1.work();

        Coder c1 = new Coder("",135,10000);
        c1.work();

        System.out.println("================");

        Cat cat = new Cat("花色","波斯猫");
        Dog dog = new Dog("黑色","藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }

}
