package juan.A31.T22;

public class test {
    public static void main (String[] args) {
        Line lintest = new Line ("黑马班",19980);
        Student stu = new Student ();
        stu.setName ("张三");
        stu.setScore (88);
        stu.setLin (lintest);
        
        stu.exam ();
        stu.studyLine ();
    }
}
