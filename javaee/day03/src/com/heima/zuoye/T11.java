package com.heima.zuoye;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class T11 {
   /* 练习十一：LinkedHashSet的使用
    十一、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
*/
   public static void main (String[] args) {
       System.out.println ("请输入字符串：");
       String str = new Scanner (System.in).nextLine ();

       char[] chars = str.toCharArray ();
       LinkedHashSet<Character> lhs = new LinkedHashSet<> ();

       for (char c : chars) {
           if( lhs.add (c) )
           System.out.print(c);
       }

   }
}
