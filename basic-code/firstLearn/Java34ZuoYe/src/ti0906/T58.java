package ti0906;

import java.util.Scanner;

public class T58 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 22, 11};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的数字：");
        int num = sc.nextInt();
        method(arr,num);
    }

    //判断 num在数组中最后出现的角标位置，如不存在，也输出提示
    public static void method(int[] arr, int num){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == num){
                System.out.println(num + "最后出现的角标位置是：" + i);
                return;
            }
        }
        System.out.println("数组内并不存在元素：" + num);
    }
}
