package text;

public abstract class User {
    private String name;
    private double money;

//    public abstract double hongBao(double money,int count);

    public void show(){
        System.out.println("用户名：" + name + "，余额为：" + money + "元");
    }

    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
