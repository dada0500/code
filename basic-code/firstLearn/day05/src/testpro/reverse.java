package testpro;

import java.util.Arrays;
//数组反转 arr.length /2
public class reverse {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};

/*
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
*/
        print(arr);
        System.out.println("==================");
        System.out.println(Arrays.toString(arr));
    }

    public static void print(int[] arr){
        System.out.println("调用print方法反转数组");
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

