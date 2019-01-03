package text;

import java.util.ArrayList;
import java.util.Arrays;

public class QunZu extends User {

//    @Override
//    public double hongBao(double sendMoney,int count) {
//
//
//
//        double left = getMoney() - sendMoney;
//        setMoney(left);
//        return getMoney();
//    }


    public ArrayList<Double> send(double money,double count){
        double leftMoney = super.getMoney();
        if(money > leftMoney){
            System.out.println("余额不足");
            return null;
        }

        super.setMoney(leftMoney - money);

        ArrayList<Double> list = new ArrayList<>();

        //扩大100倍，相当 于折算成‘分’为单位，避免小数运算损失精度的问题
//        money = money * 100;

        double m = money / count;   //每份的金额
        double l = money % count;   //不能整除的余数


        //无论是否能整除，n-1 份都是每份的等额金额
        for (int i = 0; i < count - 1; i++) {
            list.add(m);
        }
        list.add( m + l );    //最后第n份金额是 m + l

        return list;
    }

    public QunZu() {
    }

    public QunZu(String name, double money) {
        super(name, money);
    }
}
