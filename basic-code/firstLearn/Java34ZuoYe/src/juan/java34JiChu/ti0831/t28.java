package juan.java34JiChu.ti0831;


/*
28、分析以下需求，并用代码实现
        1.定义一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
        2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        3.在main方法中打印该数字是几位数
        4.演示格式如下:
        (1)演示一:
        请输入一个整数:1234
        控制台输出:1234是4位数字
        (2)演示二:
        请输入一个整数:-34567
        控制台输出:-34567是5位数字
*/


public class t28 {
    public static void main(String[] args) {
        int a = 13500;
        int wei = nNum(a);
        System.out.println(a + "是" + wei + "位数字");
    }

    public static int nNum(int n){
        int num = 1;
        int m = n / 10;
        while( m != 0){
            num++;
            m /= 10;
        }
        return num;
    }
}
