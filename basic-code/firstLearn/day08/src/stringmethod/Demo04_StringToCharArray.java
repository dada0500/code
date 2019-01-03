package stringmethod;

import java.util.Random;

public class Demo04_StringToCharArray {
    public static void main(String[] args) {
/*        String s = "itheima";

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("======================");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }*/

        System.out.println("======================");
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String n = "0123456789";
        char[] result = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            result[i] = s.charAt(r.nextInt(s.length()));
        }
        result[4] = n.charAt(r.nextInt(n.length()));
        String s5 = new String(result);
        System.out.println(s5);
    }
}
