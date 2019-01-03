package cn.itcast.zuoye.T3;

public class Feeder {
    public void feeding(Animal a){
        a.drink();
        a.eat();
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.swim();
        }else if(a instanceof Frog) {
            Frog d = (Frog) a;
            d.swim();
        }
    }
}
