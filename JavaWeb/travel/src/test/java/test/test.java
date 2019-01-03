package test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class test {

    @Test
    public void mailTest(){
        String code = "aaa";
        String msg = "<a href=\"http://localhost/travel?status=Y&code=" + code + ">点击激活黑马旅游网</a>";
        System.out.println (msg);

    }

    @Test
    public void testStr() throws UnsupportedEncodingException {
/*        String rname = "";
//        System.out.println (rname);
        rname = new String(rname.getBytes("iso-8859-1"),"utf-8");
        System.out.println (rname);

*//*        int arr[] = {};
        // 错: int [] arrs= new int[];
        int[]  arrc = new int[10];
        int [] arrd = new int[] {};*//*

    String s1 = new String("abc");
    String s2 = new String("abc");
        System.out.println (s1 == s2);
        System.out.println (s1.equals (s2));*/


/*        int a1[]={3,4,5};
        String a2[]={"string1","string1","string1"};
        byte a4[]={127,'c'};//查看ASCII编码表  52，99
        int ain4[]={1284,'c'};//查看ASCII编码表  52，99

        System.out.println ("a4： " + Arrays.toString (a4));*/

        ArrayList list = new ArrayList ();
        list.add ("a");
        list.add ("a1");;

        for (Object o : list) {
            System.out.println (o);
        }

        list.forEach (o -> System.out.println (o));

        Iterator iterator = list.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
    }
}
