package juan.java34JiChu.ti0831;


/*
17、分析以下需求，并用代码实现：
        1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资自己定义
        2.涨工资的条件如下：
            [10-15)     +5000
            [5-10)      +2500
            [3~5)       +1000
            [1~3)       +500
            [0~1)       +200
        3.如果定义的工龄为10，基本工资为3000，
        程序运行后打印格式"您目前工作了10年，基本工资为 3000元,
         应涨工资 5000元,涨后工资 8000元"
*/


public class t17 {
    public static void main(String[] args) {
        int year = 1011;
        int basic = 3000;
        int zhangNum = zhang(year);
        int zhangBasic = basic + zhangNum;
        System.out.println("您目前工作了：" + year + "年，基本工资为：" + basic + "元，应涨工资：" + zhangNum + "元，涨后工资：" + zhangBasic + "元");
    }

    //定义 根据工龄 涨工资 的方法
    //返回值类型    int  ，      涨多少工资
    //参数列表      int year,    工龄
    public static int zhang(int year){
        int zhangNum = -0;

        if(year >= 10 && year < 15){
            zhangNum = 5000;
        }else if(year >= 5 && year < 10){
            zhangNum = 2500;
        }else if(year >= 3 && year < 5){
            zhangNum = 1000;
        }else if(year >= 1 && year < 3){
            zhangNum = 500;
        }else if(year >= 0 && year < 1){
            zhangNum = 200;
        }else {
            System.out.println("year错误");
            System.exit(0);
        }

        return zhangNum;
    }
}