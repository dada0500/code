package com.heima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T1_nullLength {
    public static void main (String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = format.parse("2018-05-03");
            System.out.println("程序正常");
            System.out.println (date);
        } catch (ParseException e) {
            System.out.println("程序异常");
        }

    }
}
