package ti0908;

import java.util.Arrays;

/**
70、请完成以下需求：
(1)	定义方法method
方法有两个参数：String [] arr，String str
返回值类型：int[]
该方法可以遍历String数组arr，将数组中包含参数str的元素的索引，存入另一个新创建的int数组中并返回，新数组的长度需要用代码实现
（2）在main方法中，定义一个String数组arr，数组元素有：
"itcast","itheima","baidu","weixitn","zhifubao"
调用method方法传入数组arr和字符串”it”，输出返回的int数组中所有元素
示例如下：

 */

public class T70 {
    public static void main(String[] args) {
        String[] arr = {"itcast","itheima","baidu","weixitn","zhifubao"};
        int[] its = method(arr, "it");
        System.out.println(Arrays.toString(its));
    }

    public static int[] method(String[] arr, String str){
        int len = 0;    //记录所要求的索引个数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains(str)){
                len++;
            }
        }
        //定义要返回的int数组
        int[] nArr = new int[len];
        //遍历字符串数组，筛选出索引存入int数组
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains(str)){
                nArr[index] = i;
                index++;
            }
        }
        return nArr;
    }
}
