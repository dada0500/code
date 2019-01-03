package cn.itcast.day03.zuoye;

/*
    使用嵌套循环完成99乘法表的打印
        1*1=1
        1*2=2	2*2=4
        1*3=3	2*3=6	3*3=9
        ...
*/

public class t5 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){
//                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print(j + "*" + i + "=" + i*j);
                if (j != i){
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}
