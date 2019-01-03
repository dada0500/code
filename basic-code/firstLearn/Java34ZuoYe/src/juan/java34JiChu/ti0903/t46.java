package juan.java34JiChu.ti0903;

import java.util.Arrays;
import java.util.Scanner;

    /*
        `   1.使用循环的方式键盘录入6个整数，（录入的时候要求先提示”请输入第几个数：”）并将这6个数存储到数组中
            2.计算去掉数组中最小的值和最大的值之后的剩余元素平均值；
            3.将求出的平均值打印到控制台上；
    */



public class t46 {
    public static void main(String[] args) {
        int[] arr = getArr();   //录入6个整数到数组中
        System.out.println(Arrays.toString(arr));
        double avg = getAvg(arr);
        System.out.println("去掉最大值[" + getMax(arr) + "]和最小值[" + getMin(arr) + "]后，剩余元素平均值是：" + avg);
    }

    //键盘录入6个整数，存入数组
    public static int[] getArr(){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //去掉最大值 和最小值后，剩余元素平均值。
    public static double getAvg(int[] arr){
        int sum = 0;
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == getMax(arr) || arr[i] == getMin(arr)){
                count--;
                continue;
            }
            sum += arr[i];
        }
        double avg = (double)sum / (double)count;
        return avg;
    }

    //获取最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    //获取最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
