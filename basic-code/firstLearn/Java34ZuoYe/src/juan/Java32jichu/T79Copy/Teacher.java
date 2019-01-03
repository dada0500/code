package juan.Java32jichu.T79Copy;

public class Teacher {
    private String name;
    private int age;

    void teaching(Teach teach){
        System.out.println (name + "授课中");
        teach.fun();
        teach.teachPlan (new Plan ("java基础","javaWeb"));
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public Teacher (String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Teacher () {

    }
}
