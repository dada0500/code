package juan.Java32jichu.T76;

import java.util.ArrayList;
import java.util.Random;

public class T76 {
    public static void main (String[] args) {
        String[] arr = {"a","s","d","f","a","d","2","3","8"};
        Random r = new Random ();
        String s = "";  //去重前随机生成的字符串
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt (arr.length);
            s += arr[index];
        }
        System.out.println ("随机生成的字符串：" + s);
        ArrayList<Integer> list = new ArrayList<>();    //存储重复字符的索引
/*        String endS = "";  //去重后的字符串
        for (int i = 0; i < s.length (); i++) {
            if(list.contains (i)){
                continue;
            }
            char ch = s.charAt (i);
            endS += ch;
            for (int j = i + 1; j < s.length (); j++) {
                if(ch == s.charAt (j)){
                    list.add (j);
                }
            }
        }

        System.out.println ("去重后的字符串：" + endS);*/

        String str = s;
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(str.charAt(i), i + 1);
            if (index > -1) {
                str = str.substring(0, index) + str.substring(index + 1);
                i--;
            }
        }
        System.out.println(str);

    }
}
