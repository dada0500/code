package zuoye;


public class ManagerCoder{
    public static void main(String[] args) {
        Manager m1 = new Manager("",123,15000,6000);
        m1.work();

        Coder c1 = new Coder("",135,10000);
        c1.work();
    }
}


class Manager {
    private String name;
    private int id;
    private double salary;
    private double bonus;

    public void work(){
        System.out.println("工号为" + this.id +"基本工资为" + this.salary + "奖金为" + this.bonus + "的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

    public Manager(){

    }

    public Manager(String name , int id , double salary , double bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public String getName(String name){
        return name;
    }

    public int getId(int id){
        return id;
    }

    public double getSalary(double salary){
        return salary;
    }

    public double getBonus(double bonus){
        return bonus;
    }

}



class Coder{
    private String name;
    private int id;
    private double salary;

    public void work(){
        System.out.println("工号为" + this.id +"基本工资为" + this.salary + "的程序员正在努力的写着代码......");
    }

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}