package zuoye.T4;

public class T4 {
    public static void main(String[] args) {
        Person pWang = new Person("老王",30);
        Person pLi = new Person("老李",25);

        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(3,"灰");

        pWang.keepPet(dog,"骨头");
        pLi.keepPet(cat,"鱼");
    }
}
