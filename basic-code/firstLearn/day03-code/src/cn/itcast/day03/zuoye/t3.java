package cn.itcast.day03.zuoye;

public class t3 {
    //打印1到100内的整数，但数字中包含9的要跳过
    //每行输出5个满足条件的数，之间用空格分隔
    public static void main(String[] args) {

        int j = 0;  //计数 输出了的数字个数

        for(int i = 1; i <= 100 ; i++ ){

            //选出包含9的数字
                if (i / 10 == 9 || i % 10 == 9){
                    continue;
                }
            //每打印五个数字，换行一次
            if (j != 0 && j % 5 == 0){
                System.out.println();
            }
            System.out.print(i + " ");
            j++;
        }

    }
}
