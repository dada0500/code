package huigu;

public class Demo02_Array_getMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] maxAndMin = getMaxAndMin(arr);
        System.out.println("Max:" + maxAndMin[0]);
        System.out.println("Min:" + maxAndMin[1]);
    }

    public static int[] getMaxAndMin(int[] arr){
            //求最大值
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            //求最小值
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            int[] maxAndMin = {max,min};
            return maxAndMin;
    }
}
