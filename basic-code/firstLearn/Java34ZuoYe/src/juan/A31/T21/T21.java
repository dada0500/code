package juan.A31.T21;

import java.util.Random;
import java.util.Scanner;

public class T21 {
    public static void main (String[] args) {
        Random r = new Random ();
        int num = r.nextInt (11) + 50;
        Scanner sc = new Scanner (System.in);

        while(true){
            System.out.println ("请输入您猜的数字：");
            int guess = sc.nextInt ();
            if( guess > num){
                System.out.println ("大了");
            }else if(guess < num){
                System.out.println ("小了");
            }else {
                System.out.println ("恭喜你，猜中了");
                break;
            }
        }
    }
}
