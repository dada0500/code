package zuoye.T401;

public abstract class Animal implements LookHome,CatchMouse{
    private int age;
    private String color;

    public abstract void eat(String something);

    public abstract void work();

    public void lookHome(){

    }
    public void catchMouse(){

    }


    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
