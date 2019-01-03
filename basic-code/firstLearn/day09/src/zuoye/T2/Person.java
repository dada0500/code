package zuoye.T2;

public class Person {
    private String name;
    private Boolean male;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Boolean male, int age, String nationality) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("Person吃饭");
    }
    public void sleep(){
        System.out.println("Person睡觉");
    }
    protected void work(){
        System.out.println("Person工作");
    }
}
