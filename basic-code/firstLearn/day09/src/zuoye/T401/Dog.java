package zuoye.T401;

public class Dog extends Animal {
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    @Override
    public void work() {
        lookHome();
    }

    public void lookHome(){
        System.out.println("狗 看家");
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
}
