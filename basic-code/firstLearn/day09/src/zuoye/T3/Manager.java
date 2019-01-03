package zuoye.T3;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
