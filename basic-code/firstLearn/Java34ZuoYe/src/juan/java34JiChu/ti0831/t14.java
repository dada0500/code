package juan.java34JiChu.ti0831;

/*
* 14、
*   获取1~20之间（包含1和20）个位数为3的倍数的“数字”，
*  并在控制台打印输出所有“数字”和“数字的个数”(本试题中0视为3的倍数)。
*   PS：不能用主观判断去实现题目，
    如【if(num == 0 || num == 3 || num == 6 ……)】这样的代码是不符合题目要求的。
*/

public class t14 {
    public static void main(String[] args) {
        System.out.println("1~20之间个位数为3的倍数的数字有：");
        printNum();
    }

    //获取1~20之间（包含1和20）个位数为3的倍数的“数字”,
    // 并在控制台打印输出所有“数字”和“数字的个数”(本试题中0视为3的倍数)。
    public static void printNum(){
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if(i % 10 % 3 == 0){
                System.out.print(i + "\t");
                sum++;
            }
        }
        System.out.print("\r\n个数：" + sum);
    }
}
