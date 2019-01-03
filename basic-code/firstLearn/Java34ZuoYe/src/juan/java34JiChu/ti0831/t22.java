package juan.java34JiChu.ti0831;

/*
    22、定义一个方法,可以接收1个整数n，
        在方法内循环打印n次“传智播客”。
           在main方法中调用该方法。（有参数无返回值）
*/

public class t22 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("传智播客");
        }
    }
}