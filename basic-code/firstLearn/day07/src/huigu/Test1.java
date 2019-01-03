package huigu;

/*
定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数

        提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）

        遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2-5之间的数字：");
        int num = sc.nextInt();

        getNum(arr,num);
    }



    public static int[] getArr() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99) + 1;
        }
        return arr;
    }

    public static void getNum(int[] arr,int num){
        if(num >= 2  && num <= 5){
            System.out.println("数组中是" + num + "倍数的元素有：");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % num == 0){
                    System.out.print(arr[i] + "  ");
                }
            }
        }else{
            System.out.println("输入的数不符合条件");
        }
    }
}
