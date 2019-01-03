package juan.java34JiChu.ti0831;

/*
    23、定义一个方法，功能是接收两个整数，并计算两数和，把结果返回。
    在main方法中调用该方法，并在控制台打印求和的结果。（有参数有返回值）
*/


public class t23 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a,b);
        System.out.println(a + "+" + b + "=" + sum);
    }

    public static int getSum(int a,int b){
        return a + b;
    }
}
