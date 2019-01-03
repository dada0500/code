package Demo01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01_Scanner {
    public static void main(String[] args) {
        int[] arr = getArray();
        System.out.println(Arrays.toString(arr));
        int max = getMax(arr);
        System.out.println("其中最大的是：" + max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            max = (max > arr[i]) ? max : arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] getArray(){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入十个数字：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
