package juan.java34JiChu.ti0831;
/*
    12、将1到100之间不能被3整除的数字累加求和并打印结果。
    求出1到5之间所有整数之和并打印结果。
    求出1到5之间所有奇数之和并打印结果。
    求出1到5之间所有偶数的个数并打印结果。
*/
public class t12 {
    public static void main(String[] args) {
        sum1_100_3();       //1到100之间不能被3整除的数字累加求和
        sum1_5_int();       //1到5之间所有整数之和
        sum1_5_odd();       //1到5之间所有奇数之和
        count_1_5_even();   //1到5之间所有偶数的个数
    }

    //将1到100之间不能被3整除的数字累加求和并打印结果。
    public static void sum1_100_3() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }

        System.out.println("1到100之间不能被3整除的数字累加求和：" + sum);
    }

    //求出1到5之间所有整数之和并打印结果。
    public static void sum1_5_int() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
                sum += i;
        }

        System.out.println("1到5之间所有整数之和：" + sum);
    }

    //求出1到5之间所有奇数之和并打印结果。
    public static void sum1_5_odd() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }

        System.out.println("1到5之间所有奇数之和：" + sum);
    }

    //求出1到5之间所有偶数的个数并打印结果。
    public static void count_1_5_even() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if(i % 2 == 0){
                sum++;
            }
        }

        System.out.println("1到5之间所有偶数的个数：" + sum);
    }
}