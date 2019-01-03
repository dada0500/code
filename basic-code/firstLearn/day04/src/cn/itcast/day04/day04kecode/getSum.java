package cn.itcast.day04.day04kecode;

public class getSum {
    public static void main(String[] args) {
        int n = 1;
        int m = 10;

        if(n < m) {
            getS(n, m);
        } else {
            System.out.println("数据错误");
        }
    }


    /*
    *   定义方法，求出n到m的和（累加思想）
    *
    *   1，返回值类型     -> void
    *   2， 参数列表      -> int n,int m
    */
    public static void getS(int n,int m){
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
