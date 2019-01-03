package ti0906;

import java.util.Arrays;
import java.util.Random;

public class T60 {
    public static void main(String[] args) {
        //定义一个长度为10的int型的数组arr
        int[] arr = new int[10];

        //给数组每一个元素赋值，值是1-20的随机数。要求不能重复
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            while(true){
                int num = r.nextInt(20) + 1;
                if(!atArr(arr,num)){
                    arr[i] = num;
                    break;
                }
            }
        }
        //打印输出 随机生成的数组：
        System.out.println("随机生成的数组：");
        System.out.println(Arrays.toString(arr));

        //定义两个新数组，要求使用新数组1只装原数组中的奇数，要求新数组2只装原数组中的偶数
        int[] oddArr = getOddArr(arr);
        int[] evenArr = getEvenArr(arr);

        //打印输出
        System.out.println("奇数数组：");
        System.out.println(Arrays.toString(oddArr));
        System.out.println("偶数数组：");
        System.out.println(Arrays.toString(evenArr));


    }

    //判断随机生成的数，在数组中是否已存在
    public static boolean atArr(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    //取数组中的奇数个数
    public static int getOddCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    //取数组中的奇数 组成 一个新的数组返回
    public static int[] getOddArr(int[] arr){
        int[] oddArr = new int[getOddCount(arr)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                oddArr[index] = arr[i];
                index++;
            }
        }
        return oddArr;
    }

    //取数组中的偶数 组成 一个新的数组返回
    public static int[] getEvenArr(int[] arr){
        int[] evenArr = new int[arr.length - getOddCount(arr)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenArr[index] = arr[i];
                index++;
            }
        }
        return evenArr;
    }
}
