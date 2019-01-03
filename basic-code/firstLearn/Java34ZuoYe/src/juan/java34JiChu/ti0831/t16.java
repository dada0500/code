package juan.java34JiChu.ti0831;

/*
16、main方法中定义3个变量：int a = 5, b = 3, c = 8;并依次完成以下
        1).利用if语句求出a、b、c中最大的数并打印到控制台上；
        2).利用三元运算符求出a、b、c中最小的数并打印到控制台上；
*/



public class t16 {
    public static void main(String[] args) {
        int a = 5,b = 3,c = 8;
        maxIf(a,b,c);//if语句求出a、b、c中最大的数
        min(a,b,c);//三元运算符求出a、b、c中最小的数
    }

    //  1).利用if语句求出a、b、c中最大的数并打印到控制台上；
    public static void maxIf(int a,int b,int c){
        int max;

        if(a > b){
            max = a;
        }else{
            max = b;
        }

        if(max < c){
            max = c;
        }

        System.out.println("最大的数：" + max);
    }

    //  2).利用三元运算符求出a、b、c中最小的数并打印到控制台上；
    public static void min(int a,int b,int c){
        int min;
        min = a < b ? a : b;
        min = min < c ? min : c;

        System.out.println("最小的数：" + min);
    }

}
