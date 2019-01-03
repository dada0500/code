package text;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        QunZu qz = new QunZu("群主",1000);
        ChengYuan cy1 = new ChengYuan("张三",0);
        ChengYuan cy2 = new ChengYuan("李四",0);
        ChengYuan cy3 = new ChengYuan("王五",0);
        System.out.println("红包前：");
        qz.show();
        cy1.show();
        cy2.show();
        cy3.show();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        double sendMoney = sc.nextDouble();
        System.out.println("请输入个数：");
        int sendCount = sc.nextInt();

        ArrayList<Double> list = qz.send(sendMoney,sendCount);
//        if(list == null){
//            return;
//        }

        cy1.receive(list);
        cy2.receive(list);
        cy3.receive(list);

        System.out.println("红包后：");
        qz.show();
        cy1.show();
        cy2.show();
        cy3.show();
    }
}
