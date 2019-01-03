package juan.java34JiChu.ti0831;


/*
21、定义一个方法，它可以统计1到100之间不能被3整除的数字的个数，
    并把个数返回。在main方法中调用该方法，并打印出结果。（无参数有返回值）
*/

public class t21 {
    public static void main(String[] args) {
        int sum = print();
        System.out.println("1到100之间不能被3整除的数字的个数：" + sum);
    }

    public static int print(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 != 0){
                sum++;
            }
        }
        return sum;
    }
}
