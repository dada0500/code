package zuoye;

/*
第一题：练习今日的代码

        第二题：分析以下需求，并用代码实现
        1.键盘录入一个大字符串,再录入一个小字符串
        2.统计小字符串在大字符串中出现的次数
        3.代码运行打印格式:
        请输入大字符串:waoiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
        请输入小字符串:heima


        控制台输出:共出现3次
*/


import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入大字符串：");
        String big = sc.next();
        System.out.println("输入小字符串：");
        String small = sc.next();

        int count = 0;  // 定义count变量记录出现的次数
        for (int i = 0; i < big.length(); i++) {
            System.out.println("i的值：" + i + "  big.indexOf(small, i)返回值：" + big.indexOf(small, i));
            if(big.indexOf(small, i) > 0){
                i = big.indexOf(small, i);
                count++;
            }else {
                break;
            }
        }
        System.out.println("共出现" + count + "次");
    }
}
