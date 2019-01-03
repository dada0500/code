import java.util.Collections;
import java.util.Set;

@FunctionalInterface
interface Greetable {
    void greet();
}

//然后是父类`Human`的内容：
class Human {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

//子类`Man`
class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("大家好,我是Man!");
    }

    //定义方法method,参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法,使用Lambda表达式
        method(()->{
            //创建Human对象,调用sayHello方法
            new Human().sayHello();
        });
        //简化Lambda
        method(()->new Human().sayHello());
        //使用super关键字代替父类对象
        method(()->super.sayHello());

        //使用方法引用来调用父类中的`sayHello`方法
        method(super::sayHello);
        method(() -> this.sayHello());
        method(this::sayHello);
    }
    public static void main(String[] args) {
        new Man().show();

    }
}