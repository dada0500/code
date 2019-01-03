package com.heima.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public class J {

    public static void t1 (){
        Collection<String> coll = new ArrayList<String> ();
        coll.add("java");
        coll.add("javab");
        coll.add("hello");
        coll.add("world");
//        System.out.println(coll.remove("java"));
//        coll.remove("java");
        for (String s : coll) {
//            System.out.println (coll.remove ("hello"));
            if("hello".equals (s))
            coll.remove ("hello");
            System.out.println (s);
        }
//        System.out.println (coll);
    }

    @Test
    public void t2(){
        HashSet<String> set = new HashSet<String>();
        set.add("aba");
        set.add("bbc");
        set.add("cac");
        set.add("dba");
        set.add("eba");
        for (String s : set) {
            System.out.println (s);
        }
    }

    @Test
    public void t3(){


    }
}
