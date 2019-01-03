package work.CollectionAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;

public class LinkedHashMap01 {
    public static void main (String[] args) {
//        LinkedHashMap<Object, Object> lhm = new LinkedHashMap<> ();
        HashMap<String, Integer> lhm = new HashMap<> ();
        lhm.put ("张三",18);
        lhm.put ("李四",19);
        lhm.put ("王王",20);
        lhm.put ("赵六",21);

        lhm.forEach (LinkedHashMap01::accept);

        System.out.println (lhm);
        System.out.println (lhm.getOrDefault ("王t",99));
        Integer dd = lhm.merge ("张三", 28, Comparable::compareTo);
        System.out.println (dd);
        System.out.println (lhm);

    }

    private static void accept (String a, Integer b) {
        System.out.print (a + "-" + b + " ");
        System.out.println ();
    }
}
