package testpro;

public class getArrMaxMin {
    public static void main(String[] args) {
        int[] arr = {9,3,5,8,11};
        System.out.println("数组中的最大值" + getArrMax(arr));
        System.out.println("数组中的最小值" + getArrMin(arr));
    }

    //数组最大值
    public static int getArrMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //数组最小值
    public static int getArrMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
