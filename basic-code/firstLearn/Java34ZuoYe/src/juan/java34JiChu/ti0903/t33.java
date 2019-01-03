package juan.java34JiChu.ti0903;

import juan.java34JiChu.myClass.AllMethod;
import juan.java34JiChu.myClass.PrintArr;

import java.util.Arrays;

public class t33 {
    public static void main(String[] args) {
        int[] arr = {6,2,9,15,1,5,20,7,18};

        AllMethod method = new AllMethod();     //方法所在的类: AllMethod
        System.out.println("原数组：");
        method.printArr(arr);        //遍历打印数组

        int[] max = method.getMax(arr); //取最大值及其索引 max[0] 值  max[1]索引
        int[] min = method.getMin(arr); //取最小值及其索引 0 值  1索引


        //数组最大元素与最后一位元素进行交换
        arr[max[1]] = arr[arr.length - 1];  //{6,2,9,15,1,5,18,7,18}
        arr[arr.length - 1] = max[0];       //{6,2,9,15,1,5,18,7,20}

        //数组最小元素与第一位元素进行交换
        arr[min[1]] = arr[0];       //{6,2,9,15,6,5,18,7,20}
        arr[0] =  min[0];           //{1,2,9,15,6,5,18,7,20}

        System.out.println("交换后的数组：");
        method.printArr(arr);        //遍历打印数组
    }
}
