package testpro;

import java.util.Arrays;

public class Demo_03 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44};

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ",");
            }
        }

        System.out.println("==================");
        System.out.println(Arrays.toString(arr));
    }
}

