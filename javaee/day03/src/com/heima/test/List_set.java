package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class List_set implements Comparable<List_set> {
    public static void main (String[] args) {
        HashSet<Integer> set  = new HashSet<Integer> ();
        set.add (3);
        set.add (1);
        set.add (2);
        set.add (4);
        set.add (5);
        System.out.println (set);
        ArrayList<Integer> list  = new ArrayList<Integer> ();
        list.add (3);
        list.add (1);
        list.add (2);
        list.add (4);
        list.add (5);
        System.out.println (list);

//        Collections.shuffle (set);
        Collections.sort (list);


    }

    @Override
    public int compareTo (List_set o) {
        return 0;
    }
}
