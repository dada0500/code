package cn.itcast.day04.day04zuoye;

/*

第三题：分析以下需求并实现
        1.定义方法，求出两个小数的和
        2.调用方法，输出结果
*/

public class t3 {
    public static void main(String[] args) {
        double a = 2.56;
        double b = 3.56;
        getSum(a,b);    //调用方法，输出结果
    }

    //定义方法，求出两个小数的和
    public static void getSum(double a, double b){
        System.out.println(a + b);
    }

}
