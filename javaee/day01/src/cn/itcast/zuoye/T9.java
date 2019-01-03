package cn.itcast.zuoye;


/*
九、请使用代码实现
        分别使用String的+=和StringBuilder的append方法对字符串做100000次拼接，计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。

*/

public class T9 {
    public static void main (String[] args) {
        String s = "1";

        long start = System.currentTimeMillis ();
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis ();
        System.out.println ("String += 100000次所花时间：" + (end - start));

        StringBuilder sb = new StringBuilder (1);
        start = System.currentTimeMillis ();
        for (int i = 0; i < 100000; i++) {
            sb.append (i);
        }
        end = System.currentTimeMillis ();
        System.out.println ("sb.append() 100000次所花时间：" + (end - start));



    }
}
