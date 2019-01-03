package juan.java34JiChu.myClass;

public class Min {
    int[] arr;

    public void getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println("数组中最小的值是：" + min);
    }
}
