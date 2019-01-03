package cn.itcast.day04.day04zuoye;

/*
    第五题：分析以下需求并实现
        1.定义方法，求出长方形的面积
        2.调用方法，输出结果
*/


public class t5 {
    public static void main(String[] args) {
        double x = 2.2;
        double y = 3;

        //调用getArea打印出面积
        System.out.println(getArea(x,y));
    }

    //定义求长方形面积的方法
    //返回值类型 double
    //参数列表   double x 长，double y 宽
    public static double getArea(double x,double y) {
        return x * y;
    }
}
