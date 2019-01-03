package juan.java34JiChu.ti0903;

public class t51 {
    public static void main(String[] args) {
        Student st1 = new Student("学生1", 18);
        Student st2 = new Student("学生2", 19);
        Student st3 = new Student("学生3", 20);

        Student[] students = {st1, st2, st3};
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名：" + students[i].getName() + "    年龄：" + students[i].getAge());
        }
    }
}
