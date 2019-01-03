package juan.java34JiChu.ti0903;

public class t42TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("赵一");
        stu1.setAge(18);
        Student stu2 = new Student("张三",20);

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.study();
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.study();

    }
}
