package juan.java34JiChu.ti0903;

public class Stu{
    private String name;
    private int age;

    public Stu(){}
    public Stu(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age  = age;
    }
    public int getAge(){
        return age;
    }
}
