package cn.itcast.zuoye.T3;

public class Dog extends Animal implements Swim {

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void swim(){
        System.out.println("狗刨");
    }
}
