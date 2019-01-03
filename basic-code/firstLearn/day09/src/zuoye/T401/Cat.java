package zuoye.T401;

public class Cat extends Animal {
    @Override
    public void eat(String something) {
        System.out.println( getAge()+ "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    @Override
    public void work(){
        catchMouse();
    }

    public void catchMouse(){
        System.out.println("猫 逮老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

}
