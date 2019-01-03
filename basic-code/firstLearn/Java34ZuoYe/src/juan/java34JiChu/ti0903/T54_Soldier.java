package juan.java34JiChu.ti0903;

public class T54_Soldier {
    private String name;
    private int age;
    private String like;

    public void show(){
        System.out.println("姓名：" + this.name + "  年龄：" + this.age + "  爱好：" + this.like);
    }

    public T54_Soldier() {
    }

    public T54_Soldier(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
