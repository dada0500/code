package juan.Java32jichu.T79;

public class Teacher{
    private String name;
    private int age;

    public Teacher () {
    }

    public Teacher (String name, int age) {
        this.name = name;
        this.age = age;
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

    void teaching (Teach teach){
        System.out.println (name + "授课中");
        teach.fun();
        Plan plan = new Plan ("基础","就业");
        teach.teachPlan(plan);
    }
}
