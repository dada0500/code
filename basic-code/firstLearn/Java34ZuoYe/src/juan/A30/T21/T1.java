package juan.A30.T21;

import java.util.Random;

public class T1 {
    public static void main (String[] args) {
        int[] arr = new int[5];
        Random r = new Random ();
        System.out.println ("随机生成的数组中的元素是：");
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt (46) + 5;
            System.out.print (arr[i] + "  ");
        }

        System.out.println ("\r\n调用方法修改后的数组中的元素是：");
        int[] newArr = getNewArr (arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + "  ");
        }
    }

    static int[] getNewArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
