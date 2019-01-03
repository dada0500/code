package test;

public class DemoPhone {
    private String brand;
    private double price;

    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public DemoPhone() {
    }

    public DemoPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
