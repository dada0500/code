package ti0908;

import java.util.Arrays;

/*
71、定义方法filter
      要求如下：
          形参：String [] arr，String  str
          返回值类型：String []
          实现：遍历arr，将数组中以参数str开头的元素存入另一个String 数组中并返回
PS：返回的数组长度需要用代码获取
在main方法中完成以下要求：
      定义一个String数组arr，数组元素有："itcast","itheima","baitdu","weixin","zhifubao"
      调用filter方法传入arr数组和字符串”it”，输出返回的String数组中所有元素
示例如下：


 */
public class T71 {
    public static void main(String[] args) {
        String[] strArr = {"itcast","itheima","baitdu","weixin","zhifubao"};
        String[] newArr = filter(strArr,"it");
        System.out.println(Arrays.toString(newArr));
    }

    public static String[] filter(String[] arr,String str){
        int len = 0;     //记录新数组长度
        int[] index = new int[arr.length];  //记录符合条件的原数组索引
        for (int i = 0; i < arr.length; i++) {
            if( arr[i].startsWith(str) ){
                index[len] = i;
                len++;
            }
        }

        String[] newStr = new String[len];

        for (int i = 0; i < newStr.length; i++) {
            newStr[i] = arr[index[i]];
        }

        return newStr;
    }
}

