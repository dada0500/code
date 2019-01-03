package ti0908;

import java.util.Arrays;

public class T66 {
    public static void main(String[] args) {
        String[] strArr = {"12ab","java","45Cd","Server78"};

        //遍历并判断字符串是以数字开头或结尾，就将该字符串中包含的小写字符串转换成大写字符串，并在控制台打印输出
        for (int i = 0; i < strArr.length; i++) {
            char first = strArr[i].charAt(0);
            char end = strArr[i].charAt(strArr[i].length() - 1);
            if((  first >= '0' && first <= '9') || (  end >= '0' && end <= '9') ){
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(strArr));
    }
}
