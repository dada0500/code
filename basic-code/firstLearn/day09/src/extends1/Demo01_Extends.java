package zuoye.T2;

public class Demo01_Extends {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "黑";
//        d.leg = 4;
        d.setLeg(4);
        d.eat();
        d.name = "富贵";

        Animal a = new Animal();
        System.out.println("a：");
//        System.out.println(a.leg);
        System.out.println(a.getLeg());
        a.eat();

        Animal adog = new Dog();
        Dog bdog = new Dog();
        System.out.println("adog：");
//        System.out.println(adog.leg);
        System.out.println(adog.getLeg());
        adog.eat();
        System.out.println("bdog：");
//        System.out.println(bdog.Leg);
        System.out.println(bdog.getLeg());
        bdog.eat();
    }

}

class Animal{
    String color;
    private int leg = 5;
    String name;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}

class Dog extends Animal{
int leg = 10;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public Dog() {
    }

    public Dog(String color) {

    }

    public void eat(){
        System.out.println("吃香蕉");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
}
