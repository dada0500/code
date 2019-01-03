package stringmethod;

import java.util.Scanner;

public class Test1_String {
    public static void main(String[] args) {
        //定义四个计数变量
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        //录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String input = sc.next();

        //字符串分解成单个字符
        char[] inC = input.toCharArray();
        //逐一查看字符，计数各类型字符
        for (int i = 0; i < inC.length; i++) {
            if(inC[i] >= 'A' && inC[i] <= 'Z'){
                bigCount++;
            }else if(inC[i] >= 'a' && inC[i] <= 'z'){
                smallCount++;
            }else if(inC[i] >= '0' && inC[i] <= '9'){
                numCount++;
            }else {
                otherCount++;
            }
        }

        System.out.println("大写字母：" + bigCount);
        System.out.println("小写字母：" + smallCount);
        System.out.println("数字：" + numCount);
        System.out.println("其他：" + otherCount);
    }
}
