package Demo01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04_Scanner {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("请输入数字：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
