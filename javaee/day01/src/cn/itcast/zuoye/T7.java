package cn.itcast.zuoye;

import java.util.Calendar;

/*
练习七：Calendar类方法的使用
        七、用程序判断2018年2月14日是星期几。
*/


public class T7 {
    public static void main (String[] args) {
        Calendar c = Calendar.getInstance ();
        c.set (2018, 2 - 1, 14);
        int year = c.get (Calendar.YEAR);
        int month = c.get (Calendar.MONTH) + 1;
        int day = c.get (Calendar.DATE);

        char[] week = {' ', '日', '一', '二', '三', '四', '五', '六'};
        int i = c.get (Calendar.DAY_OF_WEEK);

        System.out.println (year + "年" + month + "月" + day + "日" + "是星期" + week[i]);
    }
}
