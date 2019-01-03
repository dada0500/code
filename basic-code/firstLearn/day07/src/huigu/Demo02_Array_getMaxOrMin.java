package huigu;

public class Demo02_Array_getMaxOrMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = getMaxOrMin(arr,true);
        int min = getMaxOrMin(arr,false);
        System.out.println("Max:" + max);
        System.out.println("M:" + min);
    }

    public static int getMaxOrMin(int[] arr,boolean flag){
        if(flag){
            //求最大值
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }else {
            //求最小值
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            return min;
        }
    }
}
