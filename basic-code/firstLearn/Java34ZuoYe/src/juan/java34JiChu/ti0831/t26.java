package juan.java34JiChu.ti0831;

/*
26、定义一个方法fun1，该方法可以求出1到100之间所有奇数的个数，并将个数返回。
    定义一个方法fun2,可以接收一个整数x，在方法内循环打印出1到x之间所有的偶数。
    在main方法中调用fun1()，得到结果，赋值给一个变量int count，
    继续调用fun2(),将count作为参数进行传递。
*/


public class t26 {
    public static void main(String[] args) {
        int count = fun1();
        fun2(count);
    }


    //1到100之间所有奇数的个数
    public static int fun1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                sum++;
            }
        }
        return sum;
    }

    //收一个整数x，在方法内循环打印出1到x之间所有的偶数
    public static void fun2(int x){
        for (int i = 1; i <= x; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");;
            }
        }
    }

}
