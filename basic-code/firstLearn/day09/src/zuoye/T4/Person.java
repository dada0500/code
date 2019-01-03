package zuoye.T4;

public class Person{
    private String name;
    private int age;

    public void keepPet(Dog dog,String something){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" +dog.getColor() +  "颜色的"+ dog.getAge() + "岁的宠物");
        System.out.println(dog.getAge() + "岁的" + dog.getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void keepPet(Cat cat,String something){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" +cat.getColor() +  "颜色的"+ cat.getAge() + "岁的宠物");
        System.out.println(cat.getAge() + "岁的" + cat.getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
