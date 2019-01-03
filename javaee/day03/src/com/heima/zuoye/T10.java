package com.heima.zuoye;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class T10 {

 /*   练习十：LinkedList使用
    十、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
    将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。*/
     public static void main (String[] args) {
//         String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
         String[] strs = {"67891","12345","67891","67891","987","67891","67891","135","67891"};
         LinkedList<String> link = new LinkedList<> ();

/*         for (int i = 0; i < strs.length; i++) {
             if(!link.contains(strs[i])){
                 link.add (strs[i]);
             }
         }*/

         Collections.addAll (link,strs);

/*         for (String s : link) {
             while (link.indexOf (s) != link.lastIndexOf (s)){
//                 link.removeLastOccurrence (s); //ConcurrentModificationException 并发修改异常
             }
         }*/

         Iterator<String> linkit = link.iterator ();
         while (linkit.hasNext ()){
             String s = linkit.next ();
             if(link.indexOf (s) != link.lastIndexOf (s)){
                 linkit.remove ();
             }
         }

         System.out.println (link);
/*         System.out.println (link.size ());

         for (int i = 0; i < link.size (); i++) {
             System.out.println (link.get (i));
         }*/
     }
}
