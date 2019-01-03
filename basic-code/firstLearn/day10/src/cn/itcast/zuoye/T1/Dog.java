package cn.itcast.zuoye.T1;

public class Dog extends Animal implements Jidu{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("狗看家");
    }

    @Override
    public void jidu() {
        System.out.println("缉毒狗");
    }
}
