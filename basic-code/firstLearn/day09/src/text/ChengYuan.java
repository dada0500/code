package text;

import java.util.ArrayList;
import java.util.Random;

public class ChengYuan extends User {

//    @Override
//    public double hongBao(double receiveMoney,int count) {
//        receiveMoney / count;
//        return 0;
//    }

    public void receive(ArrayList<Double> list){
        if(list == null || list.size() < 1){
            return;
        }
        int i = new Random().nextInt(list.size());
        //随机取红包中的一个加入余额中
        double leftMoney = super.getMoney() + list.remove(i);
        super.setMoney(leftMoney);
    }

    public ChengYuan() {
    }

    public ChengYuan(String name, double money) {
        super(name, money);
    }
}
