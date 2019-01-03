package com.heima;

import java.util.ArrayList;
import java.util.Scanner;

/*
2.	描述：（代码实现）
        编写程序，获取命令行参数中的字符串列表，输出其中重复的字符、不重复的字符以及消除重复以后的字符列表。
*/
public class T2 {
    public static void main (String[] args) {
        String str = "aabcdeeeeebaaaaa";
        char[] chars = str.toCharArray ();

        ArrayList<Character> repeat = new ArrayList<> ();   //重复的字符
        ArrayList<Character> noRepeat = new ArrayList<> (); //不重复的字符
        String lastStr = "";

        for (int i = 0; i < chars.length; i++) {
            if(str.indexOf (chars[i],str.indexOf (chars[i]) + 1) != -1 ){
                repeat.add (chars[i]);
                lastStr += chars[i];
                str = str.replace (String.valueOf (chars[i]), "");
                chars = str.toCharArray ();
                i--;
            }else {
                noRepeat.add (chars[i]);
                lastStr += chars[i];
            }
//            lastStr += chars[i];
        }
        System.out.println ("重复的字符" + repeat);
        System.out.println ("不重复的字符" + noRepeat);
        System.out.println ("消除重复后：" + lastStr);
//        System.out.println (str);
    }

/* //错误aabcdee，跳过b
   public static void cmdLine () {
    String str = "aabcdeeeeebaaaaa";
        char[] chars = str.toCharArray ();

        ArrayList<Character> repeat = new ArrayList<> ();   //重复的字符
        ArrayList<Character> noRepeat = new ArrayList<> (); //不重复的字符

        for (int i = 0; i < chars.length; i++) {
            if(str.indexOf (chars[i],str.indexOf (chars[i]) + 1) != -1 ){
                repeat.add (chars[i]);
                str = str.replace (String.valueOf (chars[i]), "");
//                chars = str.toCharArray ();
            }else {
                noRepeat.add (chars[i]);
            }
        }
        System.out.println ("重复的字符" + repeat);
        System.out.println ("不重复的字符" + noRepeat);
        System.out.println ("消除重复后：" + str);
    }*/
}
