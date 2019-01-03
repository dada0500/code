package cn.itcast.zuoye;

import java.io.IOException;

public class T11test {
    public static void main(String[] args) throws IOException, Exception {
        SBTest();
    }

    public static void SBTest() {
        //定义由7、8、9组成的字符串
        String s = "789";
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //采用嵌套for循环，遍历字符串
        for (int i = 0; i < 3; i++) {
            //遍历字符串s，把字符依次添加到StringBuilder内，组成一个元素
            for (int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
            //当StringBuilder内元素为一个和两个时，需要加空格来隔开元素
            if (i != 2) {
                sb.append(" ");
            }
            //把字符串s的第一个元素切割，添加到字符串末位，组成新的字符串
            s = s.substring(1).concat(s.substring(0, 1));
        }
        // 把StringBuilder内元素反转，组成新的数字
        s = sb.toString() + " " + sb.reverse().toString();
        System.out.println(s);
    }

}
