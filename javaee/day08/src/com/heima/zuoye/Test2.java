package com.heima.zuoye;
/*
练习二:递归的使用(一)
        描述:
        用递归实现不死神兔
        故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
        在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
        再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
        问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
*/

public class Test2 {
    public static void main (String[] args) {
//        int sum = getSum (50);
//        System.out.println (sum);
    }

    private static int getSum (int month) {
        if (month == 1 || month == 2) {
            return 1;
        }else{
            return getSum (month - 2) + getSum (month - 1);
        }
    }

/*    private static void getSum2(int month){
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.println (arr[arr.length - 1]);
    }*/


}
