package com.heima.collection.Demo2_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2_Collection {
    public static void main (String[] args) {
        Collection<String> c = new ArrayList<> ();
        c.add ("张三");
        c.add ("李四");
        c.add ("王五");

//        Iterator<String> it = c.iterator ();
        Iterator it = c.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next ());
        }
    }
}
