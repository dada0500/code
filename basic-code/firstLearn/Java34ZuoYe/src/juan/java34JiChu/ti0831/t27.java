package juan.java34JiChu.ti0831;

/*
27、a、定义方法public static boolean isSXH(int num)，
        功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false。
        在main方法中调用该方法，传入数字153，打印结果。
        (所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。)
    b、在main方法中，求出100到999之间所有的水仙花数字
        （可以借助上一步中的方法进行判断），并每2个一行打印到控制台。
         最后打印出水仙花的总个数。
*/



public class t27 {
    public static void main(String[] args) {
        System.out.println(isSXH(153));
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            if(isSXH(i)){
                System.out.print(i + " ");
                sum ++;
                if(sum % 2 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("100到999之间所有的水仙花数字的总个数是：" + sum);
    }

    public static boolean isSXH(int num){
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        if( ge * ge * ge + shi * shi * shi + bai * bai * bai  ==  num){
            return true;
        }else {
            return false;
        }
    }

}
