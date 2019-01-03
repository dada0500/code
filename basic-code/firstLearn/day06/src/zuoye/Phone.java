package zuoye;

public class Phone {
    private String brand;
    private int price;

    public void call(){
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机打电话");
    }

    public void sendMessage(){
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机发短信");
    }

    public void playGame(){
        System.out.println("正在使用价格为" + this.price + "元的" + this.brand + "品牌的手机玩游戏");
    }

    public Phone(){

    }

    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
