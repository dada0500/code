package juan.java34JiChu.ti0831;


/*
18、分析以下需求，并用代码实现：
        1.按照从大到小的顺序输出四位数中的
        个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数，
        要求每行输出5个满足条件的数，之间用空格分隔
*/


public class t18 {
    public static void main(String[] args) {
        print();
    }

/*    按照从大到小的顺序输出四位数中的
    个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数，
       要求每行输出5个满足条件的数，之间用空格分隔


*/
    public static void print(){
        int sum = 0;
        for (int i = 9999; i >= 1000; i--) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            if( ge + bai == shi + qian ){
                System.out.print(i + "  ");
                sum++;
                if(sum % 5 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("个数：" + sum);
    }

}
