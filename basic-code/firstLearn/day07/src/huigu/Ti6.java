package huigu;



/*
		1. 定义数组, 长度为6, 键盘接收6个整数
        2. 将数组反转
        3. 将反转后的元素, 奇数索引交换
        4. 然后将数组中第一个奇数索引(1), 和最后一个奇数索引交换
        5. 打印输出数组元素


        1. [1, 2, 3, 4, 5, 6, 7, 8]
        2. [8, 7, 6, 5, 4, 3, 2,1]
        3. [8, 5, 6, 3, 4, 1, 2, 7]
        4. [8, 7, 6, 3, 4, 1, 2, 5]
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ti6 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = getArr(1);      //键盘录入 n 个数据 到数组中。
//        System.out.println(Arrays.toString(arr));
        reverse(arr);   //反转数组
//        System.out.println(Arrays.toString(arr));
        oddIndexSwap(arr);      //相邻奇数索引交换
//        System.out.println(Arrays.toString(arr));
        oddIndexSwap2(arr);     //奇数索引 第1个与最后1个交换
        printArr(arr);          //打印出数组
    }



    // 1. 定义数组, 长度为6, 键盘接收6个整数
    public static int[] getArr(int n) {
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 2. 反转int[]数组的方法
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
//            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
//            arr[i] = arr[i] ^ arr[arr.length - 1 - i];
            swap(arr,i,arr.length - 1 - i);
        }
    }

    // 交换数组中两个数的值
    public static void swap(int[] arr,int a ,int b){
//        arr[a] = arr[a] ^arr[b];
//        arr[b] = arr[a] ^arr[b];
//        arr[a] = arr[a] ^arr[b];
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // 3. 将反转后的元素, 奇数索引交换
    public static void oddIndexSwap(int[] arr) {
//        for (int i = 1; i < arr.length - 2; i += 2) {
//            swap(arr,i,i + 2);
//        }
        for(int i = 1 ,j = 3; i < arr.length && j < arr.length; i++ , j--){
            swap(arr,i,j);
        }
    }

    // 4. 将数组中第一个奇数索引(1), 和最后一个奇数索引交换
    public static void oddIndexSwap2(int[] arr){
        if(arr.length > 1){
            if(arr.length % 2 == 0){
            swap(arr,1,arr.length - 1);
            }else{
            swap(arr,1,arr.length - 2);
            }
        }
    }

    // 5. 打印输出数组元素
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
