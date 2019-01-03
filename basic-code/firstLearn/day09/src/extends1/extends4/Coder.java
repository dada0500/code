package extends1.extends4;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("姓名为：" + getName() + "工号为：" + getId() + "工资为：" + getSalary() + "的程序员正在高高兴兴地敲代码");
    }

}
