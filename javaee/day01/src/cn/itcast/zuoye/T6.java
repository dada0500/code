package cn.itcast.zuoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
练习六：DateFormat类方法的使用
        六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。

*/

public class T6 {
    public static void main (String[] args) throws ParseException {
        String s = "2018-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat ("yyyy年MM月dd日");

        Date sDate = sdf.parse (s);
        String sFormat = sdf2.format (sDate);

        System.out.println (sFormat);
    }
}