package huigu;


/*
定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，将数组中小于10的元素替换成0，然后返回修改之后的数组

        在main方法中完成:
        1.	定义一个长度为5的int类型的数组
        2.	随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数组中的元素打印在控制台
        3.	调用getNewArr方法,在控制台打印返回后的数组中的元素
*/

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println(Arrays.toString(arr));
        getNewArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    //生成长度为5，内容是5个随机数的int类型的数组
    public static int[] getArr(){
        //定义一个长度为5的int类型的数组
        int[] arr = new int[5];
        //生成5个(5-50之间，包括5和50)随机数存入数组
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(46) + 1;
        }
        return arr;
    }

    //定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，将数组中小于10的元素替换成0，然后返回修改之后的数组.
    public static void getNewArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 10){
                arr[i] = 0;
            }
        }
    }
}
