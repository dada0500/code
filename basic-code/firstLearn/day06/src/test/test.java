package test;

import java.util.Arrays;

public class test {
    public static void ChangeStr (String str){
        str="welcome";
    }
    public static void main(String[] args){
        String str="1234";
        ChangeStr (str);
        System.out.println(str);


        int[] arr = {11,22,33,44};

        System.out.println(Arrays.toString(arr));
    }


}
