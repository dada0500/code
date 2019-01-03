package zouye;

import java.util.Random;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        int length = sc.nextInt();
        int[] arr = new int[length];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("数组中最大数字：" + max);
        System.out.println("数组中数字的平均值：" + avg);
    }
}
