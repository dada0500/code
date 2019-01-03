package juan.java34JiChu.myClass;

public class AllMethod {

    //遍历输出数组  [1, 2, 3, 4, 5]
    public void printArr(int[] arr){
        if(arr.length == 0) return;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    //打印数组中的最大值
    public void printMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println("数组中的最大值是：" + max);
    }

    //打印数组中的最小值
    public void printMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println("数组中最小的值是：" + min);
    }
    //返回数组中的最大值 及其 索引
    public int[] getMax(int[] arr){
        int[] max = new int[2];
        max[0] = arr[0];    // max[0] 值
        max[1] = 0;         // max[1] 索引
        for (int i = 1; i < arr.length; i++) {
            if(max[0] < arr[i]){
                max[0] = arr[i];
                max[1] = i;
            }
        }
        return max;
    }

    //返回数组中的最小值 及其 索引
    public int[] getMin(int[] arr){
        int[] min = new int[2];
        min[0] = arr[0];    // min[0] 值
        min[1] = 0;         // min[1] 索引
        for (int i = 1; i < arr.length; i++) {
            if(min[0] > arr[i]){
                min[0] = arr[i];
                min[1] = i;
            }
        }
        return min;
    }
}
