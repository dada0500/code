package test;

public class demoStudent {


        public static void main(String[] args) {
            student stu = new student();

            stu.asetName("鹿晗");
            stu.asetAge(20);
            stu.asetMale(true);

            System.out.println("姓名：" + stu.agetName());
            System.out.println("年龄：" + stu.agetAge());
            System.out.println("是不是爷们儿：" + stu.aisMale());
        }


}
