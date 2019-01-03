package zuoye;

public class CatDog{
    public static void main(String[] args) {
        Cat cat = new Cat("花色","波斯猫");
        Dog dog = new Dog("黑色","藏獒");
//        cat.eat();
//        cat.catchMouse();
//        dog.eat();
//        dog.lookHome();
    }
}



class Cat {
    String color;
    String breed;

    public void eat(){
        System.out.println(color + "的" + breed + "正在吃鱼");
    }

    public void catchMouse(){
        System.out.println(color + "的" + breed + "正在逮老鼠");
    }

    public Cat(){};
    public Cat(String color,String breed){
        this.color = color;
        this.breed = breed;
        this.eat();
        this.catchMouse();
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor(){
        return color;
    }
    public String getBreed(){
        return breed;
    }
}


class  Dog{
    String color;
    String breed;

    public void eat(){
        System.out.println(color + "的" + breed + "正在啃骨头");
    }

    public void lookHome(){
        System.out.println(color + "的" + breed + "正在看家");
    }

    public Dog(){};
    public Dog(String color, String breed){
        this.color = color;
        this.breed = breed;
        this.eat();
        this.lookHome();
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor(){
        return color;
    }
    public String getBreed(){
        return breed;
    }
}