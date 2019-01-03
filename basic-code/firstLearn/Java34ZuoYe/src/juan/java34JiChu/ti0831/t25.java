package juan.java34JiChu.ti0831;

/*
    25、定义一个方法，该方法可以求出1到100之间所有偶数之和，并将和返回。
        在main方法中调用该方法，并在控制台打印出结果。
*/
public class t25 {
    public static void main(String[] args) {
        int sum = sumEven();
        System.out.println("1到100之间所有偶数之和：" + sum);

    }

    //求出1到100之间所有偶数之和并打印结果。
    public static int sumEven() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }

        return sum;
    }
}
