package zuoye.test;

public class Cat extends Animal{
    String name;
    @Override
    public void run(){
        System.out.println("子类Cat，的run方法执行");
    }

    public Cat(String name){
        System.out.println("Cat的构造方法执行");
    }
}
