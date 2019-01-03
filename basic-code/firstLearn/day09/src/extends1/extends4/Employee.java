package extends1.extends4;

public class Employee {
    private String name;
    private String id = "01";
    private double salary;

    public void work(){
        System.out.println("员工工作");
    }

    public Employee() {
        System.out.println("父类空参构造");
    }

    public Employee(String name, String id, double salary) {
        System.out.println("父类有参构造");

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
