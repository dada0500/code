package juan.java34JiChu.ti0903;

import java.util.Scanner;

public class t32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();

        int[] arr = getArr(a,b,c);
        printArr(arr);
    }

    public static int[] getArr(int a,int b,int c){
        int[] arr = {a,b,c};
        return arr;
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}

