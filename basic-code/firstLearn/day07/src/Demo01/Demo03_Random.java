package Demo01;

import java.util.Random;
import java.util.Scanner;

public class Demo03_Random {
    public static void main(String[] args) {
        Random r = new Random();
        int randNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入您猜测的数：");
            int scanNuam = sc.nextInt();
            if(scanNuam > randNum){
                System.out.println("大了");
            }else if(scanNuam < randNum){
                System.out.println("小了");
            }else{
                System.out.println("中了");
                break;
            }
        }
    }
}
