package juan.java34JiChu.ti0831;

/*
15、统计并获取10-100之间(包含10和100)个位与十位都为奇数的数字，
    并将数字和个数都打印到控制台上。
PS：需要先获取到范围内每个数字个位和十位上的数，在按照条件进行判断。


*/

public class t15 {
    public static void main(String[] args) {
        print();
    }

    //获取数字的个位
    public static int ge(int a){
        return a % 10;
    }

    //获取数字的十位
    public static int shi(int a){
        return a / 10 % 10;
    }

    //统计并获取10-100之间(包含10和100)个位与十位都为奇数的数字，
    //    并将数字和个数都打印到控制台上。
    public static void print(){
        System.out.println("10-100之间(包含10和100)个位与十位都为奇数的数字：");
        int sum = 0;

        for (int i = 10; i <= 100; i++) {
            int ge = ge(i);
            int shi = shi(i);
            if( ge % 2 != 0  && shi % 2 != 0){
                System.out.print(i+" ");
                sum++;
            }
        }

        System.out.println();
        System.out.print("总个数：" + sum);
    }
}
