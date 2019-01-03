package ti0906;

import java.util.Random;

public class T59 {
    public static void main(String[] args) {
        //59、定义一个长度为10的int型的数组arr
        int[] arr = new int[10];

        //依次生成10个1-100（范围包括1和100）的随机数并存入arr中,
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        //输出arr转换前的所有元素：
        System.out.println("转换前的元素顺序如下：");
        printArr(arr);  //调用遍历打印数组
        //将arr中的元素都往前移一个位置，最后一个元素的值是原来第一个元素的值，
        moveArr(arr);
        // 输出arr转换后的所有元素：
        System.out.println("转换后的元素顺序如下：");
        printArr(arr);  //调用遍历打印数组

    }

    //遍历打印数组
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //将arr中的元素都往前移一个位置，最后一个元素的值是原来第一个元素的值，
    public static void moveArr(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
}
