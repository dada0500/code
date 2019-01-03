package com.heima.zuoye;
/*
练习三:递归的使用(二)
        描述:猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
*/

public class Test3 {
    public static void main (String[] args) {
        int num = getNum (1);
        System.out.println (num);
        num = getNum2 (1);
        System.out.println (num);
    }

    public static int getNum (int day) {
/*        day = (day - 1) - (day - 1)/2 + 1;

            = day - 1 - 2*day - 2 + 1;
            = -2 - day;

            day10peach = day09peach -  (day09peach/2 + 1);
            day10peach = day09peach/2 - 1;
            day09peach = 2 * (day10peach + 1);*/
        if(day == 10){
            return  1;
        }
        return  2 * (getNum (day + 1) + 1);
    }
    public static int getNum2 (int day) {
//            day09peach = 2 * (day10peach + 1);
        int sum = 0;
        if(day == 10){
            sum = 1;
        }else {
            sum = 2 * (getNum (day + 1) + 1);
        }
        return sum;
    }
}
