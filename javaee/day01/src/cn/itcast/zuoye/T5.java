package cn.itcast.zuoye;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
练习五：Date类的使用
        五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
*/


public class T5 {
    public static void main (String[] args) {
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

        String dFormat = sdf.format (d);
        System.out.println (dFormat);
    }
}
