package juan.java34JiChu.ti0903;

public class Student{
    private String name;
    private int age;
    private String content;
    private String gender;


    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Student(String name, int age,String gender, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("年龄为" + age + "的" + name + "同学正在吃饭");
    }
    public void study(){
        System.out.println("年龄为" + age + "的" + name + "再学正在专心致志的听着" + content + "这是一个JavaBean类");
    }

}
