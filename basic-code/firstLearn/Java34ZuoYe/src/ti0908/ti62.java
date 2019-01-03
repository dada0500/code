package ti0908;

import java.util.Arrays;

public class ti62 {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        strArr[0] = "abc";
        strArr[1] = "def";
        strArr[2] = "ghi";

        System.out.println(Arrays.toString(strArr));
        //先定义大字符串为空
        String bigStr = "";
        for (int i = 0; i < strArr.length; i++) {
            bigStr += strArr[i];
        }
        System.out.println(bigStr);
    }
}
