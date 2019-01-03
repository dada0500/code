package ti0908;

//67、提示用户键盘输入一个字符串asdf，将字符串的字符按以下格式反向打印输出 [f,d,s,a]

import java.util.Scanner;

public class T67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        print(str);
    }

    public static void print(String str){
        char[] charArr = str.toCharArray();
        System.out.print("[");
        for (int i = charArr.length - 1; i > 0; i--) {
            System.out.print(charArr[i] + ", ");
        }
        System.out.println(charArr[0] + "]");
    }
}
