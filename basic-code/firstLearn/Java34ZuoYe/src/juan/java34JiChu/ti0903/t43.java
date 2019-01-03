package juan.java34JiChu.ti0903;

public class t43 {
    public static void main(String[] args) {
        Teacher tech1 = new Teacher();
        tech1.setName("晓荣");
        tech1.setAge(18);
        tech1.setContent("JAVA面向对象");
        tech1.eat();
        tech1.teach();

        Student stu1 = new Student("小明",8,"JAVA面向对象");
        stu1.eat();
        stu1.study();
    }
}
