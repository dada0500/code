package ti0908;

import java.util.Arrays;

public class T65 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] charArr = getCharArray(str);
        System.out.println(Arrays.toString(charArr));
    }

    public static char[] getCharArray(String str){
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
}
