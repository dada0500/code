package com.heima.zuoye;
//练习七：类的构造器引用
public class T7 {
//3.	有测试类如下
    public static void main(String[] args) {
        Car Q7 = getCar(Car::new);
        Q7.setBrand("奥迪");
        System.out.println (Q7);
    }

    public static Car getCar(BeanFactory<Car> factory){
        return factory.getBean();
    }
//4.	补全测试类中横线处的代码，完成原代码的需求

}

//1.	有对象工厂BeanFactory接口如下
@FunctionalInterface
interface BeanFactory<T> {
    T getBean();
}


//2.	有汽车类Car如下
class Car {
    private String brand;

    @Override
    public String toString () {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car() {

    }
}