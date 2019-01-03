package cn.itcast.Demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_simpleDateFormat {
    public static void main (String[] args) {
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ();
        String dateStr = sdf.format (d);
        System.out.println (dateStr);


    }
}
