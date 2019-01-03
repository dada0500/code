package cn.itcast.day04.day04zuoye;

/*
第二题：分析以下需求并实现
        1.定义方法，求出两个整数的和
        2.调用方法，输出结果
*/

public class t2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        getSum(a,b);    //调用getSum()方法，输出结果
    }

    /*
         定义方法，求出两个整数的和

         1，返回值类型  ->  void
         2，参数列表    ->  int a,int b
    */
    public static void getSum(int a,int b){
        System.out.println(a + b);
    }
}
