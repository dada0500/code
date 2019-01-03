package cn.itcast.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo_birthday {
    public static void main (String[] args) throws ParseException {
        System.out.println ("请输入您的生日：");
        String birthday = new Scanner (System.in).nextLine ();

        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy年MM月dd日");
        /*try {
            Date birthdayDate = sdf.parse (birthday);
        } catch (ParseException e) {
            e.printStackTrace ();
        }*/

        Date birthdayDate = sdf.parse (birthday);

        Date nowDate = new Date ();

        long time = nowDate.getTime () - birthdayDate.getTime();

        System.out.println (time / 1000 / 60 / 60 /24);
    }
}
