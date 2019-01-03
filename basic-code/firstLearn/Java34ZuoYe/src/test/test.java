package test;

import java.util.Calendar;
import java.util.Date;

public class test extends Object{
//    final int u;
    public static void main (String[] args) {

        final int a;

   /*     System.out.println (System.currentTimeMillis ());
        Date date = new Date ();
        System.out.println (date);*/

        Calendar c = Calendar.getInstance ();
        System.out.println (c);
        int year = c.get(Calendar.YEAR); //year打印结果：2088
        System.out.println (year);
        c.set(Calendar.YEAR,9999);		//year: 9999
        int year2 = c.get(Calendar.YEAR); //year打印结果：2088
        System.out.println (year2);


        c.set(8888,9,8);	//同时设置年、月、日。8888年9月8日

        c.add(Calendar.YEAR,2);		//增加2年
        c.add(Calendar.MONTH,-3);	//减少3个月

        Date date = c.getTime();	//
        System.out.println (date);

        StringBuilder bu = new StringBuilder ();
        bu.append ("abc").append (1).append (1.8).append (true).append ("中");
        StringBuilder bu2 = bu.append ("a");
        System.out.println (bu == bu2);
        System.out.println (bu);
        System.out.println (bu2);

        Integer in3 = Integer.valueOf('a');
        System.out.println (in3);

        //基本类型  ->  字符串（String）
        int i1 = 100;

        String s1 = i1 + "";
        System.out.println (s1 + 200);  //100200

        String s2 = String.valueOf (100);
        System.out.println (s2 + 200);  //100200

        String s3 = String.valueOf (100);
        System.out.println (s3 + 200);  //100200

        //字符串（String） ->  基本类型
        int num = Integer.parseInt ("100");
        System.out.println (num - 10);  //90
/*        String ss = new String ("wy");
        String[] sa = new String[]{};
        String s = "wy";
        System.out.println (s == ss);*/

/*
        String s = "wy";
        String s2 = s;
        String w = "w";
        String s3 = w + "y";
        String s4 = "w" + "y";
        System.out.println (s == s2);
        System.out.println (s.equals (s2));
        System.out.println (s == s3);
        System.out.println (s.equals (s3));
        System.out.println (s == s4);
        System.out.println (s.equals (s4));
*/

       /* if(s instanceof s2){

        }*/
    }
}
