package cn.itcast.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_Date01 {
    public static void main (String[] args) throws ParseException {
        long now = System.currentTimeMillis ();

        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日");
        String nowDate = sdf.format (new Date ());


        String dayS = "2018年09月10日";
        Date date = sdf.parse (dayS);
        long borthTime = date.getTime ();

//        int day = (int) ((borthTime - now) / 1000 / 60 / 60 / 24);
//        System.out.println (dayS + " 与现在：" + nowDate + "相差：" + day + "天");
        System.out.println (dayS + " 与现在：" + nowDate + "相差：" + ((borthTime - now) / 1000 / 60 / 60 / 24) + "天");

    }
}
