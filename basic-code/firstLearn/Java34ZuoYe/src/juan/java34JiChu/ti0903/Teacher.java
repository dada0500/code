package juan.java34JiChu.ti0903;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher(){}
    public Teacher(String name,int age,String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getContent(){
        return content;
    }

    public void eat(){
        System.out.println("年龄为" + age + "的" + name + "老师正在吃饭。");
    }
    public void teach(){
        System.out.println("年龄为" + age + "的" + name + "老师正在亢奋的讲着" + content + "课。");
    }
}
