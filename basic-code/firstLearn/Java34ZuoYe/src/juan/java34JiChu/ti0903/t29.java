package juan.java34JiChu.ti0903;

public class t29 {
    public static void main(String[] args) {
//        int[] arr = new int[5];
        int[] arr = {11, 22, 33, 44, 55};
//        int[] arr = {1, 2, 3, 4, 5};
//
        //(1)	输出数组的长度
        System.out.println("数组的长度：" + arr.length);

        //(2)	遍历数组，输出每个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //(3)	元素值 为 偶数 的个数
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }
        System.out.println("元素值为偶数的个数是：" + evenCount);

        //(4)    元素值为奇数的元素之和
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                oddSum += arr[i];
            }
        }
        System.out.println("元素值为奇数的元素之和：" + oddSum);


    }
}
