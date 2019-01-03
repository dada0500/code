package extends1.extends4;

public class Manager extends Employee{
    private double bonus;
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void ggg(){
        System.out.println(super.getId());
    }

    public void work() {
        System.out.println("姓名为：" + getName() + "工号为：" + getId() + "工资为：" + getSalary() + "奖金为：" + bonus + "的项目经理，正在苦求程序员敲代码");
    }
    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
