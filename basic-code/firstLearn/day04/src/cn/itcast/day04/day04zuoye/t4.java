package cn.itcast.day04.day04zuoye;


/*
第四题：分析以下需求并实现
        1.定义方法，求出长方形的周长
        2.调用方法，输出结果
*/

public class t4 {
    public static void main(String[] args) {
        double x = 10;
        double y = 20;

        double z = perimeter(x, y);
        System.out.println(z);
    }

    //定义求长方形周长的方法
    //  返回值类型：int
    //  参数列表：  int x,int y
    public static double perimeter(double x,double y){
        return 2 * (x + y);
    }
}