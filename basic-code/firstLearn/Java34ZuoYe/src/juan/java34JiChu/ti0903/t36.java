package juan.java34JiChu.ti0903;

import java.util.Scanner;

public class t36 {
    public static void main(String[] args) {
//        int num = 123;  // !
//        int num = 12345;  // !
//        int num = -125;  // !
//        int num = -12345;  // !
//        int num = 6789;  //1234,  4321
//        int num = 2345;  //7890,  0987
//        int num = 4567;  //9012,  2109
        int num = -4567;  //9012,  -2109
        encryption(num);
    }

    public static void encryption(int n){
        int num = n;
        if( num <= 0 ){
            if( num / 1000 > -1 || num / 1000 < -9 ){
                System.out.println("非四位数！");
                return;
            }else {
                num = -num;
            }
        }else if( num / 1000 > 9 || num / 1000 < 1 ){
                System.out.println("非四位数！");
                return;
        }
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;

        //每位数字都加上5,然后除以10的余数代替该数字
        ge = (ge + 5) % 10;
        shi = (shi + 5) % 10;
        bai = (bai + 5) % 10;
        qian = (qian + 5) % 10;


        //再将第一位和第四位交换,第二位和第三位交换 后输出
        if(n < 0){
            System.out.println(n + "加密后的数字是：-" + ge + shi + bai + qian);
        }else {
            System.out.println(n + "加密后的数字是：" + ge + shi + bai + qian);
        }
    }
}
