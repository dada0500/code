package huigu;

import java.util.Random;
import java.util.Scanner;

public class Ti3 {
    public static void main(String[] args) {
        //生成50-60之间的随机数
        Random r = new Random();
        int ranNum = r.nextInt(11) + 50;

        //键盘接收输入的数字
        Scanner sc = new Scanner(System.in);
        //循环判断，输入的数是否等于随机生成的数，直到猜中。
        while(true){
            System.out.println("请输入您猜测的数：");
            int scNum = sc.nextInt();
            if(scNum > ranNum){
                System.out.println("大了");
            }else if(scNum < ranNum){
                System.out.println("小了");
            }else {
                System.out.println("中了");
                return;
            }
        }
    }
}
