package juan.java34JiChu.ti0831;

/*
24、定义一个方法，功能是接收3个整数，求出三数中的最大值，并把结果返回。
    在main方法中调用该方法，并在控制台打印出最大值。（有参数有返回值）
*/

public class t24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        int max = getMax(a,b,c);
        System.out.println(max);
    }

    public static int getMax(int a,int b,int c){
            int max;
            max = a > b ? a : b;
            max = max > c ? max : c;
            return max;
    }
}
