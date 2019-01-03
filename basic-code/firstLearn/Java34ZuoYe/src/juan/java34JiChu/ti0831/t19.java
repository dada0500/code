package juan.java34JiChu.ti0831;

/*
    19、定义一个方法，功能是计算1到100所有整数和，并打印输出。
        在main方法中调用该方法。（无参数无返回值）
*/

public class t19 {
    public static void main(String[] args) {
        print();
    }

    //计算1到100所有整数和，并打印输出
    public static void print(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1到100所有整数和:" + sum);
    }
}
