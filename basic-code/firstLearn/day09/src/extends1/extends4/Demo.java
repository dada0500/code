package extends1.extends4;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("老王","A001",9999,8888);
        Coder coder = new Coder("张三","A100",6666);
//        Manager m = new Manager();
        manager.work();
        coder.work();

        Employee m = new Manager("一一","100",99,99);
        m.getId();
        System.out.println(m.getId());
        m.work();
        manager.ggg();
    }
}
