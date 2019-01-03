package cn.itcast.zuoye.T3;

public class test {
    public static void main(String[] args) {
        Feeder f = new Feeder();
        f.feeding(new Dog());

        f.feeding(new Sheep());

        f.feeding(new Frog());
    }
}
