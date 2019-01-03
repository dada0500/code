package juan.A29.T21;

import java.util.Random;
import java.util.Scanner;

public class T21 {
    public static void main (String[] args) {
        int[] arr = new int[5];
        Random r = new Random ();
        System.out.println ("随机生成的数组中元素为：");
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt (99) + 1;
            System.out.print (arr[i] + "  ");
        }
        System.out.println ();
        System.out.println ("请输入2-5（包括2和5）之间的一个数字：");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt ();

        System.out.println ("符合条件的元素为：");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % num == 0){
                System.out.print (arr[i] + "  ");
            }
        }
    }
}
