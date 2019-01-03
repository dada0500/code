package cn.itcast.zuoye;


/*
练习十一：StringBuilder类的使用
        十一、分析以下需求，并用代码实现：
        (1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
        (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
        注：要求使用StringBuilder来完成
*/


public class T11 {
    public static void main (String[] args) {
        int[] arr = {7,8,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(arr[i] != arr[j] && arr[i] != arr[k] && arr[k] != arr[j]){
                        StringBuilder sb = new StringBuilder ();
                        sb.append (arr[i]).append (arr[j]).append (arr[k]);
                        System.out.print (sb + " ");
                    }
                }
            }
        }
    }
}
